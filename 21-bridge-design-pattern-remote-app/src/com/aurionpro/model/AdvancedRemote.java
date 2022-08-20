package com.aurionpro.model;


public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(IDevice device) {
		super(device);
	}

	public void mute() {
		device.setVolume(0);
		System.out.println("Device muted.");
	}
}
