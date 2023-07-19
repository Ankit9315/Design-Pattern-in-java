package Structural.Facade;

public class HotelKeeperImpl implements HotelKeeper{

	@Override
	public String getVegMenu() {
		// TODO Auto-generated method stub
		VegRestaurant veg = new VegRestaurant();
		return veg.getMenus();
	}

	@Override
	public String getNonVegMenu() {
		// TODO Auto-generated method stub
		NonVegRestaurant nonVeg = new NonVegRestaurant();
		return nonVeg.getMenus();
	}

	@Override
	public String getVegNonMenu() {
		// TODO Auto-generated method stub
		VegNonBothRestaurant both = new VegNonBothRestaurant();
		return both.getMenus();
	}

}
