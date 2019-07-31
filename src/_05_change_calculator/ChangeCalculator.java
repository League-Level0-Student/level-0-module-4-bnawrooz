package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickele = JOptionPane.showInputDialog("How many nickels you have? ");
		// Convert their answer to an int using Integer.parseInt()
		int behzad = Integer.parseInt(nickele);
		// Ask the user how many dimes they have, and convert their answer
		String dimes1 = JOptionPane.showInputDialog("How many dimes you have?");
		int dimes = Integer.parseInt(dimes1);
		// Ask the user how many quarters they have, and convert their answer
		String quarters1 = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters = Integer.parseInt(quarters1);
		// Calculate how much money the user has and save it in a double variable 
		double nickele2 = 0.050 * behzad;
		double dimes2 = 0.100 * dimes;
		double quarters2 = 0.250 * quarters;
		JOptionPane.showMessageDialog(null, "you have $" + (nickele2 + dimes2 + quarters2) + "");
		
		// Tell the user how much money they have

	}
}

