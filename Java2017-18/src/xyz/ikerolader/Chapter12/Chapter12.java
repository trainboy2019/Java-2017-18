package xyz.ikerolader.Chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Chapter12 {
	public static void println(Object line) {
		System.out.println(line);
	}
	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		
//		println(12.2);
//		boolean continueInput=true;
//		System.out.print("Enter two numbers: ");
//		do{
//			try{
//				int number1=input.nextInt();
//				int number2=input.nextInt();
//				System.out.println("The sum is "+(number1+number2));
//				continueInput=false;
//			}
//			catch(InputMismatchException ex){
//				println("Try again. ("+"Incorrect input: two integers are required)");
//				input.nextLine();
//			}
//		}while(continueInput);
		
//		println(12.3);
//		int[] array=getArray();
//		System.out.print("Enter the index of the array: ");
//		try {
//			println("The corresponding element value is "+array[input.nextInt()]);
//		}
//		catch(ArrayIndexOutOfBoundsException ex){
//			println("Out of Bounds.");
//		}
		
//		println(12.11);
//		if(args.length!=2){
//			System.out.println("Usage: java RemoveText filename");
//			System.exit(1);
//		}
//		File file=new File(args[1]);
//		if (!file.exists()){
//			System.out.println("File "+args[1]+" does not exist");
//			System.exit(2);
//		}
//		ArrayList<String>s2=new ArrayList<>(); 
//		try(
//			Scanner input2=new Scanner(file);
//		){
//			while(input2.hasNext()){
//				String s1=input2.nextLine();
//				s2.add(removeString(args[0],s1));
//			}
//		}
//		try(
//			PrintWriter output = new PrintWriter(file);
//		){
//			for(int i=0;i<s2.size();i++){
//				output.println(s2.get(i));
//			}
//		}
		
		
		
	}
	static void method() throws Exception{
		try {
			String s = "abc";
			println(s.charAt(3));
		}
		catch(RuntimeException ex) {
			println("E");
		}
		catch (Exception ex) {
			println("F");
		}
	}
	
	public static int[] getArray(){
		int[] array=new int[100];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*100)+1;
		}
		return array;
	}
	
	public static String removeString(String string, String line){
		StringBuilder stringBuilder=new StringBuilder(line);
		int start=stringBuilder.indexOf(string);
		int end=string.length();
		while(start>=0){
			end=start+end;
			stringBuilder=stringBuilder.delete(start,end);
			start=stringBuilder.indexOf(string,start); 
		}
		return stringBuilder.toString();
	}

}
