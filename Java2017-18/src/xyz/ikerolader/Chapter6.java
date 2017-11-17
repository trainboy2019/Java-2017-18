package xyz.ikerolader;

import java.util.Scanner;

public class Chapter6 {
	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(6.3);
//		println("enter number");
//		int num=input.nextInt();
//		boolean value=isPal(num);
//		println(value);
		
//		println(6.4);
//		println("enter number");
//		int num=input.nextInt();
//		println(reverse(num));
		
//		println(6.5);
//		println("enter 3 numbers, press enter between each number");
//		int a=input.nextInt();
//		int b=input.nextInt();
//		int c=input.nextInt();
//		sort(a,b,c);
		
//		println(6.8);
//		println("enter celsius");
//		double c=input.nextDouble();
//		println(cToF(c));
//		println("enter fahrenheit");
//		double f=input.nextDouble();
//		println(fToC(f));
		
//		println(6.13);
//		println("enter number");
//		int times=input.nextInt();
//		double value=fracCalc(times);
//		println(value);
		
//		println(6.18);
//		println("ente rpassword");
//		String pw = input.nextLine();
//		if(passCheck(pw))println("ok");
//		else println("no");
		
//		println(6.20);
//		println("enter string");
//		String s=input.nextLine();
//		println(countLetters(s));
		
//		println(6.26);
//		final int NUMBER_OF_PALINDROMIC_PRIMES = 100; 
//		final int NUMBERS_PER_LINE = 10;
//		int count = 0;
//		int n = 2;
//		while (count < NUMBER_OF_PALINDROMIC_PRIMES) {
//			println(count);
//			if (isPalindromicPrime(n)) {
//				count++;
//				System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
//			}
//			n++;
//			println(n);
//		}
		
		println(6.36);
		println("ennter sides followed by length");
		int n=input.nextInt();
		double side=input.nextDouble();
		println(area(n,side));
		
		
		
	}
	
	public static int reverse(int num) {
		return Integer.reverse(num);
	}
	
	public static boolean isPal(int num) {
		return num==reverse(num);
	}
	
	public static void sort(int a, int b, int c) {
		int temp;
		if (b<a&&b<c){
			temp=a;
			a=b;
			b=temp;
		}
		else if (c<a&&c<b){
			temp=a; 
			a=c;
			c=temp;
		}
		if (c<b){
			temp=b;
			b=c;
			c=temp;
		}
		println(a+" "+b+" "+c);
		
	}
	
	public static double fToC(double f) {
		return (5.0/9)*(f-32);
	}
	public static double cToF(double c) {
		return (9.0/5)*c+32;
	}
	
	public static double fracCalc(int x) {
		double value=0.0;
		for(int i=0;i<x;i++) {
			value=value+((double)i/((double)i+1.0));
		}
		return value;
	}
	
	public static boolean passCheck(String pw) {
		int numbs=0;
		if(pw.length()<8) {
			return false;
		}
		char[] charArray = pw.toCharArray();
	    for(char c:charArray)
	    {
	        if (!Character.isLetterOrDigit(c)) return false;
	        if(Character.isDigit(c)) numbs++;
	    }
	    if(numbs<2) {
	    		return false;
	    }
	    return true;
	    
	}
	
	public static int countLetters(String s) {
		int letters=0;
		char[] charArray = s.toCharArray();
	    for(char c:charArray)
	    {
	        if(Character.isLetter(c))letters++;
	    }
	    return letters;
	}
	
	public static boolean isPalindromicPrime(int num) {
		return isPrime(num) && 
				 isPal(num);
	}
	
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double area(int n, double side) {
		return (n*(side*side))/(4.0*Math.tan(Math.PI/n));
	}
}
