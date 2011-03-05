package com.sudarmuthu.android.adjustvolume;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AdjustVolume extends Activity {
	
    protected static final String TAG = "AdjustVolume";
	private boolean isHtc;
	private MediaPlayerServiceConnection musicConn;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
        
        Button upButton = (Button) findViewById(R.id.upButton);
        upButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "Up Button Clicked");
				audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
			}
		});
        
        Button downButton = (Button) findViewById(R.id.downButton);
        downButton.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		Log.d(TAG, "Down Button Clicked");
				audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);        		
        	}
        });
        
        Button nextButton = (Button) findViewById(R.id.nextTrack);
        nextButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
        		Log.d(TAG, "Next Button Clicked");
				try {
					musicConn.nextSong();
				} catch (RemoteException e) {
					Log.i(TAG, "Error while moving to next song");					
					e.printStackTrace();
				}
			}
		});
        
        Button prevButton = (Button) findViewById(R.id.prevTrack);
        prevButton.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		Log.d(TAG, "Prev Button Clicked");
        		try {
        			musicConn.prevSong();
        		} catch (RemoteException e) {
        			Log.i(TAG, "Error while moving to prev song");					
        			e.printStackTrace();
        		}
        	}
        });
    }
    
	@Override
	protected void onStart() {
		super.onStart();

		Intent i = new Intent();
		musicConn = new MediaPlayerServiceConnection();
		
		isHtc = true;
		i.setClassName("com.htc.music", "com.htc.music.MediaPlaybackService");
		
        if (!this.bindService(i, musicConn, Context.MODE_PRIVATE)) {
        	isHtc = false;
            i.setClassName("com.android.music", "com.android.music.MediaPlaybackService");
            this.bindService(i, musicConn, Context.MODE_PRIVATE);
        }
		
		Log.d(TAG, "Binded Service");
	}


	@Override
	protected void onStop() {
		super.onStop();
		
		// if you connect in onStart() you must not forget to disconnect when your app is closed
//		Amarino.disconnect(this, DEVICE_ADDRESS);
//		
		// do never forget to unregister a registered receiver
//		unregisterReceiver(arduinoReceiver);
	}
	
	private class MediaPlayerServiceConnection implements ServiceConnection {
    	public com.htc.music.IMediaPlaybackService mServiceHtc;
    	public com.android.music.IMediaPlaybackService mServiceAndroid;

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			Log.i("MediaPlayerServiceConnection", "Connected! Name: " + name.getClassName());

			// This is the important line
    		if (isHtc)
    			mServiceHtc = com.htc.music.IMediaPlaybackService.Stub.asInterface(service);
			else
				mServiceAndroid = com.android.music.IMediaPlaybackService.Stub.asInterface(service);
			
			// If all went well, now we can use the interface
//			try {
//				
//				if (isHtc) {
//					
//					Log.i("MediaPlayerServiceConnection", "Playing track: " + mServiceHtc.getTrackName());
//					Log.i("MediaPlayerServiceConnection", "By artist: " + mServiceHtc.getArtistName());
//					if (mServiceHtc.isPlaying()) {
//						Log.i("MediaPlayerServiceConnection", "Music player is playing.");
//						// Next Track
//						mServiceHtc.next();
//					} else {
//						Log.i("MediaPlayerServiceConnection", "Music player is not playing.");
//					}
//				} else {
//					
//					Log.i("MediaPlayerServiceConnection", "Playing track: " + mServiceAndroid.getTrackName());
//					Log.i("MediaPlayerServiceConnection", "By artist: " + mServiceAndroid.getArtistName());
//					if (mServiceAndroid.isPlaying()) {
//						Log.i("MediaPlayerServiceConnection", "Music player is playing.");
//					} else {
//						Log.i("MediaPlayerServiceConnection", "Music player is not playing.");
//					}
//				}
//			} catch (Exception e) {
//				Log.i("MediaPlayerServiceConnection", "Some Exception");
//	    		e.printStackTrace();
//	    		throw new RuntimeException(e);
//			}
		}

		/**
		 * Selects the next song
		 * 
		 * @throws RemoteException 
		 * 
		 */
		public void nextSong() throws RemoteException {
			if (isHtc) {
				mServiceHtc.next();
			} else {
				mServiceAndroid.next();
			}
		}
		
		/**
		 * Selects the Previous song
		 * 
		 * @throws RemoteException
		 */
		public void prevSong() throws RemoteException {
			if (isHtc) {
				mServiceHtc.prev();
			} else {
				mServiceAndroid.prev();
			}
		}

		@Override		
		public void onServiceDisconnected(ComponentName name) {
			Log.i("MediaPlayerServiceConnection", "Disconnected!");
		}
	}	
}