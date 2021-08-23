package com.app.search.service.impl;

import java.util.List;
import com.app.dao.PlyaerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;

public class PlayerSearchServiceImpl implements PlayerSearchService {
	private PlyaerSearchDAO playerSearchDAO=new PlayerSearchDAOImpl();

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player=null;
		if(id<100 || id>1000) {
			throw new BusinessException("Invalid Player Id"+ id);//by doing this way we dont have to go up to database to check it here only we did the validation
		}else {
			//code here to DAO//till now we dont have our dao layer so go about creating a dao 
			player=playerSearchDAO.getPlayerById(id);
			
		}
		// TODO Auto-generated method stub
		return player;
	}

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByName(String Name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByTeamName(String teamName) throws BusinessException {
		List<Player> playerList=null;
		if(teamName.matches("[a-zA-Z]{2,10}")) {
			//code here t DAO
			playerList=playerSearchDAO.getPlayersByTeamName(teamName);
		}else {
			throw new BusinessException("Invalid team name :"+teamName);
		}
		return playerList;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersGender(String gender) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersBySportsName(String sportsName) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
