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
}
}
}
