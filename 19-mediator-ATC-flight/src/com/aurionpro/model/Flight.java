package com.aurionpro.model;

public class Flight implements ICommand {

	private IAtc atcMediator;
	private String flightName;

	public Flight(IAtc atcMediator, String flightName) {
		super();
		this.atcMediator = atcMediator;
		this.flightName = flightName;
	}

	@Override
	public void land() {
		if (atcMediator.isAvailableRunway()) {
			System.out.println("Landing flight  " + flightName);
			atcMediator.setAvailabilityStatusofRunway(false); // runway is occupied
		}

		else {
			System.out.println("Waiting for runway " + flightName);
		}

	}

	public void readyToLand() {

		System.out.println("Landing Request By " + flightName);

	}

	public void parked() {
		System.out.println(flightName + " is Parked ");
		atcMediator.setAvailabilityStatusofRunway(true); // runway is available

	}

	@Override
	public String toString() {
		return "Flight [atcMediator=" + atcMediator + ", flightName=" + flightName + "]";
	}

}
