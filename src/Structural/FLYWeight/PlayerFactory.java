package Structural.FLYWeight;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<String,Player> hm = new HashMap<String,Player>();
	
	public static Player getPlayer(String type) {
		Player p = null;
		if(hm.containsKey(type)) {
			p = hm.get(type);
		}
		else {
			if(type.equals("Terrorist")) {
				System.out.println("Terrorist Created");
				p = new Terrorist();
			}
			else if(type.equals("Counter Terrorist")) {
				System.out.println("Couter Terrorist Created");
				p= new CouterTerrorist();
			}
			else {
				System.out.println("Player invalid");
			}
			hm.put(type, p);
		}
		return p;
		
	}
}
