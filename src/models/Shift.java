package models;

import java.util.Date;

public class Shift implements Comparable<Shift>{
	
	// fields
	private String location;
	private String dayOfWeek;
	private Date startTime;
	private Date endTime;
	
	public Shift(String location, String dayOfWeek, Date startTime, Date endTime){
		this.location = location;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	// methods
	public boolean overlaps(Shift other){
		if (this.getDayOfWeekInt() != other.getDayOfWeekInt())
			return false;
		// if start time is greater than other start time and less than other end time
		if (this.startTime.compareTo(other.startTime) > 0 && this.startTime.compareTo(other.endTime) < 0)
			return true;
		// if end time is greater than other start time and less than other end time
		if (this.endTime.compareTo(other.startTime) > 0 && this.startTime.compareTo(other.endTime) < 0)
			return true;
		return false;
	}
	
	public int getLocationValue(){
		switch(this.location){
			case "ARC":
				return 1;
			case "LSM":
				return 2;
			case "BEST":
				return 3;
			default:
				return 0;
		}
	}
	
	public int getDayOfWeekInt(){
		return convertDayOfWeek(this.dayOfWeek);
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public boolean equals(Object o){
		if (o == null || !(o instanceof Shift))
			return false;
		Shift shift = (Shift) o;
		return this.location == shift.location && this.dayOfWeek == shift.dayOfWeek
				&& this.startTime == shift.startTime && this.endTime == shift.endTime;
	}
	
	public String toString(){
		String string = this.location + ": " + this.dayOfWeek + " " + this.startTime + " - " + this.endTime;
		return string;
	}

	public int compareTo(Shift other) {
		if (this.getDayOfWeekInt() > other.getDayOfWeekInt())
			return 1;
		return this.getStartTime().compareTo(other.getStartTime());
	}
	
	public static int convertDayOfWeek(String dayOfWeek){
		switch(dayOfWeek){
			case "Saturday":
				return 0;
			case "Sunday":
				return 1;
			case "Monday":
				return 2;
			case "Tuesday":
				return 3;
			case "Wednesday":
				return 4;
			case "Thursday":
				return 5;
			case "Friday":
				return 6;
			default:
				return -1;
		}
	}
}
