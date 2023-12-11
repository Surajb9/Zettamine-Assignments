package com.zettamine.day2;

public class LoanMain {

	public static void main(String[] args) {
		Employee e1 = new PermanentEmployee(101,"SriRam",20000.00);
		e1.calculateSalary();
		Employee e2 = new TemporaryEmployee(102,"Hanuma",15,300);
		e2.calculateSalary();
		Loan loan = new Loan();
		double loanAmount1 = loan.calculateLoanAmount(e1);
		System.out.println(loanAmount1);
		double loanAmount2 = loan.calculateLoanAmount(e2);
		System.out.println(loanAmount2);

	}

}
