package com.app.model;

public class Team {
	
	public int id;
	public String teamName;
	
	public Team() {
		
	}
	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", teamName=" + teamName + "]";
	}
	
}
