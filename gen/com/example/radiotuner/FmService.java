/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\android\\radioTuner\\src\\com\\example\\radiotuner\\FmService.aidl
 */
package com.example.radiotuner;
public interface FmService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.radiotuner.FmService
{
private static final java.lang.String DESCRIPTOR = "com.example.radiotuner.FmService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.radiotuner.FmService interface,
 * generating a proxy if needed.
 */
public static com.example.radiotuner.FmService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.radiotuner.FmService))) {
return ((com.example.radiotuner.FmService)iin);
}
return new com.example.radiotuner.FmService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
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
case TRANSACTION_knob:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.knob();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isSeekInProgress:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.isSeekInProgress(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setChannel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setChannel(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.radiotuner.FmService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public int knob() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_knob, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int isSeekInProgress(int freq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(freq);
mRemote.transact(Stub.TRANSACTION_isSeekInProgress, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setChannel(int freq) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(freq);
mRemote.transact(Stub.TRANSACTION_setChannel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_knob = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isSeekInProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public int knob() throws android.os.RemoteException;
public int isSeekInProgress(int freq) throws android.os.RemoteException;
public void setChannel(int freq) throws android.os.RemoteException;
}
