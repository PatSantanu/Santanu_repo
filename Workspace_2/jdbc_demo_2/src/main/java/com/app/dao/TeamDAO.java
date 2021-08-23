package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Team;

public interface TeamDAO {
	public Team createTeam(Team team) throws BusinessException;//it will return the team object and going take team
	public List<Team> getAllTeams()throws BusinessException;
	public List<Team> getTeamsByName(String teamName)throws BusinessException;//while doing nameing to the method keep in mind that the method name should say what exactly they are doing

}
