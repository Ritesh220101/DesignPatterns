package com.aurionpro.model;

public class BasicRemote implements IRemote {
	protected IDevice device;
	public BasicRemote(IDevice device) {
		super();
		this.device = device;
	}
	@Override
	public void powerButton() {
		if(device.isPowerOn()) {
			System.out.println("power : off");
			device.powerOff();
		}
		System.out.println("power : on");
		device.powerOn();
	}
	@Override
	public void volumeUp() {
		device.setVolume(device.getVolume()+5);
		System.out.println("volume up :"+ device.getVolume());
	}
	@Override
	public void volumeDown() {
		device.setVolume(device.getVolume()-5);
		System.out.println("volume down :"+ device.getVolume());
	}
	@Override
	public void chennelUp() {
		device.setChannel(device.getChannel()+1);
		System.out.println("Channel up : "+ device.getChannel());
	}
	@Override
	public void ChennelDown() {
		device.setChannel(device.getChannel()-1);
		System.out.println("Channel down : "+ device.getChannel());
	}
}
