package com.patterns.factory.method;

public class EmailNotificationFactory extends NotificationFactory {

	@Override
	protected Notification getNotification() {
		return new EmailNotification();
	}
}
