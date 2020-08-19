import java.util.Scanner;
public class Condition
{
 	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter some number and I'll calculate a square root:");
         int a = Integer.parseInt(scanner.nextLine());
         if (a > 0){
             System.out.println("The number you entered is greater than 0, so I can calculate it!");
    double root = Math.sqrt(a);
    System.out.println("The square root of " + a + " is " + root);
}
System.out.println("Thanks for the input");
	}
}