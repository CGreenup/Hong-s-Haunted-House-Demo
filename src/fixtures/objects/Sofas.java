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
		// TODO Auto-generated method stub
		
	}

}
