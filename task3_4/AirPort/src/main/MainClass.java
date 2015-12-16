package main;

import clases.Flight;
import clases.FlightList;
import clases.ManagerAirport;
import clases.Passenger;
import clases.StaticFlightController;

public class MainClass {

	public static void main(String[] args) {
		//create flight
		
		Flight minsk= new Flight("Minsk", true, true, 10);
		Flight brest= new Flight("Brest", true, true, 15);
		Flight grodno= new Flight("Grodno", true, true, 5);
		Flight london= new Flight("London", true, true, 6);
		Flight minsk2= new Flight("Minsk2", true, true, 8);
		
		//check cancel/delay
		
		ManagerAirport manager = new ManagerAirport();
		
		manager.checkCancel(grodno);
		manager.checkDelay(minsk2);
		manager.checkDelay(brest);
		
		//create passenger
		
		Passenger ivan = new Passenger("Ivan");
		Passenger anna = new Passenger("Anna");
		Passenger olga = new Passenger("Olga");
		Passenger vera = new Passenger("Vera");
		
		//add in flightLIST
		
		FlightList list = new FlightList();
		
		list.addFlight(london);
		list.addFlight(minsk2);
		list.addFlight(brest);
		
		//add passenger in flight
		
		manager.addPassenger(minsk2, vera);
		manager.addPassenger(minsk, olga);
		manager.addPassenger(london, vera);
		manager.addPassenger(brest, anna);
		
		//remove passenger in flight
		
		
		manager.deletePassenger(brest, anna);
		
		//get calculate data
		StaticFlightController staticFlightController = new StaticFlightController();
		staticFlightController.getCancel(list.getFlights());
		staticFlightController.getDelay(list.getFlights());
		
		
		staticFlightController.getCountInList(list.getFlights());
		

	}

}
