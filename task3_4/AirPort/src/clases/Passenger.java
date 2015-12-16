package clases;

public class Passenger {
	
	private String namePassenger;

	public Passenger(String namePassenger) {

		this.namePassenger = namePassenger;
		System.out.println(namePassenger+" created!");
	}

	public String getNamePassenger() {
		return namePassenger;
	}

	public void setNamePassenger(String namePassenger) {
		this.namePassenger = namePassenger;
	}
		
	

}
