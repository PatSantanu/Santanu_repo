package com.app;

import java.util.List;

import com.app.dao.PlayerDAO;
import com.app.dao.TeamDAO;
import com.app.dao.impl.PlayerDAOImpl;
import com.app.dao.impl.TeamDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Team;


public class Main {

	public static void main(String[] args) {
		PlayerDAO pd=new PlayerDAOImpl();
		//pd.getAllPlayers();
//		try {
//			List<Player> player_list=pd.getAllPlayers();
//			for(Player p: player_list) {
//				System.out.println(p);
//			}
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		TeamDAO teamDAO= new TeamDAOImpl();
		Team t1=new Team("DC");
		
		try {
			t1=teamDAO.createTeam(t1);
			if(t1.getId()!=0)
				System.out.println("team createdsuccessfully with below details");
			System.out.println(t1);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	try {
		List<Team> teamList=teamDAO.getAllTeams();
		if(teamList!=null && teamList.size()>0) {
			System.out.println("\n\nTotal we have "+teamList.size()+"no of teams in Team table.....Below are the details");
			for(Team t:teamList) {
				System.out.println(t);
			}
		}
		
	} catch (BusinessException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	}

}
