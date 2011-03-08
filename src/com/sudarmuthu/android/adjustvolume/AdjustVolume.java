/**
   AdjustVolume - Adjust the volume of your Android phone
    
   Copyright 2011  Sudar Muthu  (email : sudar@sudarmuthu.com)

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License, version 2, as
    published by the Free Software Foundation.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
*/

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
import android.widget.TextView;

/**
 * The Main activity
 * 
 * @author "Sudar Muthu (http://sudarmuthu.com)"
 *
 */
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
        
        Button currentTrack = (Button) findViewById(R.id.currentTrack);
        final TextView trackName = (TextView) findViewById(R.id.trackname);
        
        currentTrack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					trackName.setText(musicConn.getTrackName());
				} catch (RemoteException e) {
        			Log.i(TAG, "Error while getting current song");					
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
	}
	
	/**
	 * The service connection class that allows you to talk to the MediaPlayer Service
	 * 
	 * @author "Sudar Muthu (http://sudarmuthu.com)"
	 *
	 */
	private class MediaPlayerServiceConnection implements ServiceConnection {
    	public com.htc.music.IMediaPlaybackService mServiceHtc;
    	public com.android.music.IMediaPlaybackService mServiceAndroid;

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			Log.i("MediaPlayerServiceConnection", "Connected! Name: " + name.getClassName());

			// This is the important line where we bind the service
    		if (isHtc)
    			mServiceHtc = com.htc.music.IMediaPlaybackService.Stub.asInterface(service);
			else
				mServiceAndroid = com.android.music.IMediaPlaybackService.Stub.asInterface(service);
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
		
		/**
		 * Get the name of the current Trackname
		 * 
		 * @return
		 * @throws RemoteException
		 */
		public String getTrackName() throws RemoteException {
			if (isHtc) {
				return mServiceHtc.getTrackName();
			} else {
				return mServiceAndroid.getTrackName();				
			}
		}

		@Override		
		public void onServiceDisconnected(ComponentName name) {
			Log.i("MediaPlayerServiceConnection", "Disconnected!");
		}
	}	
}