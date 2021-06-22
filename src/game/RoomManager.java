package game;

import fixtures.rooms.*;

public class RoomManager {
	Room startingRoom;
	Room[] allRooms;
	
	public void init() {
		Room [] allRooms = new Room[] {
				new LivingRoom(),
				new Kitchen()
		};
		startingRoom = allRooms[0];
	}
}
