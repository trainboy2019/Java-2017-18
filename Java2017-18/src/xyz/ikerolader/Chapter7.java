package xyz.ikerolader;

import java.util.Scanner;

public class Chapter7 {
	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
//		println(7.4);
//		println("enter scores. negative stops input.");
//		double[] scoresList=new double[100];
//		double score=input.nextDouble();
//		double average=0;
//		int above=0;
//		int below=0;
//		int numScores=0;
//		for(numScores=0;score>=0;numScores++) {
//			if(numScores>99) {
//				println("too many");
//				System.exit(0);
//			}
//			scoresList[numScores]=score;
//			average+=score;
//			score=input.nextDouble();
//		}
//		average/=numScores;
//		for(int i=0;i<numScores;i++) {
//			if(scoresList[i]>=average) {
//				above++;
//			}
//			else {
//				below++;
//			}
//		}
//		println("num above "+above);
//		println("num below "+below);
		
//		println(7.5);
//		int[] distinctNumbers=new int[10];
//		int num;
//		int count=0;
//		println("Enter ten numbers");
//		for (int i=0;i<10;i++){
//			num=input.nextInt();
//			if(isDistinct(distinctNumbers,num)){
//				distinctNumbers[count]=num;
//				count++;
//			}
//		}
//		println("The number of distinct numbers is "+count);
//		System.out.print("The distinct numbers are");
//		for (int i=0;i<distinctNumbers.length;i++){
//			if (distinctNumbers[i]>0)
//				System.out.print(" "+distinctNumbers[i]);
//		}
		
//		println(7.8);
//		double[] values=new double[10];
//		println("Enter ten values of double type");
//		for(int i=0;i<values.length;i++){
//			values[i]=input.nextDouble();
//		}
//		println("The average value: "+average(values));
		
//		println(7.11);
//		double[] numbers = new double[10];
//		println("Enter ten numbers");
//		for(int i=0;i<numbers.length;i++)
//			numbers[i]=input.nextDouble();
//		println("The mean is "+average(numbers));
//		println("The standard deviation is "+deviation(numbers));
		
//		println(7.14);
//		int[] numbers=new int[5];
//		println("Enter five numbers");
//		for(int i=0;i<numbers.length;i++){
//			numbers[i]=input.nextInt();
//		}
//		println("The greatest common divisor is "+gcd(numbers));
		
//		println(7.15);
//		int[] numbers=new int[10];
//		println("Enter ten number");
//		for(int i=0;i<numbers.length;i++)
//			numbers[i]=input.nextInt();
//		int[] distinctNumbers=eliminateDuplicates(numbers);
//		println("The distinct numbers are");
//		for(int e:distinctNumbers){
//			if(e>0)
//				println(e);
//		}
		
//		println(7.27);
//		println("Enter list1: ");
//		int[] list1=new int[input.nextInt()];
//		for(int i=0;i<list1.length;i++)
//			list1[i]=input.nextInt(); 	
//		println("Enter list2");
//		int[] list2=new int[input.nextInt()];
//		for(int i=0;i<list2.length;i++)
//			list2[i]=input.nextInt();
//		println("Two lists are"+(equals(list1,list2)?" ":" not ")+"identical");
		
//		println(7.28);
//		int[] numbers = new int[10];
//		println("Enter ten numbers");
//		for(int i=0;i<numbers.length;i++)
//			numbers[i]=input.nextInt();
//		printCombinations(numbers);
		
//		println(7.30);
//		println("Enter the number of values");
//		int[] values=new int[input.nextInt()];
//		println("Enter the values");
//		for(int i=0;i<values.length;i++)
//			values[i]=input.nextInt();
//		println("The list has"+(isConsecutiveFour(values)?" ":" no ")+"consecutive fours");
		
		
		
	}
	
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
	
	public static int average(int[] array){
		int average=0; 
		for (int i:array){
			average+=i;
		}
		return average/array.length;
	}
	
	
	public static double average(double[] array){
		double average=0; 
		for(double i:array){
			average+=i;
		}
		return average/array.length;
	}
	
	
	public static double deviation(double[] x){
		double deviation=0;
		double mean=average(x);
		for(double e:x) {
			deviation+=Math.pow(e-mean,2);
		}
		return Math.sqrt(deviation/(x.length-1));
	}
	
	
	public static int gcd(int... numbers){
		int gcd = 1;
		boolean isDivisor;
		for(int i=2;i<min(numbers); i++){
			isDivisor=true;
			for (int e:numbers){
				if(e%i!=0)
					isDivisor=false;
			}
			if(isDivisor)
				gcd=i;
		}
		return gcd;
	}
	
	public static int min(int... numbers){
		int min=numbers[0];
		for(int e:numbers){
			if(e<min)
				min=e;
		}
		return min;
	}
	
	public static int[] eliminateDuplicates(int[] list){
		int[] distinctList=new int[list.length];
		int i=0;
		for(int e:list){
			if(linearSearch(distinctList,e)==-1){
				distinctList[i]=e;
				i++;
			}
		}
		return distinctList;
	}
	
	public static int linearSearch(int[] array,int key){
		for(int i=0;i<array.length;i++){
			if(key==array[i])
				return i;
		}
		return -1;
	}
	
	
	public static boolean equals(int[] list1, int[] list2){
		if(list1.length!=list2.length)
			return false;
		sort(list1);
		sort(list2);
		for(int i=0;i<list1.length;i++){
			if(list1[i]!=list2[i])
				return false;
		}
		return true;
	}
	
	public static void sort(int[] list){
		for(int i=0;i<list.length-1;i++){
			int min=list[i];
			int minIndex=i;
			for(int j=i+1;j<list.length;j++){
				if(list[j]<min){
					min=list[j];
					minIndex=j;
				}
			}
			if(minIndex!=i){
				list[minIndex]=list[i];
				list[i]=min; 
			}
		}
	}
	
	public static void printCombinations(int[] numbers){
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<numbers.length;j++){
				if(i!=j)
					println(numbers[i]+" "+numbers[j]);
			}
		}
	}
	
	
	public static boolean isConsecutiveFour(int[] values){
		int count=1;
		for(int i=0;i<values.length-1;i++){
			if(values[i]==values[i+1]) 
				count++;
			if(count>=4)
				return true;
			if(values[i]!=values[i+1])
				count=1;	
		}
		return false;
	}

}
