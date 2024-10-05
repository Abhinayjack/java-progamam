/*
 Program 04:
-----------
Write a program to input the basic salary of a person. He gets 15% of the basic as HRA, 15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance. The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance. Calculate and print the total salary of person.
Take the Basic Salary from Command Line Argument

*/
package simplejavapro;

public class Basicsalary {

	public static void main(String[] args) {
		System.out.println("enter the basic salray");
		   double n = Double.parseDouble(args[0]);
		  double hra=n*(0.15);
		  System.out.println("15% get HRA"+hra);
		  double conveyanceAllwoance=n*(0.15);
		  System.out.println("15% get conveyanceAllwoance "+conveyanceAllwoance);
		  double EnterimentAllowance=n*(0.10);
		  System.out.println("10% get EnterimentAllowance "+EnterimentAllowance);
		  double Totalsalary=n+hra+conveyanceAllwoance+EnterimentAllowance;
		  System.out.println("total salary of person"+Totalsalary);
		  
	}

}
