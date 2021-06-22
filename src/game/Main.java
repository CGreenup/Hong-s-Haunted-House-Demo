package game;
import java.util.Scanner;

import fixtures.*;
import game.*;

public class Main {
	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
	}
	
	private static void printRoom(Player player) {
		//Method Here
	}
	
	private static String[] collectInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().split(" ");
	}
	
	private static void parse(String[] command, Player player) {
		//method Here
		//Do-while loop
		//Switch statement on command[0]
		//If no valid command, loop again
	}
}
