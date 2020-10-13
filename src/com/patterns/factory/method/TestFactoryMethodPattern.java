package com.patterns.factory.method;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		NotificationFactory notificationFactory = new SMSNotificationFactory();
		notificationFactory.display();

		notificationFactory = new EmailNotificationFactory();
		notificationFactory.display();

		notificationFactory = new PushNotificationFactory();
		notificationFactory.display();
	}
}
