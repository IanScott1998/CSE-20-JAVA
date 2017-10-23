import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		double num = 0;
		
			while (loop == true){
				System.out.print("Please enter a number 0-25: ");
				num = input.nextDouble();
				if (num >=0 && num <=25){
					loop = false;
				}
				else{
					System.out.println("Your number, "+ num + ", is invalid please try again.");
				}
			}
		System.out.println("You have entered " + num);
		System.out.println((char)('A'+num));
		input.close();
	}

}
