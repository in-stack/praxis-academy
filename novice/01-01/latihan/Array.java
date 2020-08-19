import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        int [] number = {2, 3, 5, 7};
        number[0] =1;

        for (int i : number) {
            System.out.printf ("%d ", i);
        }
    }
}