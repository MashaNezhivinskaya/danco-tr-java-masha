package clases;

public class FlightList {
	
	private static final int MAX_FLIGHT = 100;
	private Flight[] flights =new Flight[MAX_FLIGHT];
	
	public void addFlight(Flight flight ){
		for(int i=0;;i++)
		{if(flights[i]==null){
			flights[i]=flight;
			System.out.println(flight.getName()+" add in FLIGHT_LIST!");
			break;
		}}
	}

	public Flight[] getFlights() {
		return flights;
	}

	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}
	
	
	

}
