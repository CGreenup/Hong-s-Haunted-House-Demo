package fixtures.rooms;

import java.util.HashMap;
import java.util.Map;

import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry;

public class Room extends fixtures.Fixture{
	
	//To add things to this Hash Map, use neighboringRooms.add(number, Room info)
	private Map<Integer, Room> neighboringRooms;

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		neighboringRooms = new HashMap<Integer, Room>();
	}
	
	public Map<Integer, Room> getExits() {
		return neighboringRooms;
	}
	
	//   Currently this is a bit inelegant, but I don't know how we're going to be
	//describing where each neighboring room is
	
	//   Finds the exit room given the key value in the neighboringRooms Map
	public Room getExit(int roomId) {
		return neighboringRooms.get(roomId);
	}
	
	//	Finds the exit room given the name of the room in the neighboringRooms Map
	public Room getExit(String roomName) {
		Room room = null;
		
		for(int i = 0; i < neighboringRooms.size(); i++) {
			room = neighboringRooms.get(i);
			if (room.name.contains(roomName)) {
				return room;
			}
		}
		System.out.println("ERROR: COULD NOT FIND ROOM");
		return room;
	}
	
	public void addExitRoom(Room exit) {
		int key = neighboringRooms.size();
		neighboringRooms.put(key, exit);
	}
	
}
