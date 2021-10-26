import java.util.Scanner;

public class CityNameAsAlphabet {
    public static void main(String[] args)
    { char alpha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        alpha = scan.next().charAt(0);
        if(alpha=='a' || alpha=='A'){
            System.out.println("City name is Ahemdabad");
        }else if(alpha=='b' || alpha=='B'){
            System.out.println("City name is Baroda");
        }else if(alpha=='c' || alpha=='C'){
            System.out.println("City name is Cambridge");
        }else if(alpha=='d' || alpha=='D'){
            System.out.println("City name is Delhi");
        }else if(alpha=='e' || alpha=='E'){
            System.out.println("City name of Etah");
        }else if(alpha=='f' || alpha=='F'){
            System.out.println("City name if Faridabad");
        }
        else {
            System.out.println("Invalid entry");
        }

    }

}
