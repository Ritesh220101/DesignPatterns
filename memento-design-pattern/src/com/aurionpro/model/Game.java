package com.aurionpro.model;

public class Game {
	private String missionName;

	public String getMission() {
		return missionName;
	}

	public void setMission(String missionName) {
		this.missionName = missionName;
	}

	public Save savingMission() {
		return new Save(missionName);
	}
	
	public void loadingMission(Save save) {
		missionName = save.getMissionName();
	}
	
}
