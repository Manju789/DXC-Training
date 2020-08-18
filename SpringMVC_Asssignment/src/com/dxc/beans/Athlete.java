package com.dxc.beans;

public class Athlete {
	
	private static int count = 1000;
	private int athleteId;
	private String athleteName;
	private String athleteGender;
	private String category;
	private String athleteEmailId;
	private long athleteMobileNo;
	
	public Athlete(int athleteId, String athleteName, String athleteGender, String category, String athleteEmailId,
			long athleteMobileNo) {
		super();
		this.athleteId = count;
		this.athleteName = athleteName;
		this.athleteGender = athleteGender;
		this.category = category;
		this.athleteEmailId = athleteEmailId;
		this.athleteMobileNo = athleteMobileNo;
	}
	
	
	
	public static int getCount() {
		return ++count;
	}

	public Athlete() {}

	public int getAthleteId() {
		return athleteId;
	}

	public void setAthleteId(int athleteId) {
		this.athleteId = athleteId;
	}

	public String getAthleteName() {
		return athleteName;
	}

	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}

	public String getAthleteGender() {
		return athleteGender;
	}

	public void setAthleteGender(String athleteGender) {
		this.athleteGender = athleteGender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAthleteEmailId() {
		return athleteEmailId;
	}

	public void setAthleteEmailId(String athleteEmailId) {
		this.athleteEmailId = athleteEmailId;
	}

	public long getAthleteMobileNo() {
		return athleteMobileNo;
	}

	public void setAthleteMobileNo(long athleteMobileNo) {
		this.athleteMobileNo = athleteMobileNo;
	}
	
	
}
