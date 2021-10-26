import java.util.Scanner;
public class NumberToWeekDaysName {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int num = scan.nextInt();
        if(num==1){
            System.out.println(num + "st day is Monday.");
        }else if(num==2){
            System.out.println(num + "nd day is Tuesday.");
        }else if (num==3){
            System.out.println(num + "rd day is Wednesday.");
        }else if(num==4){
            System.out.println(num + "th day is Thursday.");
        }else if (num==5){
            System.out.println(num + "th day is Friday.");
        }else if(num==6){
            System.out.println(num + "th day is Saturday.");
        }else if (num==7){
            System.out.println(num + "th day is Sunday.");
        }else {
            System.out.println("Invalid number.");
        }
    }
}
