package com.example.radiotuner;

interface FmService {
//Will return frequency
int knob();		

//Will show frequency / channel number
int isSeekInProgress(int freq);

void setChannel(int freq); 
}