package com.dev.app;

import java.util.Scanner;

import Exceptions.IncorrectArgumentException;

public final class Utils {
	
	public static int choicePicker(int from, int to) {
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		
		while(true) {
			try {
				System.out.print("Choose an option: ");
				choice = Integer.parseInt(scanner.nextLine());
				
				if(choice >= from && choice <= to) {
					scanner.close();
					return choice;
				} else {
					throw new IncorrectArgumentException();
				}
			} catch(Exception e) {
				System.out.println("Incorrect argument provided");
			}
		}
	}
}
