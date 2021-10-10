//https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day1/classroom/Factorial.java
package week1.day1.assignment;

public class Factorial {
	public static void main(String[] args) {
		// Declare your input as 5
		int n = 5;
		
		// Declare an integer variable fact as 1
		int fact =1;

		// Iterate from 1 to your input (tip: using loop concept)
		for (int i=n; i>0; i--) {
			
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact = fact*i;			
		}
		System.out.print("Factorial of " + n +": "+ fact);
	}
	
}
