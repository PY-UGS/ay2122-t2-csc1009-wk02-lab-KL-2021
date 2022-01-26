import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		double[] numnber = new double[3];
		double avg, sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");

		for(int i = 0; i < numnber.length; i++){
			numnber[i] = input.nextDouble();
			sum += numnber[i];
		}

		avg = sum/numnber.length;

		System.out.println("The average of " + numnber[0] + " " + numnber[1] + " " + numnber[2] + " is " + avg);
		input.close();
	}
}
