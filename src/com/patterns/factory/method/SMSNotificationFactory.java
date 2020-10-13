package com.patterns.factory.method;

public class SMSNotificationFactory extends NotificationFactory {

	@Override
	protected Notification getNotification() {
		return new SMSNotification();
	}
}
