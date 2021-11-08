import java.util.Scanner;

public class Collatz {

	public static void main (String[] args)  {
	int number;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	number = scan.nextInt();
	scan.close();
	while(number != 1){
		if(number % 2 == 0){
			number = number / 2;
			}
		else
			number = number * 3 + 1;
		System.out.print(number + " ");
		
		}
	}
}
			