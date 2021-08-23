package com.app.dao;
import com.app.model.Player;
import com.app.exception.BusinessException;
import java.util.List;
import com.app.model.Player;
public interface PlayerDAO {
	//DAO--Data Access Object--Is a design pattern utilized to specify the persistant/DB/Storage logic 
	public List<Player> getAllPlayers() throws BusinessException;
	public int deletePlayer() throws BusinessException;
}	
