import java.util.Scanner;
public class FindAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, n4, n5, average;
        System.out.println("Please enter five number: " );
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        n5 = scan.nextInt();
        average = (n1+n2+n3+n4+n5)/5;
        System.out.println("Average of five number: " + average);

    }


}
