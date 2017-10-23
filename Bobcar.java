import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		int type = 0;
		String rental = "";
		int cost = 0;
		int club = 0;
		int days = 0;
		int base = 0;
		double plat = 0;
		int yes = 0;
		double total = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Hello, welcome to Bobcar how can we help you?");
		
		while(true) {
		System.out.println("to rent Economy press 1, for Compact press 2, or for standard press 3");
		type = in.nextInt();
		if(type == 1) {
			rental = "Economy";
			cost = 35;
			break;
		} else if(type == 2){
			rental = "Compact";
			cost = 45;
			break;
		} else if(type == 3) {
			rental = "Standard";
			cost = 95;
			break;
		}else {
			System.out.println("input not recognized");
			}
		}
		
		System.out.println("So You would like to rent "+ rental + " for "+cost+" dollars per day.");
		
		System.out.println("How many days would you like to rent the car?");
		while (true) {
			days=in.nextInt();
			if(days>=0) {
				break;
			}else {
				System.out.println("Input invalid please try again.");
			}
		}
		base = cost*days;
		System.out.println("So you would like to rent for "+days+". The base price for this rental is: "+base);
		
		System.out.println("Are you a club member?");
		while (true) {
			System.out.println("Please press 1 for yes or 2 for no.");
			club = in.nextInt();
			if(club == 1) {
				break;
			}else if(club == 2){
				break;
			}else {
				System.out.println("Input not recognised. Please try again.");
			}
		}
		if(club==1) {
			plat = base*.15;
			base = (base-(days/7)*cost);
			System.out.println("Your club member discount reduced the price to: "+base);
			while(true) {
				System.out.println("Would you like to add the Platinum Executive Package for $"+plat+"? Press 1 for yes or 2 for no");
				yes=in.nextInt();
				if(yes==1) {
					break;
				}else if(yes == 2){
					plat = 0;
					break;
				}else {
					System.out.println("Input invalid please try again.");
				}
			}
		}
		total = base+plat;
		System.out.println("Great your total is: "+total);
	}

}
