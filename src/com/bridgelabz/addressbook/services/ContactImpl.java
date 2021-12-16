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

	// Update contact person using name
	@Override
	public void updatePerson() {

		System.out.println("Enter the person name for update");
		String fname = scanner.next();
		if (fname.equalsIgnoreCase(person.getFirstName("Julekha"))) {

			System.out.println("Person Found...");
			System.out.println("Edit the details of person");
			boolean exit = false;
			System.out.println("Choose field you want to add:");
			// Switch case for update any field choose that option
			while (!exit) {

				System.out.println(
						"1.First Name\t2.Last Name\t3.Email\t4.Phone Number\t5.State\t6.City\t7.Zip\t8.Default");
				int ch = scanner.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Edit first Name");
					String firstName = scanner.next();
					person.setFirstName(firstName);
					break;
				case 2:
					System.out.println("Edit last Name");
					String lastName = scanner.next();
					person.setLastName(lastName);
					break;
				case 3:
					System.out.println("Edit Email");
					String email = scanner.next();
					person.setEmail(email);
					break;
				case 4:
					System.out.println("Edit phone number");
					String phoneNumber = scanner.next();
					person.setPhoneNumber(phoneNumber);
					break;
				case 5:
					System.out.println("Edit state");
					String state = scanner.next();
					address.setState(state);
					break;
				case 6:
					System.out.println("Edit city");
					String city = scanner.next();
					address.setState(city);
					break;
				case 7:
					System.out.println("Edit zip");
					long zip = scanner.nextInt();
					address.setZip(zip);
					break;
				default:
					exit = true;
					System.out.println("Exit");

				}
				System.out.println("Contact Updated Successfully.");
			}
		} else {
			System.out.println("Person not found");
		}
	}

	// Delete Contact Method
	@Override
	public void deleteByName() {
		System.out.println("Enter the person name for delete");
		String fname = scanner.next();

		if (fname.equals(person.getFirstName("julekha"))) {
			person.setFirstName(null);
			System.out.println("Contact deleted successfully...");
		} else {
			System.out.println("Contact not found");
		}

	}

}
