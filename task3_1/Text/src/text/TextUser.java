package text;

public class TextUser {
     
	public TextUser() {
	}

	public String[] getWord(String text){
		String[] s = text.trim().split("\\s+");
		
		return s;
	}
	
	
	
	
     
}
