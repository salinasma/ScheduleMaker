package scheduler;

import java.util.ArrayList;

class Member {
	private int hoursOfLabor;
	private String name;
	private ArrayList<String> labor;
	
	
	public Member(String parameters, int hoursOfLabor){
		String[] params = parameters.split(",");
		name = params[1];
		this.hoursOfLabor = hoursOfLabor;
		labor = new ArrayList<String>();
		
		for(int i = 1; i < params.length; i++){
			labor.add(params[i]);
		}
	}


	public int getHoursOfLabor() {
		return hoursOfLabor;
	}


	public void setHoursOfLabor(int hoursOfLabor) {
		this.hoursOfLabor = hoursOfLabor;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<String> getLabor() {
		return labor;
	}


	public void setLabor(ArrayList<String> labor) {
		this.labor = labor;
	}
	
}
