import java.util.Scanner;
public class AlphaUpperToLower2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphaUp, alphaLow;
        System.out.println("Please enter any alphabet in uppercase: ");
        alphaUp = scan.nextLine();
        alphaLow = alphaUp.toLowerCase();
        System.out.println("Equivalent alphabet in Lowercase = " + alphaLow);
    }
}
