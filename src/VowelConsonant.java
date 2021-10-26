import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        char alpha;
        System.out.println("Please provide a single character from the alphabet: ");
        alpha=scan.next().charAt(0);
        if(alpha=='a'|| alpha=='e'|| alpha=='i'|| alpha=='o'|| alpha=='u'|| alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O'|| alpha=='U'){
            System.out.println(alpha + " letter is vowel");
        }else {
            System.out.println(alpha + " letter is consonant.");
        }
    }
}
