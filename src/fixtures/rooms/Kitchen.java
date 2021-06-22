package fixtures.rooms;

import game.Player;

public class Kitchen extends Room{

	Kitchen(){
		super(
				"Kitchen".toLowerCase(), 
				"A kitchen", 
				"Long description of kitchen here");
	}

	@Override
	public void handleRoomSpecificCommands(String[] args, Player player) {
		// TODO Auto-generated method stub
		
	}
}
