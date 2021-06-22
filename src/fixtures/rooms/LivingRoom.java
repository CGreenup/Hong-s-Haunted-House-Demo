package fixtures.rooms;

public class LivingRoom extends Room{

	public LivingRoom() {		
		super
		(
				"Living Room".toLowerCase(), 	//Name
				"A sizeable living room", 		//Short Description
												//Long Description
				"There are bookshelves lining the walls with books that would disintegrate if handled too hard. The bare hardwood flooring creaks as you step around.\n"
				+ "Two sofas mark the center of the living room, though they #################"
		);
		
		//Look at sofa - Looks moldy
		//Touch Sofa - Dry as a bone
		//Sit on ~~~ - you decide you don't actually want to sit on that.
		
	}

}
