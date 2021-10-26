import java.util.Scanner;
public class SalesCommission {
    public static void main(String[] args) {
        float commission;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sales ID: ");
        String salesId = scan.nextLine();
        System.out.println("Enter seller's name :");
        String sellerName = scan.nextLine();
        System.out.println("Enter sales amount: ");
        float salesAmount = scan.nextFloat();
        System.out.println("Enter basic salary: ");
        float basicSalary = scan.nextFloat();

        if(salesAmount>=50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Commission amount is: " + commission);

        }else if(salesAmount>=30000){
                commission = (salesAmount*20)/100;
                System.out.println("Commission amount is: " + commission);
            }else if (salesAmount>=20000){
            commission = (salesAmount*10)/100;
            System.out.println("Commission amount is: " + commission);
        }else if(salesAmount>=10000){
            commission = (salesAmount*5)/100;
            System.out.println("Commission amount is: " + commission);
        }else if (salesAmount<10000){
            commission = (salesAmount*2)/100;
            System.out.println("Commission amount is: " + commission);
        }
        }

}
