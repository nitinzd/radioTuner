package com.example.radiotuner;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyRadioService extends Service {
@Override
public void onCreate() {
	super.onCreate();
}

@Override
public IBinder onBind(Intent intent) {
return mBinder;	
}

private final RadioService.Stub mBinder = new RadioService.Stub() {
	public boolean isServiceAvailable(String sName) {
	return false;			
	}
	
	public String linkAPI(String sApiName) {
		return "";
	}
};

/*
private final FmService.Stub mBinder = new FmService.Stub() {
	public int knob() {
		return 0;	
	}
	
	public int isSeekInProgress(int freq) {
		return 0;
	}
	
	public void setChannel(int freq) {
		
	}
};
*/
}
