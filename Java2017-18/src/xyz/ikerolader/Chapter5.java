package xyz.ikerolader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter5 {
	
	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(5.1);
//		println("Enter numbers, 0 has t be last");
//		List<Integer> raw = new ArrayList<Integer>();
//		int i=0;
//		int next=input.nextInt();
//		while(next!=0) {
//			raw.add(next);
//			next=input.nextInt();
//			i+=1;
//		}
//		if(raw.get(0)==0) {
//			println("No");
//		}
//		else {
//			int left=raw.size();
//			while(left>0) {
//				
//			}
//		}
		
//		println(5.3);
//		int times=1;
//		boolean run=true;
//		System.out.printf("\n%-10s %10s", "Kilograms", "Pounds");
//		while (times<400) {
//			if(run) {
//				System.out.printf("\n%-10s %10s", times, times*2.2);
//			}
//			times+=1;
//			run ^= true;
//		}
		
//		println(5.10);
//		for(int x=100;x<1000;x++) {
//			if(x%5==0&&x%6==0) {
//				System.out.print(x+" ");
//			}
//		}
		
//		println(5.12);
//		double n=0;
//		while(Math.pow(n, 2)<12000) {
//			n++;
//		}
//		println(n);
		
//		println(5.21);
//		println("loan amount");
//		double amount = input.nextDouble();
//		println("number of years");
//		int years = input.nextInt();
//		System.out.println("Interest Rate    Monthly Payment    Total Payment");
//		for (double i=5.0;i<=8;i+=0.125) {
//			System.out.printf("%-5.3f", i);
//			System.out.print("%           ");
//			double monthRate = i / 1200;
//			double monthPay = amount * monthRate / (1- 1 / Math.pow(1 + monthRate, years * 12));
//			System.out.printf("%-19.2f", monthPay);
//			System.out.printf("%-8.2f\n",(monthPay * 12) * years);
//		}
		
//		println(5.31);
//		println("enter amount");
//		double amount=input.nextDouble();
//		println("enter rate");
//		double rate=input.nextDouble();
//		println("enter months");
//		int month=input.nextInt();
//		System.out.printf("\n%-10s %10s", "Month", "CD Value");
//		println("");
//		for(int i=1;i<=month;i++) {
//			amount+=amount*(rate/1200);
//			System.out.printf("%-7d%.2f\n", i, amount);
//		}
		
//		println(5.34);
//		int computerWins=0;
//		int userWins=0;
//		do {
//			int computer = (int)(Math.random()*3);
//			println("scissor (0), rock(1), paper (2)");
//			int user = input.nextInt();
//			System.out.print("The computer is ");
//			switch (computer){
//			case 0: System.out.print("scissor. "); break;
//			case 1: System.out.print("rock. "); break;
//			case 2: System.out.print("paper. "); break;
//			}
//			System.out.print("You are ");
//			switch (user){
//			case 0: System.out.print("scissor"); break;
//			case 1: System.out.print("rock"); break;
//			case 2: System.out.print("paper"); break;
//			default : System.out.print("out.");System.exit(1);
//			}
//			if (computer == user) {
//				System.out.print(" too, It is a draw!");
//			}
//			else{
//				boolean win=(user==0&&computer==2)||(user==1&&computer==0)||(user==2&& computer==1);
//				if (win){
//					System.out.println(". You won");
//					computerWins++;
//				}
//				else
//				{
//					System.out.println(". You lose");
//					userWins++;
//				}
//			}
//			System.out.println("Computer wins: "+computerWins+"\nUser wins: "+userWins);
//		} while (Math.abs(computerWins-userWins)<=2);
		
//		println(5.39);
//		double amount=0;
//		double goal=30000;
//		double total;
//		for(total=0;total<goal;amount+=0.01) {
//			if(amount<=5000) {
//				total=amount*0.08;
//			}
//			if(amount<=10000&&amount>5000) {
//				total=amount*0.08+amount*0.01;
//			}
//			if(amount>10000) {
//				total=amount*0.08+amount*0.1+amount*0.12;
//			}
//		}
//		System.out.printf("%.2f\n", amount);
		
//		println(5.41);
//		println("enter numbers");
//		int[] array = new int[input.nextInt()];
//		int a=0;
//		int b;
//		int max=0;
//		int times=0;
//		for(int i=0;i<array.length; i++) {
//			if(i!=0) {
//				a=array[i-1];
//				b=array[i];
//				println(a);
//				println(b);
//				if(a<b) {
//					max=b;
//				}
//				else {
//					max=a;
//				}
//			}
//			else {
//				b=array[i];
//				max=b;
//				times=1;
//				//continue;
//			}
//			if(b>max) {
//				max=b;
//				times=1;
//			}
//			else {
//				times++;
//			}
//
//			println(a);
//			println(b);
//			
//		}
//		
//		println(max);
//		
//		println(5.46);
//		println("entert a string");
//		String text=input.nextLine();
//		String rev="";
//		for(int i=0;i<text.length();i++) {
//			rev=rev+text.charAt(text.length()-1-i);
//		}
//		println(rev);
		
//		println(5.49);
//		int v=0;
//		int c=0;
//		println("Enter String");
//		String text=input.nextLine();
//		text=text.toUpperCase();
//		for(int i=0;i<text.length();i++) {
//			char ch=text.charAt(i);
//			
//			switch(ch) {
//			case 'A':v++;break;
//			case 'E':v++;break;
//			case 'I':v++;break;
//			case 'O':v++;break;
//			case 'U':v++;break;
//			default: c++;
//			}
//		}
//		println("Vowel: "+v);
//		println("Consonants: "+c);
		
	}

}
