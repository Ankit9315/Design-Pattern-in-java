package Behavioural.Iterator;

import java.util.Iterator;

public class NotificationBar {

	NotificationCollection notificationCollection;

	public NotificationBar(NotificationCollection notificationCollection) {
		this.notificationCollection = notificationCollection;
	}
	
	public void printNotification() {
		
		Iterator iterator = notificationCollection.createInterator();
		
		while(iterator.hasNext()) {
			
			Notification notification = (Notification) iterator.next();
			System.out.println(notification.getNotification());
		}
	}
}
