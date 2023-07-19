package Structural.FLYWeight;

public class Terrorist implements Player{

	private final String task;
	
	public Terrorist() {
		task = "Plant a Bomb";
	}

	String weapon;
	
	@Override
	public void assignWeapon(String weapon) {
		// TODO Auto-generated method stub
		this.weapon = weapon ;
	}

	@Override
	public void mission() {
		// TODO Auto-generated method stub
		System.out.println("Terrorist with weapon "+weapon + " and on a mission "+task);
	}

}
