package com.src.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Traineee {

	@Id
	private int trainingId;
	private String trainerName;
	private String trainerLocation;
	private String trainerDomain;
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerLocation() {
		return trainerLocation;
	}
	public void setTrainerLocation(String trainerLocation) {
		this.trainerLocation = trainerLocation;
	}
	public String getTrainerDomain() {
		return trainerDomain;
	}
	public void setTrainerDomain(String trainerDomain) {
		this.trainerDomain = trainerDomain;
	}
	
	
}
