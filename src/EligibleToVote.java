import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age = scan.nextInt();
        if (age>=18){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("You are not eligible for vote");
        }
    }
}
