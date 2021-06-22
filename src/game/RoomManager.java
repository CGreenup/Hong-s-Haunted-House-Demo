package game;

import fixtures.rooms.*;

public class RoomManager {
	Room startingRoom;
	Room[] allRooms = new Room[8];
	
	public void init() {
		allRooms[0] = new LivingRoom();
		startingRoom = allRooms[0];
	}
}
