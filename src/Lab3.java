import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isEven;
		boolean keepGoing = true;
		String userName;
		
		System.out.println("Would you tell me your name? ");
		userName = scan.nextLine();
		System.out.println("");
		
		while (keepGoing) {
			
			System.out.println("Please enter a number between 1 and 100.");
			int userNum = scan.nextInt();
			
			//find if the number entered is even or odd
			if (userNum % 2 == 0) {
				isEven = true;
			}
			
			else {
				isEven = false;
			}
			
			//create the output string
			
			if(userNum > 0 && userNum < 101) {
				
				if (!isEven && userNum <= 60) {
					System.out.println(userName + ", your number is " + userNum + " Odd.");
				}
				else if (isEven && userNum <= 25) {
					System.out.println(userName + ", your number is " + "even and less than 25.");
				}
				else if (isEven && userNum <= 60) {
					System.out.println(userName + ", your number is " + "even.");
				}
				else if (isEven && userNum > 60) {
					System.out.println(userName + ", your number is " + userNum + " even.");
				}
				else if (!isEven && userNum > 60) {
					System.out.println(userName + ", your number is " + userNum + " Odd and over 60");
				}
			}
			
			else {
				System.out.println("You aren't very good with directions, are you? Your number should have been between 1 and 100.");
			}
			
			System.out.println("Continue? (y/n)");
			String input = scan.next();
			if (input.equals("y")){
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
		System.out.println("Goodbye!");
		
		scan.close();
	}

}
