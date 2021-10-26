import java.util.Scanner;
public class EnterSymbolAndUseFunction {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num1, num2;
    int sum, sub, multi, div;
    char symbol;
        System.out.println("Pleas enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Please enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Please enter any (+,-,*,/): ");
        symbol= scan.next().charAt(0);
      if (symbol=='+') {
          sum = num1 + num2;
          System.out.println("Addition: " + sum);
      }else if (symbol=='-'){
          sub=num1-num2;
          System.out.println("Subtraction: " + sub);
      }else if(symbol=='*'){
          multi=num1*num2;
          System.out.println("Multiplication: " + multi);
      }else if(symbol=='/'){
          div=num1/num2;
          System.out.println("DiVision: " + div);
      }else {
          System.out.println("Invalid symbol");
      }
    }
}
