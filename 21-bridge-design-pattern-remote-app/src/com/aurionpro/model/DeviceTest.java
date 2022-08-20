package com.aurionpro.model;

public class DeviceTest {

	public static void main(String[] args) {
		 		
		testDevice(new Tv());
		testDevice(new Radio());
		
	}

	private static void testDevice(IDevice device) {
		
		System.out.println("Test with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.powerButton();
		basicRemote.chennelUp();
		basicRemote.volumeUp();
		device.printStatus();
		
		System.out.println();
		
		System.out.println("Test with Advanced remote.");
		AdvancedRemote advanceRemote = new AdvancedRemote(device);
		advanceRemote.volumeUp();
		advanceRemote.mute();
		device.printStatus();
		
		
	}

}
