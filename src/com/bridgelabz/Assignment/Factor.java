package com.bridgelabz.Assignment;

import java.util.Scanner;

//Purpose:  Program to find the prime factors of given no
 public class Factor{

//Finction to check if the no is prime or not
// the number to check for prime
//Return true if prime and vice-versa

public static boolean isPrime(int n) {
	for (int i = 2; i <= n / 2; i++) {
		if (n % i == 0) {
			return false;
		}
	}
	return true;
}


//Function to find the prime factors of given no and print it
//Param n the no for which to find the prime factors

static void primeFactors(int n) {
	for (int i = 2; i <= n; i++) {
		int t = n % i;
		if (t == 0) {
			if (isPrime(i))
				System.out.println(i + " ");
		}
	}
}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter no to find prime factors");
	int n = s.nextInt();
	System.out.println("prime factors are ");
	primeFactors(n);
	// System.out.println(isPrime(n));
	s.close();

}
}