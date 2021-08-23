package com.app.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.dbutil.MySqlDbConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;
public class PlayerDAOImpl implements PlayerDAO{
	
	@Override
	public  List<Player> getAllPlayers() throws BusinessException {
		List<Player> list= new ArrayList<>();
		Player player= new Player();
		try(Connection connection=MySqlDbConnection.getConnection()){
			String sql="select id,name,age,gender,city,sportsName,contact from player";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet= preparedStatement.executeQuery();
		
			while(resultSet.next()) {
				player.setId(resultSet.getInt("id"));
				player.setName(resultSet.getString("name"));
				player.setAge(resultSet.getInt("age"));
				player.setGender(resultSet.getString("gender"));
				player.setCity(resultSet.getString("city"));
				player.setSportsName(resultSet.getString("sportsName"));
				player.setContact(resultSet.getLong("contact"));
				
				list.add(player);
				
			}
		
		
					
		}catch(ClassNotFoundException | SQLException e){//both exception should be child exception
			System.out.println(e);//This will be replaced by Logger
			throw new BusinessException("Internal error occured please contact support");
		}
		
		return list;
	}

	@Override
	public int deletePlayer() throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

}
