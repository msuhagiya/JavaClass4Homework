import java.util.Scanner;
public class PrintInterchangedValue {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value of number1 number2: ");
        System.out.println("Number1: ");
        number1= scan.nextInt();
        System.out.println("Number2: ");
        number2= scan.nextInt();
        System.out.println("Before interchanged Value: " + number1 +" " + number2);
        number3=number1;
        number1=number2;
        number2=number3;
        System.out.println("Number1: "+ number1);
        System.out.println("Number2: " + number2);
        System.out.println("After interchanged value: " + number1 +" " + number2);
    }
}
