package com.dxc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dxc.beans.Athlete;

@Component
public class AthleteRepository {
	
	List<Athlete> athlete = new ArrayList<Athlete>();
	
	public List<Athlete> getAthlete(){
		return athlete;
	}
	
	public void setAthlete(List<Athlete> athlete) {
		this.athlete = athlete;
	}
	
	public void addAthlete(Athlete athlete1) {
		this.athlete.add(new Athlete(Athlete.getCount(),athlete1.getAthleteName(),athlete1.getAthleteGender(),athlete1.getCategory(),athlete1.getAthleteEmailId(),athlete1.getAthleteMobileNo()));
	}
}
