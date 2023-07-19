package Structural.FLYWeight;

public class CouterTerrorist implements Player{

    private final String task;
	
	public CouterTerrorist() {
		task = "Defuse a Bomb";
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
		System.out.println("Couter Terrorist with weapon "+weapon + " and on a mission "+task);
	}

}
