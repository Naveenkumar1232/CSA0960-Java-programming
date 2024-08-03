package com.example.squareroot;

import java.util.Scanner;

public class SquareRootWhile {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double number;

	        while (true) {
	            System.out.print("Please enter a non-negative number: ");
	            number = scanner.nextDouble();
	            if (number >= 0) {
	                break;
	            } else {
	                System.out.println("The number must be non-negative. Try again.");
	            }
	        }
	        double squareRoot = Math.sqrt(number);
	        System.out.printf("The square root of %.2f is %.2f%n", number, squareRoot);
	    }
	}

