/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\android\\radioTuner\\src\\com\\example\\radiotuner\\RadioService.aidl
 */
package com.example.radiotuner;
public interface RadioService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.radiotuner.RadioService
{
private static final java.lang.String DESCRIPTOR = "com.example.radiotuner.RadioService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.radiotuner.RadioService interface,
 * generating a proxy if needed.
 */
public static com.example.radiotuner.RadioService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.radiotuner.RadioService))) {
return ((com.example.radiotuner.RadioService)iin);
}
return new com.example.radiotuner.RadioService.Stub.Proxy(obj);
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
case TRANSACTION_isServiceAvailable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isServiceAvailable(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_linkAPI:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.linkAPI(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.radiotuner.RadioService
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
// Will check whether service is available or not
// Return true if service available. Else false

@Override public boolean isServiceAvailable(java.lang.String sName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sName);
mRemote.transact(Stub.TRANSACTION_isServiceAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//Will connect to specified API
//It could be AM o		r FM
//Return response according to service

@Override public java.lang.String linkAPI(java.lang.String sApiName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sApiName);
mRemote.transact(Stub.TRANSACTION_linkAPI, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isServiceAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_linkAPI = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
// Will check whether service is available or not
// Return true if service available. Else false

public boolean isServiceAvailable(java.lang.String sName) throws android.os.RemoteException;
//Will connect to specified API
//It could be AM o		r FM
//Return response according to service

public java.lang.String linkAPI(java.lang.String sApiName) throws android.os.RemoteException;
}
