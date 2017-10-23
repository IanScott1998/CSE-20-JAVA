import java.util.Scanner; 
public class lab4 {
	
	public static void main(String[] args) {
		System.out.println("This program will ask the user for two numbers, and will run calculations with those numbers");

		Scanner input = new Scanner(System.in);

		double n1, n2;
		double result;
		
		float t1, t2;
		float tesult;
		
		int s1,s2;
		int sesult;

		System.out.println("Please enter the first number:");
		n1 = input.nextInt();
		
		System.out.print("Please enter the second number:");
		n2 = input.nextInt();
		//+,-,*,/,% of numbers
		result = n1+n2;
		System.out.println(n1+"+"+n2+"="+result);
		
		result = n1-n2;
		System.out.println(n1+"-"+n2+"="+result);
		
		result = n1*n2;
		System.out.println(n1+"*"+n2+"="+result);
		
		result = n1/n2;
		System.out.println(n1+"/"+n2+"="+result);
		
		result = n1%n2;
		System.out.println(n1+"%"+n2+"="+result);
		
		System.out.println("Now with doubles.");
		System.out.println("enter a double");
		n1 = input.nextDouble();
		System.out.println("enter another double");
		n2 = input.nextDouble();
		
		result = n1+n2;
		System.out.println(n1+"+"+n2+"="+result);
		
		result = n1-n2;
		System.out.println(n1+"-"+n2+"="+result);
		
		result = n1*n2;
		System.out.println(n1+"*"+n2+"="+result);
		
		result = n1/n2;
		System.out.println(n1+"/"+n2+"="+result);
		
		result = n1%n2;
		System.out.println(n1+"%"+n2+"="+result);
		
		System.out.println("Now with floats.");
		System.out.println("enter a float");
		t1 = input.nextFloat();
		System.out.println("enter another float");
		t2 = input.nextFloat();
		
		tesult = t1+t2;
		System.out.println(t1+"+"+t2+"="+tesult);
		
		tesult = t1-t2;
		System.out.println(t1+"-"+t2+"="+tesult);
		
		tesult = t1*t2;
		System.out.println(t1+"*"+t2+"="+tesult);
		
		tesult = t1/t2;
		System.out.println(t1+"/"+t2+"="+tesult);
		
		tesult = t1%t2;
		System.out.println(t1+"%"+t2+"="+tesult);
		
		System.out.println("Now with shorts.");
		System.out.println("enter a short");
		s1 = input.nextShort();
		System.out.println("enter another short");
		s2 = input.nextShort();
		
		sesult = s1+s2;
		System.out.println(s1+"+"+s2+"="+sesult);
		
		sesult = s1-s2;
		System.out.println(s1+"-"+s2+"="+sesult);
		
		sesult = s1*s2;
		System.out.println(s1+"*"+s2+"="+sesult);
		
		sesult = s1/s2;
		System.out.println(s1+"/"+s2+"="+sesult);
		
		sesult = s1%s2;
		System.out.println(s1+"%"+s2+"="+sesult);
	}

}
