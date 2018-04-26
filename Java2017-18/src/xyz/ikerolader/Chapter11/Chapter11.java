package xyz.ikerolader.Chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chapter11 {
	public static void println(Object line) {
		System.out.println(line);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
//		println(11.2);
//		Person person = new Person("John", "123 Main Street", "5763569864", "john@gmail.com");
//		Student student = new Student("Mary", "234 Main Street", "8645687575", "mary@gmail.com", Student.FRESHMAN);
//		Employee employee = new Employee("Mike", "345 Main Street", "4570424694", "mike@gmail.com", 910, 60000);
//		Faculty faculty = new Faculty("Sue", "456 Main Street", "4781479684", "sue@gmail.com", 101, 50000, "4pm to 6pm", "Professor");
//		Staff staff = new Staff("Tom", "567 Main Street", "5326895367", "tom@gmail.com", 12, 65000, "Executive Assistant");
//		println(person.toString());
//		println(student.toString());
//		println(employee.toString());
//		println(faculty.toString());
//		println(staff.toString());
//		
//		println(11.4);
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		System.out.print("Enter a sequence of numbers ending wih 0: ");
//		Integer number = input.nextInt();
//		while (number.intValue() != 0) {
//			list.add(number);
//			number = input.nextInt();
//		}
//		System.out.println("The largest number in the input is " + max(list));
//		
//		println(11.8);
//		Account account = new Account("George", 1122, 1000);
//		account.setAnnualInterestRate(1.5);
//		account.deposit(30);
//		account.deposit(40);
//		account.deposit(50);
//		account.withdraw(5);
//		account.withdraw(4);
//		account.withdraw(2);
//		println("       Account Summary"); 
//		println("------------------------------------");
//		println("Account holder name: " + account.getName());
//		println("Interest rate: " + account.getAnnualInterestRate());
//		System.out.printf("Balance: $%.2f\n", account.getBalance());
//		println("\n     List of transactions");
//		println("------------------------------------");
//		for (int i = 0; i < account.getTransactions().size(); i++) {
//			println("Date: " + 
//				(account.getTransactions()).get(i).getDate());
//			println("Type: " + 
//				(account.getTransactions()).get(i).getType());
//			println("Amount: " + 
//				(account.getTransactions()).get(i).getAmount());
//			println("Balance: " + 
//				(account.getTransactions()).get(i).getBalance());
//			println("Description: " + 
//				(account.getTransactions()).get(i).getDescription());
//			println("");
//		}
//		
//		println(11.14);
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		println("Enter five integers for list1");
//		fill(list1);
//		println("Enter five integers for list2");
//		fill(list2);
//		ArrayList<Integer> list3 = union(list1, list2);
//		println("The combined list is");
//		for (int i = 0; i < list3.size(); i++) {
//			System.out.print(list3.get(i) + " ");
//		}
//		
//		println(11.16);
//		int number1 = (int)(Math.random() * 10);
//		int number2 = (int)(Math.random() * 10);
//		ArrayList<Integer> answers = new ArrayList<Integer>();
//		System.out.print(
//			"What is " + number1 + " + " + number2 + "? ");
//		int answer = input.nextInt();
//		while (number1 + number2 != answer) {
//			if (answers.contains(answer))
//				println("You already entered " + answer);
//			else {
//				System.out.print("Wrong answer. Try again. What is "
//					+ number1 + " + " + number2 + "? ");
//				answers.add(answer);
//			}
//			answer = input.nextInt();
//		}
//		println("You got it!");
//		
//		println(11.17);
//		println("Enter a number");
//		int baseNum=input.nextInt();
//		int tryNum=0;
//		boolean solved=false;
//		while (solved==false) {
//			tryNum++;
//			solved=Math.sqrt(baseNum*tryNum)%1==0;
//		}
//		println(tryNum);
		
		
	}
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0)
			return null;

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
	
	public static ArrayList<Integer> union(
			ArrayList<Integer> list1, ArrayList<Integer> list2) {
			ArrayList<Integer> list3 = list1;
			for (int i = 0; i < list2.size(); i++) {
				list3.add(list2.get(i));
			}
			return list3;
		}	
		public static void fill(ArrayList<Integer> list) {
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				list.add(input.nextInt());
			}
		}
}
