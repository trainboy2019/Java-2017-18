package xyz.ikerolader.Chapter12;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	public Loan() {
		this(2.5,1,1000);
	}
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount){
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate=new java.util.Date();
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate)throws IllegalArgumentException{
		if(annualInterestRate<=0){
			throw new IllegalArgumentException("Annual interest rate must be greater than 0");
		}
		this.annualInterestRate=annualInterestRate;
	}
	public int getNumberOfYears(){
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears)throws IllegalArgumentException{
		if(numberOfYears<=0){
			throw new IllegalArgumentException("Number of years must be greater than 0");
		}
		this.numberOfYears=numberOfYears;
	}
	public double getLoanAmount(){
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount)throws IllegalArgumentException{
		if(loanAmount<=0){
			throw new IllegalArgumentException("Loan amount must be greater than 0");
		}
		this.loanAmount=loanAmount;
	}
	public double getMonthlyPayment(){
		double monthlyInterestRate=annualInterestRate/1200;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
		return monthlyPayment;
	}
	public double getTotalPayment(){
		double totalPayment=getMonthlyPayment()*numberOfYears*12;
		return totalPayment;
	}
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}