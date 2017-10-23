import java.util.Scanner;

public class interviewer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		String answer;
		String answer1;
		String answer2;
		String answer3;
		int answer4;
		double kgs;
		System.out.print("What is your name? ");
		name = input.next();
		//System.out.println("Their name is " + name);
		
		System.out.print("How much prior experience do you have with coding?");
		answer = input.nextLine();
		//System.out.println(name+" said, "+answer);
		
		System.out.print("Do you ever code outside class? If so why?");
		answer1 = input.nextLine();
		//System.out.println(name+" responded: "+answer1);
		
		System.out.print("What is your preferred operating system and why?");
		answer2 = input.nextLine();
		//System.out.println(name+"'s favourite operating system is: "+answer2);
		
		System.out.print("What programming languages have you used before?");
		answer3 = input.nextLine();
		//System.out.println(name+ " has used: "+answer3);
		
		System.out.println("What is your weight in pounds?");
		answer4 = input.nextInt();
		kgs = answer4 / 2.2;
		
		System.out.println(name +" has "+answer+" prior experiance with coding. "+name+" says they "+answer1+". ");
		System.out.println(name+"'s favourite operating system is "+answer2+ ". "+name+" has used "+answer3+". ");
		System.out.println(name+" weighs "+ kgs+" kilograms.");
		//xdeng7

	}

}
