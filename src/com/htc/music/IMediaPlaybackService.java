/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/sudarm/xp/code/android/iAndroidRemote/android/src/com/htc/music/IMediaPlaybackService.aidl
 */
package com.htc.music;
public interface IMediaPlaybackService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.htc.music.IMediaPlaybackService
{
private static final java.lang.String DESCRIPTOR = "com.htc.music.IMediaPlaybackService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.htc.music.IMediaPlaybackService interface,
 * generating a proxy if needed.
 */
public static com.htc.music.IMediaPlaybackService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.htc.music.IMediaPlaybackService))) {
return ((com.htc.music.IMediaPlaybackService)iin);
}
return new com.htc.music.IMediaPlaybackService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getSongInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getSongInfo(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_playAlbum:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.playAlbum(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_openfile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.openfile(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_openfileAsync:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.openfileAsync(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_open:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
int _arg1;
_arg1 = data.readInt();
this.open(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getQueuePosition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getQueuePosition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isPlaying:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPlaying();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_pause:
{
data.enforceInterface(DESCRIPTOR);
this.pause();
reply.writeNoException();
return true;
}
case TRANSACTION_play:
{
data.enforceInterface(DESCRIPTOR);
this.play();
reply.writeNoException();
return true;
}
case TRANSACTION_prev:
{
data.enforceInterface(DESCRIPTOR);
this.prev();
reply.writeNoException();
return true;
}
case TRANSACTION_next:
{
data.enforceInterface(DESCRIPTOR);
this.next();
reply.writeNoException();
return true;
}
case TRANSACTION_duration:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.duration();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_position:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.position();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_seek:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
long _result = this.seek(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getTrackName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getTrackName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAlbumName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getAlbumName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAlbumId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAlbumId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getArtistName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getArtistName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getArtistId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getArtistId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enqueue:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
int _arg1;
_arg1 = data.readInt();
this.enqueue(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getQueue:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getQueue();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_moveQueueItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.moveQueueItem(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setQueuePosition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setQueuePosition(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPath:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getPath();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getAudioId:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAudioId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setShuffleMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setShuffleMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getShuffleMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getShuffleMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeTracks:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.removeTracks(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_removeTrack:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.removeTrack(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setRepeatMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setRepeatMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRepeatMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getRepeatMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getMediaMountedCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getMediaMountedCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_startAnimation:
{
data.enforceInterface(DESCRIPTOR);
this.startAnimation();
reply.writeNoException();
return true;
}
case TRANSACTION_endAnimation:
{
data.enforceInterface(DESCRIPTOR);
this.endAnimation();
reply.writeNoException();
return true;
}
case TRANSACTION_setAlbumQueue:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
this.setAlbumQueue(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getAlbumQueue:
{
data.enforceInterface(DESCRIPTOR);
int[] _result = this.getAlbumQueue();
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getAlbumQueuePosition:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAlbumQueuePosition();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_activityGoSleep:
{
data.enforceInterface(DESCRIPTOR);
this.activityGoSleep();
reply.writeNoException();
return true;
}
case TRANSACTION_activityWakeup:
{
data.enforceInterface(DESCRIPTOR);
this.activityWakeup();
reply.writeNoException();
return true;
}
case TRANSACTION_getQueueSize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getQueueSize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAlbumQueueSize:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getAlbumQueueSize();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_prevAlbum:
{
data.enforceInterface(DESCRIPTOR);
this.prevAlbum();
reply.writeNoException();
return true;
}
case TRANSACTION_nextAlbum:
{
data.enforceInterface(DESCRIPTOR);
this.nextAlbum();
reply.writeNoException();
return true;
}
case TRANSACTION_isSystemReady:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSystemReady();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_reloadQueue:
{
data.enforceInterface(DESCRIPTOR);
this.reloadQueue();
reply.writeNoException();
return true;
}
case TRANSACTION_setMediaMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setMediaMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_syncNowPlayingQueue:
{
data.enforceInterface(DESCRIPTOR);
int[] _arg0;
_arg0 = data.createIntArray();
this.syncNowPlayingQueue(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.htc.music.IMediaPlaybackService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public java.lang.String getSongInfo(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_getSongInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int playAlbum(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_playAlbum, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void openfile(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_openfile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void openfileAsync(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_openfileAsync, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void open(int[] list, int position) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(list);
_data.writeInt(position);
mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getQueuePosition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueuePosition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean isPlaying() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void play() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void prev() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_prev, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public long duration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_duration, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long position() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_position, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public long seek(long pos) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(pos);
mRemote.transact(Stub.TRANSACTION_seek, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getTrackName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTrackName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getAlbumName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getAlbumId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getArtistName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getArtistId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getArtistId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void enqueue(int[] list, int action) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(list);
_data.writeInt(action);
mRemote.transact(Stub.TRANSACTION_enqueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int[] getQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueue, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void moveQueueItem(int from, int to) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(from);
_data.writeInt(to);
mRemote.transact(Stub.TRANSACTION_moveQueueItem, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setQueuePosition(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_setQueuePosition, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public java.lang.String getPath() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPath, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getAudioId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAudioId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setShuffleMode(int shufflemode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(shufflemode);
mRemote.transact(Stub.TRANSACTION_setShuffleMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getShuffleMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getShuffleMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int removeTracks(int first, int last) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(first);
_data.writeInt(last);
mRemote.transact(Stub.TRANSACTION_removeTracks, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int removeTrack(int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_removeTrack, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setRepeatMode(int repeatmode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(repeatmode);
mRemote.transact(Stub.TRANSACTION_setRepeatMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getRepeatMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRepeatMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getMediaMountedCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMediaMountedCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void startAnimation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startAnimation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void endAnimation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endAnimation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setAlbumQueue(int[] list) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(list);
mRemote.transact(Stub.TRANSACTION_setAlbumQueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int[] getAlbumQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumQueue, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getAlbumQueuePosition() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumQueuePosition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void activityGoSleep() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_activityGoSleep, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void activityWakeup() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_activityWakeup, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getQueueSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getQueueSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getAlbumQueueSize() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAlbumQueueSize, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void prevAlbum() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_prevAlbum, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void nextAlbum() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_nextAlbum, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isSystemReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSystemReady, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void reloadQueue() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reloadQueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void setMediaMode(boolean mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((mode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setMediaMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void syncNowPlayingQueue(int[] list) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeIntArray(list);
mRemote.transact(Stub.TRANSACTION_syncNowPlayingQueue, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getSongInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_playAlbum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_openfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_openfileAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_prev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_duration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_position = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_seek = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getTrackName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getAlbumName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getAlbumId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getArtistName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_getArtistId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_enqueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_getQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_moveQueueItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_setShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_removeTracks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_removeTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_setRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_getMediaMountedCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_startAnimation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_endAnimation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_setAlbumQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_getAlbumQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getAlbumQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_activityGoSleep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_activityWakeup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getQueueSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getAlbumQueueSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_prevAlbum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_nextAlbum = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_isSystemReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_reloadQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_setMediaMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_syncNowPlayingQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
}
public java.lang.String getSongInfo(int id) throws android.os.RemoteException;
public int playAlbum(int id) throws android.os.RemoteException;
public void openfile(java.lang.String path) throws android.os.RemoteException;
public void openfileAsync(java.lang.String path) throws android.os.RemoteException;
public void open(int[] list, int position) throws android.os.RemoteException;
public int getQueuePosition() throws android.os.RemoteException;
public boolean isPlaying() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void pause() throws android.os.RemoteException;
public void play() throws android.os.RemoteException;
public void prev() throws android.os.RemoteException;
public void next() throws android.os.RemoteException;
public long duration() throws android.os.RemoteException;
public long position() throws android.os.RemoteException;
public long seek(long pos) throws android.os.RemoteException;
public java.lang.String getTrackName() throws android.os.RemoteException;
public java.lang.String getAlbumName() throws android.os.RemoteException;
public int getAlbumId() throws android.os.RemoteException;
public java.lang.String getArtistName() throws android.os.RemoteException;
public int getArtistId() throws android.os.RemoteException;
public void enqueue(int[] list, int action) throws android.os.RemoteException;
public int[] getQueue() throws android.os.RemoteException;
public void moveQueueItem(int from, int to) throws android.os.RemoteException;
public void setQueuePosition(int index) throws android.os.RemoteException;
public java.lang.String getPath() throws android.os.RemoteException;
public int getAudioId() throws android.os.RemoteException;
public void setShuffleMode(int shufflemode) throws android.os.RemoteException;
public int getShuffleMode() throws android.os.RemoteException;
public int removeTracks(int first, int last) throws android.os.RemoteException;
public int removeTrack(int id) throws android.os.RemoteException;
public void setRepeatMode(int repeatmode) throws android.os.RemoteException;
public int getRepeatMode() throws android.os.RemoteException;
public int getMediaMountedCount() throws android.os.RemoteException;
public void startAnimation() throws android.os.RemoteException;
public void endAnimation() throws android.os.RemoteException;
public void setAlbumQueue(int[] list) throws android.os.RemoteException;
public int[] getAlbumQueue() throws android.os.RemoteException;
public int getAlbumQueuePosition() throws android.os.RemoteException;
public void activityGoSleep() throws android.os.RemoteException;
public void activityWakeup() throws android.os.RemoteException;
public int getQueueSize() throws android.os.RemoteException;
public int getAlbumQueueSize() throws android.os.RemoteException;
public void prevAlbum() throws android.os.RemoteException;
public void nextAlbum() throws android.os.RemoteException;
public boolean isSystemReady() throws android.os.RemoteException;
public void reloadQueue() throws android.os.RemoteException;
public void setMediaMode(boolean mode) throws android.os.RemoteException;
public void syncNowPlayingQueue(int[] list) throws android.os.RemoteException;
}
