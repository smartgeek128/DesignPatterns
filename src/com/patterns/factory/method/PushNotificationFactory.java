package com.patterns.factory.method;

public class PushNotificationFactory extends NotificationFactory {

	@Override
	protected Notification getNotification() {
		return new PushNotification();
	}
}
