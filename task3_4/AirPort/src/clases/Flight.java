package clases;

public class Flight {
	
	private final int MAX;
	private String name;
	private boolean isDelay;
	private boolean isCancel;
	private Passenger[] passengers;

	
	public Flight(String name, boolean isCancel,boolean isDelay,int max) {
		super();
		this.MAX = max;
		this.name = name;
		this.isCancel = isCancel;
		this.isDelay = isDelay;
		this.passengers = new Passenger[MAX];
		System.out.println(name+"  created!");
		
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isDelay() {
		return isDelay;
	}


	public void setDelay(boolean isDelay) {
		this.isDelay = isDelay;
	}


	public boolean isCancel() {
		return isCancel;
	}


	public void setCancel(boolean isCancel) {
		this.isCancel = isCancel;
	}


	public Passenger[] getPassengers() {
		return passengers;
	}


	public void setPassengers(Passenger passenger) {
		for(int i=0;;i++)
		{if(passengers[i]==null){
			passengers[i]=passenger;
			System.out.println(passenger.getNamePassenger()+" add in FLIGHT!");
			break;
		}}

	}
	
	public void removePassengers(Passenger passenger) {
		for(int i=0;;i++)
		{if(passengers[i].equals(passenger)){
			passengers[i]=null;
			System.out.println(passenger.getNamePassenger()+" remove in FLIGHT!");
			break;
		}}

	}


	public String getName() {
			return name;
	}


	public int getMAX() {
		return MAX;
	}
	
	public int getCount(){
		int count = passengers.length;
		for(int i=0;i<passengers.length;i++){
	
			if(passengers[i]!=null){
				count=count-1;
			}
		}
		return count;
	}
}
