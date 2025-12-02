import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        if (x > y)
            System.out.println(x + " is greater than " + y);
        else if (x < y)
            System.out.println(y + " is greater than " + x);
        else
            System.out.println("Both numbers are equal.");
    }
}
