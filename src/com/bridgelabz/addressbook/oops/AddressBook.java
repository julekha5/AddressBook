package com.bridgelabz.addressbook.oops;

import java.util.Scanner;

import com.bridgelabz.addressbook.entity.*;
import com.bridgelabz.addressbook.interfaces.*;
import com.bridgelabz.addressbook.services.*;

/*
 * Address book main method where all method calls 
 */
public class AddressBook {

	public static void main(String[] args) {

		System.out.println("Welcome to AddressBook Program");
		ContactImpl contact = new ContactImpl();

		Scanner sc = new Scanner(System.in);

		boolean exit = false;
		System.out.println("Enter Your Choice");

		while (!exit) {

			System.out.println("1.Create/Add Contact\t 2.Update Contact\t 3.Delete Contact\t *.Default");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add New Contact");
				contact.addContact();
				break;
			case 2:
				System.out.println("Update Contact");
				contact.updatePerson();
				break;
			case 3:
				System.out.println("Delete Contact");
				contact.deleteByName();
				break;
			default:
				exit = true;
				System.out.println("Exit Choices");
				break;
			}
		}
	}

}
