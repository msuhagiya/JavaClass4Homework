import java.util.Scanner;
public class ValueToFindNumAlphaSymbol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char value;
        System.out.println("Please enter any value: ");
        value=scan.next().charAt(0);
        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {

            System.out.println(value + " is A ALPHABET.");

        } else if(value >= '0' && value <= '9') {

            System.out.println(value + " is A DIGIT.");

        } else {

            System.out.println(value + " is A SPECIAL CHARACTER.");
        }

    }

}
