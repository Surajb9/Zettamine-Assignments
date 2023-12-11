package com.zettamine.day2;

public class Loan {
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount;
		if(employeeObj instanceof PermanentEmployee ) {
			loanAmount = employeeObj.salary * 15/100;
			return loanAmount;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			loanAmount = employeeObj.salary * 10/100;
			return loanAmount;
		}
		else {
			return -1;
		}
	}

}
