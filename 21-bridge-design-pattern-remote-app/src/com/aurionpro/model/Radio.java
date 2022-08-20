package com.aurionpro.model;

public class Radio implements IDevice {
	private boolean powerOn = false;
	private int volume = 25;
	private int channel = 1;
	@Override
	public boolean isPowerOn() {
		return powerOn;
	}
	@Override
	public void powerOn() {
		powerOn = true;
	}
	@Override
	public void powerOff() {
		powerOn = false;
	}
	@Override
	public int getVolume() {
		return volume;
	}
	@Override
	public int getChannel() {
		return channel;
	}
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public void setVolume(int volume) {
		if (volume > 100)
			this.volume = 100;

		else if (volume < 0)
			this.volume = 0;

		this.volume = volume;
	}
	@Override
	public void printStatus() {
		System.out.println("_______________________________________________\n");
		System.out.println("I am Radio.");
		System.out.println("Radio is : " + (isPowerOn() ? "On" : "Off"));
		System.out.println("Current Channel is : " + channel);
		System.out.println("current volume is : " + volume);
		System.out.println("_________________________________________________\n");
	}

}
