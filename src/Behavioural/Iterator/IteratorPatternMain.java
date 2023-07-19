package Behavioural.Iterator;

public class IteratorPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotificationCollection notifications = new NotificationCollection();
		
		NotificationBar notificationBar = new NotificationBar(notifications);
		
		notificationBar.printNotification();
	}

}
