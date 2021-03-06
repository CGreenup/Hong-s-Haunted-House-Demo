package game;
import java.util.Scanner;

import fixtures.*;
import game.*;

public class Main {
	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player(rm.startingRoom);
		
		boolean hasExited = false;
		String[] command;
		
		while(!hasExited) {
			printRoom(player);
			command = collectInput();
			parse(command, player);
		}
	}
	
	private static void printRoom(Player player) {
		System.out.println(player.currentRoom.name);
		System.out.println(player.currentRoom.longDescription);
	}
	
	private static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine().split(" ");
	}
	
	private static void parse(String[] command, Player player) {
		player.currentRoom.handleRoomSpecificCommands(command, player);
	}
}
