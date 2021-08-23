package com.app;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.search.service.PlayerSearchService;
import com.app.search.service.impl.PlayerSearchServiceImpl;
public class Main {
	//This is a PRESENTATION LAYER or we can say MOUTH of our application
	private static Logger log=Logger.getLogger(Main.class);//initialising the logger
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		log.info("welcome to player app V1.0");
		log.info("================================================");
		int ch=0;
		do {
		log.info("\nwhat you wish to do today?");
		log.info("1)Create a Player");
		log.info("2)Update a Player");
		log.info("3)Delete a Player");
		log.info("4)List all Players");
		log.info("5)Search Players with various filters");
		log.info("6)Exit");
		log.info("Enter Your Choice(1-6)");
		try {
		ch=Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			
		}
		
		
		switch (ch) {
		case 1:log.info("Under Construction");
			
			break;
		case 2:log.info("Under Construction");
		
		break;
		case 3:log.info("Under Construction");
		
		break;
		case 4:log.info("Under Construction");
		
		break;
		case 5:
			
			int option=0;
			PlayerSearchService playerSearchService=new PlayerSearchServiceImpl();
		do {
		log.info("\n\nWelcome to Player Search Menu...........Search your Players By various Filters from below Menu Option");
		log.info("1. By player ID");
		log.info("2. By player NAME");
		log.info("3. By player AGE ");
		log.info("4. By player GENDER");
		log.info("5. By player CITY");
		log.info("6. By TeamName ");
		log.info("7. By SportsName");
		log.info("8. By player Contact");
		log.info("9. Go Back To Main Menu");
		log.info("Enter Your Choice(1-6)");
		try {
		option=Integer.parseInt(scanner.nextLine());
		}catch(NumberFormatException e) {
			
		}
		switch (option) {
		case 1:
			log.info("Enter player id to get player datails");
			try {
			int id=Integer.parseInt(scanner.nextLine());
			Player player=playerSearchService.getPlayerById(id);
			if(player!=null)
				log.info("Player with id"+id+"found successfully....Below is the details");
			log.info(player);
			}catch( NumberFormatException e){
				log.warn("player id should be digit only ...... try Again");
			} catch (BusinessException e) {
				log.warn(e.getMessage());
			}
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		case 5:
	
			break;
		case 6:log.info("Enter the teamName to get the players for that team");
			String teamName=scanner.nextLine();
			try {
				List<Player> playerList=playerSearchService.getPlayersByTeamName(teamName);
				if(playerList!=null && playerList.size()>0) {
					log.info("TOtal there are number of"+playerList.size()+"nuber of players playing for the team"+teamName.toUpperCase()+"printing the players");
					for(Player player:playerList) {
						log.info(player);
					}
				}
			} catch (BusinessException e) {
				log.warn(e.getMessage());
			}
	
			break;
		case 7:
	
			break;
		case 8:
	
			break;
		case 9:
			log.info("\n\nGOING BACK TO MAIN MENU.....\n\n");
	
			break;

		default:log.warn("Invalid Search Option....Choice should be only number betwwen 1-9 only. Kindly Retry");
			break;
		}
		}while(option!=9);
		break;
		case 6:log.info("Thanks for using this APPLICATION we will see you soon :)");
		
		break;
		

		default:
			log.warn("Invalid choice....Choice should be only number betwwen 1-6 only");
			break;
		}
		
		}while(ch!=6);
		
	}

}
