package fixtures;

public abstract class Fixture {
	String name;
	String shortDescription;
	String longDescription;
	
	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	
	
}
