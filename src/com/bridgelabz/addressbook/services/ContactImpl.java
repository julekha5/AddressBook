package com.bridgelabz.addressbook.services;

import java.util.Scanner;
import com.bridgelabz.addressbook.entity.*;
import com.bridgelabz.addressbook.interfaces.*;
import com.bridgelabz.addressbook.services.*;
import com.bridgelabz.addressbook.oops.*;

public class ContactImpl implements IContact {

	Scanner scanner = new Scanner(System.in);
	Person person = new Person();
	Address address = new Address();

	/*
	 * add/create new contact method
	 */
	public void addContact() {
		System.out.println("Enter Person Details:");

		System.out.println("Enter first Name");
		String firstName = scanner.next();
		person.setFirstName(firstName);
		System.out.println("Firstname:" + person.getFirstName());

		System.out.println("Enter last Name");
		String lastName = scanner.next();
		person.setLastName(lastName);

		System.out.println("Enter Email");
		String email = scanner.next();
		person.setEmail(email);

		System.out.println("Enter phone number");
		String phoneNumber = scanner.next();
		person.setPhoneNumber(phoneNumber);

		System.out.println("Enter state");
		String state = scanner.next();
		address.setState(state);

		System.out.println("Enter city");
		String city = scanner.next();
		address.setCity(city);

		System.out.println("Enter zip");
		long zip = scanner.nextInt();
		address.setZip(zip);

		System.out.println("New added contact Details are:");
		System.out.println("FirstName:" + person.getFirstName() + " " + "LastName:" + person.getLastName() + " "
				+ "Email:" + person.getEmail() + " " + "PhoneNumber:" + person.getPhoneNumber() + " " + "Address:"
				+ person.getAddress() + " " + address.getState() + " , " + address.getCity() + " , "
				+ address.getZip());
	}

}
