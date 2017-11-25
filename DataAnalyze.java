import java.util.Scanner;

import java.util.Arrays; 

public class DataAnalyze {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the sample size:");
		int max = input.nextInt(); 
		int i = 0;
		
		int[]arr1 = new int[max];
		int[]arr2 = new int[max];
		int[]arr3 = new int[max];
		int[]arr4 = new int[max];
		
		double avg1 = 0;
		double avg2 = 0;
		double avg3 = 0;
		double avg4 = 0;
		
		double minavg = 0;
		double maxavg = 0;
		
		System.out.println("Enter the numbers for trial 1:");
		for (i = 0; i<max; i++) {
			System.out.println("Enter sample #1:"+i);
			arr1[i] = input.nextInt();
			avg1 += arr1[i];
		}
		
		avg1 = avg1/max;
		
		System.out.println("Enter the numbers for trial 2:");
		for (i = 0; i<max; i++) {
			System.out.println("Enter sample #2:"+i);
			arr2[i] = input.nextInt();
			avg2 += arr2[i];
		}
		
		avg2 = avg2/max;
		
		System.out.println("Enter the numbers for trial 3:");
		for (i = 0; i<max; i++) {
			System.out.println("Enter sample #3:"+i);
			arr3[i] = input.nextInt();
			avg3 += arr3[i];
		}
		
		avg3 = avg3/max;
		
		System.out.println("Enter the numbers for trial 4");
		for (i = 0; i<max; i++) {
			System.out.println("Enter sample #4:"+i);
			arr4[i] = input.nextInt();
			avg4 += arr4[i];
		}
		
		avg4 = avg4/max;
		
		System.out.println("Sample #\t Trial 1 \t Trial 2 \t Trial 3 \t Trial 4");
		
		for (i = 0; i<max; i++) {
			System.out.println(i +"\t \t"+ arr1[i] +"\t \t"+ arr2[i] +"\t \t"+ arr3[i] +"\t \t"+ arr4[i]);
		}
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Average: \t"+avg1+"\t \t"+avg2+"\t \t"+avg3+"\t \t"+avg4);
		
		minavg = avg1;
		maxavg = avg1;
		
		if(minavg>avg2) {
			minavg=avg2;
		}
		if(minavg>avg3) {
			minavg=avg3;
		}
		if(minavg>avg4) {
			minavg=avg4;
		}
		
		if(maxavg<avg2) {
			maxavg=avg2;
		}
		if(maxavg<avg3) {
			maxavg=avg3;
		}
		if(maxavg<avg4) {
			maxavg=avg4;
		}
		
		System.out.println("Min Average: "+minavg);
		System.out.println("Max Average: "+maxavg);
		
		if(maxavg == minavg) {
			System.out.println("The trials match exactly");
		}else if(maxavg<minavg*2) {
			System.out.println("The trials concur");
		}else {
			System.out.println("The trials do not concur");
		}
	}

}
