package Behavioural.Iterator;

import java.util.Iterator;

public class NotificationCollection implements Collection{

	static final int maxItems = 6;
    int numberOfItems = 0;
    Notification[] notificationList;
    
	public NotificationCollection() {
		notificationList = new Notification[maxItems];
		
		addItem("Notification 1");
		addItem("Notification 2");
		addItem("Notification 3");
	}

	@Override
	public Iterator createInterator() {
		
		return new NotificationIterator(notificationList);
	}
	
	public void addItem(String str) {
		
		Notification notification = new Notification(str);
		
		if(numberOfItems >= maxItems) {
			System.err.println("Full");
		}
		else {
			notificationList[numberOfItems] = notification;
			numberOfItems +=1;
		}
	}

}
