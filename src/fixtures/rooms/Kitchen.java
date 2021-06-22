package fixtures.rooms;

import game.Player;

public class Kitchen extends Room{

	public Kitchen(){
		super(
				"Kitchen", 
				"A kitchen", 
				"Long description of kitchen here");
	}

	@Override
	public void handleRoomSpecificCommands(String[] args, Player player) {
		// TODO Auto-generated method stub
		
	}
}
