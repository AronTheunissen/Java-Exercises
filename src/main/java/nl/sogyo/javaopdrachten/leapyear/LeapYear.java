import java.util.Scanner;
public class LeapYear {
	
	public static void main (String[] args)  {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year:");
		year = scan.nextInt();
		scan.close();
		boolean leapCheck = false;
		
		if(year % 400 == 0){
			leapCheck = true;
		}
		else if(year % 100 != 0 && year % 4 == 0){
			leapCheck = true;
		}
		else {
			leapCheck = false;
		}
		
		if(leapCheck ==true)
			System.out.println("Yes, " + year + " is a leap year.");
		else
			System.out.println("No, " + year + " is not a leap year.");
	}
}