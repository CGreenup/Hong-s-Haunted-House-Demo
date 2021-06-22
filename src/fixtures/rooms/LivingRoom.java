package fixtures.rooms;
import fixtures.objects.Sofas;
import game.Player;

public class LivingRoom extends Room{
	Sofas sofa = new Sofas();
	
	public LivingRoom() {		
		super
		(
				"Living Room".toLowerCase(), 	//Name
				"A sizeable living room", 		//Short Description
												//Long Description
				"There are bookshelves lining the walls with books that would disintegrate if handled too hard. The bare hardwood flooring creaks as you step around.\n"
				+ "Two sofas mark the center of the living room."
		);
		
		//Look at sofa - Looks moldy
		//Touch Sofa - Dry as a bone
		//Sit on ~~~ - you decide you don't actually want to sit on that.
		
	}

	@Override
	public void handleRoomSpecificCommands(String[] args, Player player) {
		
		System.out.println("\n");//Newline
		
		//Get in the first word that the user typed
		switch(args[0].toLowerCase()) {
		case "sit":
			if (args[2].contains("sofa"))
				sitOnSofa();
			else
				System.out.println("You decide not to sit on that");
			break;
		case "go":
			System.out.println("You try to go to a different room, but you realize this is the only room. you are in hell. And all the only thing you will know is that there are two moldy sofas");
		}
		
	}
	
	public void sitOnSofa() {
		System.out.println("You decide against sitting on the couch. It doesn't look safe");
	}

}
