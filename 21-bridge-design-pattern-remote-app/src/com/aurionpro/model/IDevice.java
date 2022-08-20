package com.aurionpro.model;

public interface IDevice {

	boolean isPowerOn();

	void powerOn();

	void powerOff();

	int getVolume();

	void setVolume(int volume);

	int getChannel();

	void setChannel(int channel);

	void printStatus();

}
