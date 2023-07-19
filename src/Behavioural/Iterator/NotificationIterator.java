package Behavioural.Iterator;

import java.util.Iterator;

public class NotificationIterator implements Iterator{

	Notification[] notificationList;
	
	public NotificationIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
	}

	int position = 0;
	
	@Override
	public boolean hasNext() {
		
		if(position >= notificationList.length || notificationList[position] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		
		Notification notification = notificationList[position];
		position +=1;
		return notification;
	}

}
