import java.util.Scanner;

public class Tuition 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double tuition = 0;
		double rate = 0;
		
		System.out.println("What is the initial cost of tuition:");
		tuition = scan.nextDouble();
		System.out.println("What is the rate increase of tuition:");
		rate = scan.nextDouble();
		
		System.out.print(tuition*Math.pow((1+(rate/100)), 4));
	}
}
