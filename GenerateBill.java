/*
-----------
Write a  program in Java that will generate and print
the bill at Dominos 
for four chicken rolls (@ Rs 60 per chicken rolls) and
three vegetable puffs (@ Rs 25 per vegetable puffs). 
There is a special discount of Rs 50 on the final bill amount.
Calculate and print final bill as well as all item bill.
*/
package simplejavapro;

public class GenerateBill {

	public static void main(String[] args) {
		System.out.println("enter the number of  chicken roll");
	    int n1=Integer.parseInt(args[0]);
		System.out.println("enter the price of  chicken roll");
		int n2=Integer.parseInt(args[1]);
		
		System.out.println("three vegetable puffs (@ Rs 25 per vegetable puffs");
		
		int n3=Integer.parseInt(args[2]);
       System.out.println("enter the price");
		int n4=Integer.parseInt(args[3]);
		
		
        int totalbill= (n1*n2)+(n3*n4);
        System.out.println("total bill"+totalbill);
       
        int finalbill= totalbill-50;
        System.out.println("final bill"+finalbill);

	}

}
