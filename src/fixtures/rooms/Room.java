package fixtures.rooms;

import java.util.HashMap;
import java.util.Map;

public class Room extends fixtures.Fixture{
	
	//To add things to this Hash Map, use neighboringRooms.add(number, Room info)
	Map<Integer, Room> neighboringRooms;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		neighboringRooms = new HashMap<Integer, Room>();
	}
	
	public Map<Integer, Room> getExits() {
		return neighboringRooms;
	}
	
	//   Currently this is a bit inelegant, but I don't know how we're going to be
	//describing where each neighboring room is
	
	//   We could make a method to convert "North" "South" etc, to numbers separately
	public Room getExit(int roomId) {
		return neighboringRooms.get(roomId);
	}
	
}
