import java.util.Scanner;

public class OddEvenTernary {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number1 : ");
        int number1 = scan.nextInt();
        String Output1 = (number1 % 2 == 0) ? "even" : "odd";
        System.out.println(number1 + " is " + Output1);
        System.out.println("Please enter a number2 : ");
        int number2 = scan.nextInt();// java odd or even ternary operator

        String Output2 = (number2 % 2 == 0) ? "even" : "odd";
        System.out.println(number2 + " is " + Output2);

    }
}

