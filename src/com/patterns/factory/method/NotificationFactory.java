package com.patterns.factory.method;

public abstract class NotificationFactory {
	public void display() {
		Notification notification = getNotification();
		notification.notifyUser();
	}

	protected abstract Notification getNotification();
}
