package com.app.search.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchService {
	//This is the BUSINESS Layer where we will be doing our VALIDATION for all features that has been introduced in Main
	public Player getPlayerById(int id)throws BusinessException;
	public Player getPlayerByContact(long contact)throws BusinessException;
    public List<Player> getPlayersByName(String Name)throws BusinessException;
    public List<Player> getPlayersByTeamName(String teamName)throws BusinessException;
    public List<Player> getPlayersByAge(int age)throws BusinessException;//wherever i will be having ,multiple values i will take those values in List only
    public List<Player> getPlayersGender(String gender)throws BusinessException;
    public List<Player> getPlayersBySportsName(String sportsName)throws BusinessException;
    public List<Player> getPlayersByCity(String city)throws BusinessException;
    
}
