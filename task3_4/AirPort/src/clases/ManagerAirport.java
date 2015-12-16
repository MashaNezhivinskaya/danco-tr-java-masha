package clases;

import interfaceflight.ControlFlight;

public class ManagerAirport implements ControlFlight{

	@Override
	public void checkDelay(Flight flight) {
		flight.setDelay(false);
		System.out.println(flight.getName()+"  delay,");
		
	}

	@Override
	public void checkCancel(Flight flight) {
		flight.setCancel(false);
		System.out.println(flight.getName()+"  cancel.");
		
	}
	
	public void addPassenger(Flight flight, Passenger passenger){
		flight.setPassengers(passenger);
	}
	
	public void deletePassenger(Flight flight, Passenger passenger){
		flight.removePassengers(passenger);
	}
	
	public int getCountPlace(Flight flight){
		return flight.getCount();
		
	}

	

}
