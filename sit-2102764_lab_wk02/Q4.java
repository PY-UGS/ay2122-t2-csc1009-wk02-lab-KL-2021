import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		String zodiac;
		int userInput;

		Scanner input = new Scanner(System.in);
		do{
			System.out.print("Enter the year: ");
			userInput = input.nextInt();
		}while(userInput < 1000 || userInput > 9999);

		userInput = userInput % 12;

		switch(userInput){
			case 0:
				zodiac = "monkey";
				break;
			case 1:
				zodiac = "roaster";
				break;
			case 2:
				zodiac = "dog";
				break;
			case 3:
				zodiac = "pig";
				break;
			case 4:
				zodiac = "rat";
				break;
			case 5:
				zodiac = "ox";
				break;
			case 6:
				zodiac = "tiger";
				break;
			case 7:
				zodiac = "rabbit";
				break;
			case 8:
				zodiac = "dragon";
				break;
			case 9:
				zodiac = "snake";
				break;
			case 10:
				zodiac = "horse";
				break;
			case 11:
				zodiac = "sheep";
				break;
			default:
				zodiac = "Invalid zodiac";
				break;
		}

		System.out.println(zodiac);
		input.close();
	}
}
