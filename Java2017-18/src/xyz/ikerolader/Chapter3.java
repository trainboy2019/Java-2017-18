package xyz.ikerolader;

import java.util.Scanner;


public class Chapter3 {
	public static void println(Object line) {
		System.out.println(line);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
//		println("3.4");
//		double monthD=(Math.random());
//		monthD=monthD*10;
//		int month=(int)monthD;
//		if(Math.random()<=0.5&&month<=2) {
//			month=month+10;
//		}
//		if(month==0) {
//			month=1;
//		}
//		switch(month) {
//		case 1: println("January");break;
//		case 2: println("February");break;
//		case 3: println("March");break;
//		case 4: println("April");break;
//		case 5: println("May");break;
//		case 6: println("June");break;
//		case 7: println("July");break;
//		case 8: println("August");break;
//		case 9: println("September");break;
//		case 10: println("October");break;
//		case 11: println("November");break;
//		case 12: println("December");break;
//		}
//		
//		println("3.5");
//		println("Enter a day of the week. (0=Sunday, 6=Saturday) After that, enter the number of days in the future you want.");
//		int day=input.nextInt();
//		int future=input.nextInt();
//		future=(future+day)%7;
//		switch(future) {
//		case 0: println("Sunday");break;
//		case 1: println("Monday");break;
//		case 2: println("Tuesday");break;
//		case 3: println("Wednesday");break;
//		case 4: println("Thursday");break;
//		case 5: println("Friday");break;
//		case 6: println("Saturday");break;
//		}
//		
//		println("3.6");
//		println("weight in pounds");
//		double weight=input.nextDouble();
//		println("feet");
//		double feet=input.nextDouble();
//		println("inches");
//		double inches=input.nextDouble();
//		double height=inches+(feet*12);
//		final double KILO_PER_POUND=0.454359237;
//		final double METERS_PER_INCH=0.0254;
//		double weightKilo=weight*KILO_PER_POUND;
//		double heightMeters=height*METERS_PER_INCH;
//		double bmi=weightKilo/(heightMeters*heightMeters);
//		println(bmi);
//		if(bmi<18.5)
//			println("underweight");
//		else if(bmi<25)
//			println("normal");
//		else if(bmi<30)
//			println("overweight");
//		else
//			println("obese");
//		
//		println("3.7");
//		System.out.print("Enter amount as a decimal");
//		double amount=input.nextDouble();
//		int remaining=(int)(amount*100);
//		int dollars=remaining/100;
//		remaining=remaining%100;
//		int quarters=remaining/25;
//		remaining=remaining%25;
//		int dimes=remaining/10;
//		remaining=remaining%10;
//		int nickels=remaining/5;
//		remaining=remaining%5;
//		int pennies=remaining;
//		System.out.println(dollars);
//		if(dollars==1)
//			println("dollar");
//		else
//			println("dollars");
//		System.out.println(quarters);
//		if(quarters==1)
//			println("quarter");
//		else
//			println("quarters");
//		System.out.println(dimes);
//		if(dimes==1)
//			println("dime");
//		else
//			println("dimes");
//		System.out.println(nickels);
//		if(nickels==1)
//			println("nickel");
//		else
//			println("nickels");
//		System.out.println(pennies);
//		if(pennies==1)
//			println("penny");
//		else
//			println("pennies");
//		
//		println("3.8");
//		println("enter 3 numbers");
//		int a=input.nextInt();
//		int b=input.nextInt();
//		int c=input.nextInt();
//		boolean aLow=(a<b&&a<c);
//		boolean bLow=(b<a&&b<c);
//		boolean cLow=(c<a&&c<b);
//		boolean aHi=(a>b&&a>c);
//		boolean bHi=(b>a&&b>c);
//		boolean cHi=(c>a&&c>b);
//		if(aLow&&bHi)
//			println(a+" "+c+" "+b);
//		if(aLow&cHi)
//			println(a+" "+b+" "+c);
//		if(bLow&&aHi)
//			println(b+" "+c+" "+a);
//		if(bLow&&cHi)
//			println(b+" "+a+" "+c);
//		if(cLow&&aHi)
//			println(c+" "+b+" "+a);
//		if(cLow&&bHi)
//			println(c+" "+a+" "+b);
//		
//		println("3.10");
//		double doubA=(Math.random());
//		int numA=(int)(doubA*100);
//		double doubB=(Math.random());
//		int numB=(int)(doubB*100);
//		int realAnswer=numA+numB;
//		println("What is "+numA+"+"+numB+"?");
//		int answer=input.nextInt();
//		if(answer==realAnswer)
//			println("Correct");
//		else
//			println("No, the answer is "+realAnswer);
//		
//		println("3.11");
//		println("enter month number followed by year");
//		int month=input.nextInt();
//		int year=input.nextInt();
//		if(month==2&&year%4==0&&year%100!=0||month==2&&year%400==0)
//			month=13;
//		switch(month) {
//		case 1: println("January "+year+" has 31 days");break;
//		case 2: println("February "+year+" has 28 days");break;
//		case 3: println("March "+year+" has 31 days");break;
//		case 4: println("April "+year+" has 30 days");break;
//		case 5: println("May "+year+" has 31 days");break;
//		case 6: println("June "+year+" has 30 days");break;
//		case 7: println("July "+year+" has 31 days");break;
//		case 8: println("August "+year+" has 31 days");break;
//		case 9: println("September "+year+" has 30 days");break;
//		case 10: println("October "+year+" has 31 days");break;
//		case 11: println("November "+year+" has 30 days");break;
//		case 12: println("December "+year+" has 31 days");break;
//		case 13: println("February "+year+" has 29 days");break;
//		}
//		
//		println("3.12");
//		println("enter a 3 digit number");
//		int num=input.nextInt();
//		int hundred=num/100;
//		num=num%100;
//		int ten=num/10;
//		num=num%10;
//		if(hundred==num)
//			println("yes");
//		else
//			println("no");
//		
//		println("3.13");
//		println("0-single, 1-married jointly or widow, 2-married separately, 3-head of house");
//		int status=input.nextInt();
//		println("enter taxable income");
//		double income=input.nextDouble();
//		double tax=0;
//		switch(status) {
//		case 0:{
//			if(income<=8350)
//				tax=income*0.1;
//			else if(income<=33950)
//				tax=8350*0.1+(income-8350)*0.15;
//			else if(income<=82250)
//				tax=8350*0.10+(33950-8350)*0.15+(income-33950)*0.25;
//			else if(income<=171550)
//				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(income-82250)*0.28;
//			else if(income<=372950)
//				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(income-171550)*0.33;
//			else
//				tax=8350*0.1+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(3729500-171550)*0.33+(income-171550)*0.35;
//		}break;
//		case 1:{
//			if(income<=16700)
//				tax=income*0.1;
//			else if(income<=67900)
//				tax=16700*0.1+(income-16700)*0.15;
//			else if(income<=137050)
//				tax=16700*0.10+(67900-16700)*0.15+(income-67900)*0.25;
//			else if(income<=208850)
//				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(income-137050)*0.28;
//			else if(income<=372950)
//				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(income-208850)*0.33;
//			else
//				tax=16700*0.1+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(3729500-208850)*0.33+(income-171550)*0.35;
//		}break;
//		case 2:{
//			if(income<=8350)
//				tax=income*0.1;
//			else if(income<=33950)
//				tax=8350*0.1+(income-8350)*0.15;
//			else if(income<=68525)
//				tax=8350*0.10+(33950-8350)*0.15+(income-33950)*0.25;
//			else if(income<=104425)
//				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(income-68525)*0.28;
//			else if(income<=186475)
//				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(income-104425)*0.33;
//			else
//				tax=8350*0.1+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(1864750-104425)*0.33+(income-104425)*0.35;
//		}break;
//		case 3:{
//			if(income<=11950)
//				tax=income*0.1;
//			else if(income<=45500)
//				tax=11950*0.1+(income-11950)*0.15;
//			else if(income<=117450)
//				tax=11950*0.10+(45500-11950)*0.15+(income-45500)*0.25;
//			else if(income<=190200)
//				tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(income-117450)*0.28;
//			else if(income<=372950)
//				tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(income-190200)*0.33;
//			else
//				tax=11950*0.1+(45500-11950)*0.15+(117450-45500)*0.25+(190200-117450)*0.28+(3729500-190200)*0.33+(income-190200)*0.35;
//		}break;
//		}
//		println("Tax is "+(int)(tax*100)/100.0);
//		
//		println("3.14");
//		int ans;
//		if(Math.random()>=0.5) {
//			ans=1;
//		}
//		else {
//			ans=0;
//		}
//		println("0=heads, 1=tails");
//		int user=input.nextInt();
//		if(user==ans) {
//			println("yes");
//		}
//		else {
//			println("no");
//		}
//		
//		println("3.15");
//		int lotto1=(int)(Math.random()*10);
//		int lotto2=(int)(Math.random()*10);
//		int lotto3=(int)(Math.random()*10);
//		int lottery=(lotto1*100)+(lotto2*10)+lotto3;
//		println(lottery);
//		boolean guessLoto1 = false, guessLoto2=false, guessLoto3=false;
//
//		// Prompt the user to enter a three-digit number
//		println("Enter 3 numbers");
//		int guess = input.nextInt();
//
//		// Extract digits from guess
//		int guess1 = guess / 100;
//		int remainingDigits = guess % 100;
//		int guess2 = remainingDigits / 10;
//		int guess3 = remainingDigits % 10;
//
//		System.out.println("The lottery number is " + lottery);
//
//		// Check the guess
//		if (guess == lottery)
//			System.out.println("Exact match: you win $10,000");
//		else if (guess1 == lotto1&&guessLoto1==false)
//		{
//			guessLoto1=true;
//		}else if (guess1 == lotto2&&guessLoto2==false)
//		{
//			guessLoto2=true;
//		}else if (guess1 == lotto3&&guessLoto3==false)
//		{
//			guessLoto3=true;
//		}
//		else if (guess2 == lotto1&&guessLoto1==false)
//		{
//			guessLoto1=true;
//		}else if (guess2 == lotto2&&guessLoto2==false)
//		{
//			guessLoto2=true;
//		}else if (guess2 == lotto3&&guessLoto3==false)
//		{
//			guessLoto3=true;
//		}
//		else if (guess3 == lotto1&&guessLoto1==false)
//		{
//			guessLoto1=true;
//		}else if (guess3 == lotto2&&guessLoto2==false)
//		{
//			guessLoto2=true;
//		}else if (guess3 == lotto3&&guessLoto3==false)
//		{
//			guessLoto3=true;
//		}
//		if(guessLoto1&&guessLoto2&&guessLoto3) {
//			println("$3000");
//		}
//		else if(guessLoto1||guessLoto2||guessLoto3) {
//			println("$1000");
//		}
//		
//		println("3.16");
//		double doubA=(Math.random());
//		int width=(int)(doubA*100);
//		double doubB=(Math.random());
//		double doubC=(Math.random());
//		int height=(int)(doubB*100+doubC*100);
//		println("("+width+", "+height+")");
//		
//		println(3.21);
//		int q, h, m, j, k;
//		println("Enter the day of the month, followed by the month, followed by the century, followed by the year of the century");
//		q=input.nextInt();
//		m=input.nextInt();
//		j=input.nextInt();
//		k=input.nextInt();
//		if(m==1) {
//			m=13;
//		}
//		if(m==2) {
//			m=14;
//		}
//		h=(q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5*j))%7;
//		switch(h) {
//		case 0: println("Saturday");break;
//		case 1: println("Sunday");break;
//		case 2: println("Monday");break;
//		case 3: println("Tuesday");break;
//		case 4: println("Wednesday");break;
//		case 5: println("Thursday");break;
//		case 6: println("Friday");break;
//		}
//		
//		println(3.24);
//		int card=(int)((Math.random()*13)+1);
//		int suit=(int)(Math.random()*4);
//		switch(card) {
//		case 1: System.out.print("Ace");break;
//		case 2: System.out.print(card);break;
//		case 3: System.out.print(card);break;
//		case 4: System.out.print(card);break;
//		case 5: System.out.print(card);break;
//		case 6: System.out.print(card);break;
//		case 7: System.out.print(card);break;
//		case 8: System.out.print(card);break;
//		case 9: System.out.print(card);break;
//		case 10: System.out.print(card);break;
//		case 11: System.out.print("Jack");break;
//		case 12: System.out.print("Queen");break;
//		case 13: System.out.print("King");break;
//		}
//		switch(suit) {
//		case 0: System.out.print(" of Spades.");break;
//		case 1: System.out.print(" of Clubs.");break;
//		case 2: System.out.print(" of Hearts.");break;
//		case 3: System.out.print(" of Diamonds.");break;
//		}
//		
//		println(3.26);
//		println("enter number");
//		int num=input.nextInt();
//		boolean both=false, either=false, single=false;
//		if(num%5==0&&num%6==0) {
//			both=true;
//		}
//		if(num%5==0||num%6==0) {
//			either=true;
//		}
//		if(num%5==0^num%6==0) {
//			single=true;
//		}
//		println(num+" divisable by both: "+both);
//		println(num+" divisable by either: "+either);
//		println(num+" divisable by one: "+single);
//		
//		println(3.28);
//		println("enter center coordinate and width and height for 2 rectangles");
//		double acx,acy,aw,ah,bcx,bcy,bw,bh;
//		acx=input.nextDouble();
//		acy=input.nextDouble();
//		aw=input.nextDouble();
//		ah=input.nextDouble();
//		bcx=input.nextDouble();
//		bcy=input.nextDouble();
//		bw=input.nextDouble();
//		bh=input.nextDouble();
//		if ((Math.pow(Math.pow(bcy-acy,2),.05)+bh/2<=ah/2)&&(Math.pow(Math.pow(bcx-acx,2),.05)+bw/2<=aw/2)&&(ah/2+bh/2<=ah)&&(aw/2+bw/2<=aw)){
//			println("second is in first");
//		}
//		else if ((acx+aw/2>bcx-bw)||(acy+ah/2>bcy-bh)){
//			println("second overlaps first");
//		}
//		else {
//			println("no overlap");
//		}
		
		
	}

}
