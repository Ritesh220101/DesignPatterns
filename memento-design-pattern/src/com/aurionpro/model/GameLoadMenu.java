package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class GameLoadMenu {
	private List<Save> savedMissions = new ArrayList<>();
	
	public void saveGameProgress(Save save) {
		savedMissions.add(save);
	}
	
	public Save loadGame(int index) {
		return savedMissions.get(index);
	}

	@Override
	public String toString() {
		return "GameLoadMenu [savedMissions=" + savedMissions + "]";
	}
	
	
}
