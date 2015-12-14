package text;

public class Main {

	public static void main(String[] args) {
		TextUser text=new TextUser();
		String[]words= text.getWord("Cat    Dog Animals Fox");
		for(String word:words){
			System.out.println(word);
		}

	}

}
