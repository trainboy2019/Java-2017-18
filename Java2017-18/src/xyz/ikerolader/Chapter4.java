package xyz.ikerolader;

import java.util.Scanner;

public class Chapter4 {
	public static void println(Object line) {
		System.out.println(line);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(4.1);
//		println("enter length from center to vertex");
//		double length=input.nextDouble();
//		println((5*Math.pow((2.0*length*Math.sin((Math.PI/5))),2))/(4*Math.tan((Math.PI/5))));
		
//		println(4.4);
//		println("enter side lenght");
//		double s=input.nextDouble();
//		double area=(6.0*Math.pow(s, 2))/(4.0*Math.tan(Math.PI/6.0));
//		println(area);
		
//		println(4.8);
//		println("enter ascii number");
//		int ascii=input.nextInt();
//		char asciiOut=(char)ascii;
//		println(asciiOut);
		
//		println(4.11);
//		println("decimal between 0 and 15");
//		int decimal = input.nextInt();
//		if (decimal >= 0 && decimal <= 9)
//			println(decimal);
//		else if (decimal >= 10 && decimal <= 15)
//			println((char)(decimal + 'A' - 10));
//		else
//			println("invalid");
		
//		println(4.13);
//		println("enter letter");
//		String s=input.nextLine();
//		char c=s.charAt(0);
//		if (Character.isLetter(c))
//		{
//			switch(Character.toUpperCase(c))
//			{
//				case 'A': 
//				case 'E': 
//				case 'I': 
//				case '0': 
//				case 'U': println("vowel"); break;
//				default : println("consonant"); 
//			}
//		}
//		else
//			println("invalid");
		
//		println(4.15);
//		println("enter letter");
//		String s=input.nextLine();
//		char c=s.charAt(0);
//		switch (Character.toLowerCase(c)) {
//		case 'a':
//		case 'b':
//		case 'c':println(2);break;
//		case 'd':
//		case 'e':
//		case 'f':println(3);break;
//		case 'g':
//		case 'h':
//		case 'i':println(4);break;
//		case 'j':
//		case 'k':
//		case 'l':println(5);break;
//		case 'm':
//		case 'n':
//		case 'o':println(6);break;
//		case 'p':
//		case 'q':
//		case 'r':
//		case 's':println(7);break;
//		case 't':
//		case 'u':
//		case 'v':println(8);break;
//		case 'w':
//		case 'x':
//		case 'y':
//		case 'z':println(9);break;
//		default:println("invalid");
//		}
		
//		println(4.21);
//		println("enter ssn");
//		String ssn=input.nextLine();
//		if(
//				ssn.length()==11&&
//				Character.isDigit(ssn.charAt(0))&&
//				Character.isDigit(ssn.charAt(1))&&
//				Character.isDigit(ssn.charAt(2))&&
//				(ssn.charAt(3)=='-')&&
//				Character.isDigit(ssn.charAt(4))&&
//				Character.isDigit(ssn.charAt(5))&&
//				(ssn.charAt(6)=='-')&&
//				Character.isDigit(ssn.charAt(7))&&
//				Character.isDigit(ssn.charAt(8))&&
//				Character.isDigit(ssn.charAt(9))&&
//				Character.isDigit(ssn.charAt(10))
//			) {
//			println("valid");
//		}
//		else {
//			println("invalid");
//		}
		
//		println(4.22);
//		println("Enter string s1: ");
//		String string1 = input.nextLine();
//		println("Enter string s2: ");
//		String string2 = input.nextLine();
//		if(string1.contains(string2)){
//			println("yes");
//		}
//		else {
//			println("no");
//		}
		
		println(4.24);
		println("first");
		String city1 = input.nextLine();
		println("second");
		String city2 = input.nextLine();
		println("third");
		String city3 = input.nextLine();
		city1.toUpperCase();
		city2.toUpperCase();
		city3.toUpperCase();
		String temp;
		if ((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0))
		{
			temp = city1;
			city1 = city2;
			city2 = temp;	
		}
		else if ((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0))
		{
			temp = city1;
			city1 = city3;
			city3 = temp;
			
		}
		if (city3.compareTo(city2) < 0)
		{
			temp = city2;
			city2 = city3;
			city3 = temp;
		}
		println(city1 + " " + city2 + " " + city3);
		
		
	}

}
