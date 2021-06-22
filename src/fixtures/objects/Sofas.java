package fixtures.objects;

import fixtures.Fixture;

public class Sofas extends Fixture implements Interactive{

	public Sofas() {
		super(
				"Sofas".toLowerCase(), 
				"Two moldy sofas", 
				"The two moldy sofas look like they've spent most of their golden years hidden in this dingy house"
		);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interactWith() {
		System.out.println("You inspect the Sofa more closely. It is covered in some red and green mold. It pulses unnaturally. You think it is best that you don't sit on it.");
		
	}
	
	public void sitOn() {
		System.out.println("You decide against sitting on the couch. It doesn't look safe");
	}

}
