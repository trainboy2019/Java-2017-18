package xyz.ikerolader.Chapter9;

import java.util.Scanner;
import java.util.Date;

public class Chapter9 {
	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(9.1);
//		Rectangle rectangleA=new Rectangle(4,40);
//		Rectangle rectangleB=new Rectangle(3.5,35.9);
//		println("w="+rectangleA.width);
//		println("h="+rectangleA.height);
//		println("a="+rectangleA.getArea());
//		println("p="+rectangleA.getPerimeter());
//		println("");
//		println("w="+rectangleB.width);
//		println("h="+rectangleB.height);
//		println("a="+rectangleB.getArea());
//		println("p="+rectangleB.getPerimeter());
		
		println(9.6);
		Stopwatch stopwatch=new Stopwatch();
		stopwatch.start();
		double arr[] = new double[100000];
		for (int i=0;i<100000;i++) {
			arr[i]=i;
		}
		SelectionSort.selecionSort(arr);
		stopwatch.stop();
		println(stopwatch.getElapsedTime());
	}

}
