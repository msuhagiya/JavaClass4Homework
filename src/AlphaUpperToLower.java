import java.util.Scanner;
public class AlphaUpperToLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char alphaUp;
        System.out.println("Please enter any alphabet in uppercase: ");
        alphaUp = scan.next().charAt(0);
        int ascii = alphaUp;
        if(ascii>=65 && ascii<=90)
        {
            ascii = ascii + 32;
            char alphaLow = (char)ascii;
            System.out.println("Equivalent Character in Lowercase = " + alphaLow);
        } else
            System.out.println("Invalid Input!");
    }
}
