package xyz.ikerolader.Chapter10;

import java.util.Scanner;

public class Chapter10 {
	public static void println(Object line) {
		System.out.println(line);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(10.4);
//		
//		MyPoint point1=new MyPoint();
//		MyPoint point2=new MyPoint(10,30.5);
//		println("The distance between ("+point1.getX()+", "+point1.getY()+") and ("+ point2.getX()+", "+point2.getY()+") is: "+point1.distance(point2));
		
//		println(10.7);
//		
//		Account[] accounts=new Account[10];
//		initialBalance(accounts);
//		do{
//			println("Enter an id");
//			int id=input.nextInt();
//			if(isValidID(id,accounts)){
//				int choice;
//				do{	
//					choice=displayMainMenu(input);
//					if(isTransaction(choice)){
//							executeTransaction(choice,accounts,id,input);
//					}
//				}while(choice!=4);
//			}
//		}while(true);
		
//		println(10.9);
//		
//		Course c = new Course("c");
//		c.addStudent("Mark");
//		c.addStudent("Tom");
//		c.addStudent("Joan");
//		c.dropStudent("Tom");
//		println("\nThe students in the course " + 
//			c.getCourseName()+":");
//		String[] students=c.getStudents();
//		for(int i=0;i<c.getNumberOfStudents();i++){
//			System.out.print(students[i]+" ");
//		}
//		println("");
		
//		println(10.22);
//		
//		char[] test={'T','e','S','t'};
//		char[] test2={'T','e','S','t','2'};
//		MyString1 str=new MyString1(test);
//		MyString1 str2=new MyString1(test2);
//		println("\nCharacter at index 1 of MyString1 object 1: "+str.charAt(1));
//		println("\nLength of MyString1 object 1: "+str.length());
//		println("\nSubstring from index 2 to 4 of MyString1 object 1: ");
//		MyString1 substr=str.substring(2,4);
//		for(int i=0;i<substr.length();i++){
//			System.out.print(substr.charAt(i));		
//		}
//		println("");
//		println("\nMyString1 object 1 to lowercase:");
//		MyString1 lower=str.toLowerCase();
//		for(int i=0;i<lower.length();i++){
//			System.out.print(lower.charAt(i));		
//		}
//		println("");
//		println("\nMyString1 object 1 is equal to MyString1 object 2? "+str.equals(str2));
//		println("\nDisplay the integer 145 as a MyString1 object: ");
//		MyString1 value=str.valueOf(145);
//		for(int i=0;i<value.length();i++){
//			System.out.print(value.charAt(i));		
//		}
//		println("");
		
//		println(10.26);
//		
//		String a=args[0].replaceAll(" ","");
//		a=a.replaceAll("[+]","#+#");
//		a=a.replaceAll("[-]","#-#");
//		a=a.replaceAll("[*]","#*#");
//		a=a.replaceAll("[/]","#/#");
//		args=a.split("#");
//		if(args.length!=3){
//			println("Usage: java Calculator operand1 operator operand2");
//			System.exit(0);
//		}
//		int result = 0;
//		switch (args[1].charAt(0)){
//			case'+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
//						  break;
//			case'-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
//						  break;
//			case'*':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);
//						  break;
//			case'/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);
//						  break;
//		}
//		println(args[0]+' '+args[1]+' '+args[2]+" = "+result);
		
//		println(10.27);
//		
//		MyStringBuilder1 str1=new MyStringBuilder1("TEST");
//		println("\nAppend the string \" MyStringBuilder1\" to string: "+str1.append(new MyStringBuilder1(" MyStringBuilder1")));
//		println("\nAppend integer 101 to the string: "+str1.append(101));
//		println("\nLength of string: "+str1.length());
//		println("\nCharacter at index 2: "+str1.charAt(2));
//		println("\nString to lower case: "+str1.toLowerCase());
//		println("\nSubstring of string from index 1 to 3: "+str1.substring(1,3));
//		println("\nDisplay string: "+str1.toString());
		
		
	}
	
	public static void initialBalance(Account[] a){
		int initialBalance=100;
		for(int i=0;i<a.length;i++){
			a[i]=new Account(i,initialBalance);
		}
	}

	public static boolean isTransaction(int choice){
		return choice > 0 && choice < 4;
	}

	public static boolean isValidID(int id, Account[] a){
		for(int i=0;i<a.length;i++){
			if(id==a[i].getId())
				return true;
		}
		return false;
	}

	public static int displayMainMenu(Scanner input){
		println("\nMain menu\n1: check balance\n2: withdraw"+"\n3: deposit\n4: exit\nEnter a choice");
		return input.nextInt();
	}

	public static void executeTransaction(
		int c,Account[] a,int id,Scanner input){
		switch(c){
			case 1:
					  println("The balance is " + a[id].getBalance());
					  break;
			case 2:
					  println("Enter an amount to withdraw"); 
					  a[id].withdraw(input.nextDouble());
					  break;
			case 3:
					  println("Enter an amount to deposit"); 
					  a[id].deposit(input.nextDouble());
		}
	}

}
