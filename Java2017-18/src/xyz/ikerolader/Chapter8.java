package xyz.ikerolader;

import java.util.Scanner;

public class Chapter8 {

	public static void println(Object line) {
		System.out.println(line);
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(8.1);
//		double[][] matrix=getMatrix();
//		for(int col=0;col<matrix[0].length;col++){	
//			println("Sum of the elements at column "+col+" is "+sumColumn(matrix,col));
//		}
		
		
//		println(8.4);
//		int[][] weeklyHours = { {2,4,3,4,5,8,8},
//				{7,3,4,3,3,4,4},
//				{3,3,4,3,3,2,2},
//				{9,3,4,7,3,4,1},
//				{3,5,4,3,6,3,8},
//				{3,4,4,6,3,4,4},
//				{3,7,4,8,3,8,4},
//				{6,3,5,9,2,7,9},};
//		
//		int[][] totals=new int[weeklyHours.length][2];
//		for(int row=0;row<weeklyHours.length;row++){
//			totals[row][0]=row;
//			totals[row][1]=0;
//			for(int col=0;col<weeklyHours[row].length;col++){
//				totals[row][1]+=weeklyHours[row][col];
//			}	
//		}
//		for(int i=0;i<totals.length;i++){
//			int maxCol0=totals[i][0];
//			int maxCol1=totals[i][1];
//			int maxIndex=i;
//			for(int j=i+1;j<totals.length;j++){
//				if(maxCol1<totals[j][1]) {
//					maxCol1=totals[j][1];
//					maxCol0=totals[j][0];
//					maxIndex=j;
//				}
//			}
//			if(i!=maxIndex){
//				totals[maxIndex][1]=totals[i][1];
//				totals[maxIndex][0]=totals[i][0];
//				totals[i][1]=maxCol1;
//				totals[i][0]=maxCol0;
//			}
//		}
//		for(int i=0;i<weeklyHours.length;i++) {
//			for(int j=0;j<weeklyHours[0].length;j++) {
//			System.out.print(weeklyHours[i][j]);
//			System.out.print(" ");
//			}
//			println("");
//		}
		
//		println(8.13);
//		println("Enter the number of rows and columns of the array");
//		int row=input.nextInt();
//		int column=input.nextInt();
//		double[][] array=new double[row][column];
//		println("Enter the array");
//		for(int i=0;i<array.length;i++){
//			for(int j=0;j<array[i].length;j++){
//				array[i][j]=input.nextDouble();
//			}
//		}
//		int[] location=locateLargest(array);
//		println("("+location[0]+","+location[1]+")");
		
//		println(8.15);
//		double[][] points=new double[5][2];
//		println("Enter five points");
//		for(int i=0;i<points.length;i++){
//			for(int j=0;j<points[i].length;j++){
//				points[i][j]=input.nextDouble();
//			}
//		}
//		println("The five points are"+(sameLine(points)?" ":" not ")+"on the same line");
		
//		println(8.16);
//		int[][] array={{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
//		sort(array);
//		for(int i=0;i<array.length; i++){
//			for(int j=0;j<array[i].length;j++){
//				System.out.print(array[i][j]+" ");
//			}
//		}
		
//		println(8.22);
//		int[][] matrix=new int[6][6];
//		for(int i=0;i<matrix.length;i++){
//			for(int j=0;j<matrix[i].length;j++){
//				matrix[i][j]=(int)(Math.random()*2);
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("Every row"+(isAllRowsEven1s(matrix)?" ":" does not "+"have an even number of 1s"));
//		System.out.println("Every column"+(isAllColumnsEven1s(matrix)?" ":" does not "+"have an even number of 1s"));
		
//		println(8.26);
//		double[][] matrix=getMatrix();
//		double[][] sortedMatrix=sortRows(matrix);
//		System.out.println("\nThe row-sorted array is");
//		for(int i=0;i<sortedMatrix.length;i++){
//			for(int j=0;j<sortedMatrix.length;j++){
//				System.out.print(sortedMatrix[i][j]+" ");
//			}
//			println("");
//		}
		
		
	}
	public static double[][] getMatrix(){
		Scanner input=new Scanner(System.in);
		final int ROWS=3;
		final int COLUMNS=3;
		double[][] m=new double[ROWS][COLUMNS];
		println("Enter a "+ROWS+"-by-"+COLUMNS+" matrix row by row:");
		for(int row=0;row<m.length;row++){
			for(int col=0;col<m[row].length;col++){
				m[row][col]=input.nextDouble();
			}
		}
		return m;
	}
	
	public static double sumColumn(double[][] m,int columnIndex){
		double sum=0;
		for(int row=0;row<m.length;row++){
			sum+=m[row][columnIndex];		
		}
		return sum;
	}
	
	public static int[] locateLargest(double[][] a){
		int[] l=new int[2];
		l[0]=0;
		l[1]=0;
		double max=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]>max){
					l[0]=i;
					l[1]=j;
					max=a[i][j];
				}
			}
		}
		return l;
	}
	
	public static boolean sameLine(double[][] points){
		for(int i=0;i<points.length-2;i+=3){
			if(pointPosition(points[i][0],points[i][1],points[i+1][0],points[i+1][1],points[i+2][0],points[i+2][1])!=0){
				return false;
			}
		}
		return true;
	}

	public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
	}
	
	public static void sort(int m[][]) {
		int[] min=new int[2];
		for(int row=0;row<m.length-1;row++){
			min[0]=m[row][0]; 
			min[1]=m[row][1]; 
			int index=row;
			for(int i=row+1;i<m.length;i++){
				if(m[i][0]<=min[0]&&(m[i][0]<min[1]||m[i][1]<min[0]||m[i][1]<min[1])){ 
					min[0]=m[i][0];
					min[1]=m[i][1];
					index=i;
				}
			}
			if(index!=row){
				m[index][0]=m[row][0];
				m[index][1]=m[row][1];
				m[row][0]=min[0];
				m[row][1]=min[1]; 
			}
		}
	}
	
	public static boolean isAllRowsEven1s(int[][] m){
		int count=0;
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				if(m[i][j]==1)
					count++;
			}
			if(count%2!=0)
				return false;
		}
		return true;
	}
	
	public static boolean isAllColumnsEven1s(int[][] m){
		int count=0;
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				if(m[j][i]==1)
					count++;
			}
			if(count%2!=0)
				return false;
		}
		return true;
	}
	
	public static double[][] sortRows(double[][] m){
		double[][] s=new double[m.length][m[0].length];
		copyMatrix(m,s);
		for(int row=0;row<s.length;row++){
			for(int col=0;col<s.length-1;col++){
				double min=s[row][col];
				int index=col;
				for(int j=col+1;j<s.length;j++){
					if(min>s[row][j]){
						min=s[row][j];
						index=j;
					}
				}
				if(index!=col){
					s[row][index]=s[row][col];
					s[row][col]=min;
				}
			}
		}
		return s;
	}
	public static void copyMatrix(double[][] original, double[][] copy){
		for(int i=0;i<original.length;i++){
			for(int j=0;j<original[i].length;j++){
				copy[i][j]=original[i][j];
			}
		}
	}
}
