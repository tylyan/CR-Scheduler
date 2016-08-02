package models;

import java.util.ArrayList;

public class Supervisor extends Consultant{
	
	private ArrayList<Consultant> consultants;
	
	public Supervisor(String netID){
		super(netID);
		consultants = new ArrayList<Consultant>();
	}

	public ArrayList<Consultant> getConsultants() {
		return consultants;
	}
}
