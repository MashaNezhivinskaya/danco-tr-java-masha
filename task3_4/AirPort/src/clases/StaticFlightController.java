package clases;

public class StaticFlightController {
	
	public void getCancel(Flight[] flight){
		for(int i=0;i < flight.length;i++)
		{if((flight[i]!=null)&&(!flight[i].isCancel())){
			System.out.println(flight[i].getName()+" CANCEL!");
		}}
	}

	public void getDelay(Flight[] flight){
		for(int i=0;i < flight.length;i++)
		{if((flight[i]!=null)&&(!flight[i].isDelay())){
			System.out.println(flight[i].getName()+" DELAY!");
		}}
	}
	
	
	public void getCountInList(Flight[] flight){
		for(int i=0;i < flight.length;i++)
		{if((flight[i]!=null)){
			System.out.println(flight[i].getName()+" - "+ flight[i].getCount());
		}}
	}
	
}
