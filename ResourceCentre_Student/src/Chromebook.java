
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	//"I want to scream" - Sean Yong
	public String toString(){

		// Write your codes here
		String output = super.toString();
	output = String.format("%-63s %-20d", output, os);
		
		return output;
	}
}


