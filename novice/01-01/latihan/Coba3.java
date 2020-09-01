import java.util.Scanner;
public class Coba3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your age:");
       int age = Integer.parseInt(scanner.nextLine());
       if (age == 25){
           System.out.println("Hey, I'm 25 too!");
           System.out.println("Nice to meet you");
       } 
       else {
           System.out.println("Nice to meet you, I'm 25");
       }
       System.out.println("Thanks for your age");
    }
    
}