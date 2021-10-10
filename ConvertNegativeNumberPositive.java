package week1.day1.assignment;

public class ConvertNegativeNumberPositive {

	public static void main(String[] args) {
// If else statement used to convert the negative number
//declaration of integer
		int num = -10;
//check the number is negative:
		if (num < 0) {
// convert the negative number to positive number using Math.abs
			System.out.println("The provided number is " + num + " Converted number is " +Math.abs(num));
		} else {
			System.out.println("The provided number is postive number " + num);

		}
	}

}
