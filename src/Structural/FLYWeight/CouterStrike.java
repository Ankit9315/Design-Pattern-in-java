package Structural.FLYWeight;

import java.util.Random;

public class CouterStrike {

	private static String[] playerType = {"Terrorist", "Counter Terrorist"};
	private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

	public static void main(String[] aargs) {
		
		for(int i = 0 ; i <10 ;i++) {
			Player p = PlayerFactory.getPlayer(randomPlayer());
			
			p.assignWeapon(randomWeapon());
			
			p.mission();
		}
	}
	
	public static String randomPlayer() {
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(playerType.length);
		
		return playerType[randInt];
	}
	
	public static String randomWeapon() {
		
		Random rand = new Random();
		
		int randInt = rand.nextInt(weapons.length);
		
		return weapons[randInt];
	}
	
}
