package Structural.Facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotelKeeper hotelKeeper = new HotelKeeperImpl();
		System.out.println(hotelKeeper.getVegMenu() +"\n"+hotelKeeper.getVegNonMenu()+"\n"+hotelKeeper.getNonVegMenu());

	}

}
