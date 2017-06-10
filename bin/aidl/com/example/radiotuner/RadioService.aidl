package com.example.radiotuner;

interface RadioService {	
// Will check whether service is available or not
// Return true if service available. Else false
boolean isServiceAvailable(String sName);

//Will connect to specified API
//It could be AM o		r FM
//Return response according to service
String linkAPI(String sApiName);
}
