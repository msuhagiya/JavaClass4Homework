import java.util.Scanner;
public class GrossSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float hra,da,ta,pf,grossSalary;
        System.out.println("Enter employee ID: " );
        String employeeId = scan.nextLine();
        System.out.println("Enter employee name: " );
        String employeeName = scan.nextLine();
        System.out.println("Enter employee basic salary: " );
        float basicSalary = scan.nextFloat();
        hra = (basicSalary/100)*10;//10% of basic salary
        System.out.println("Employee HRA is: " + hra );
        da = (basicSalary/100)*8;//8% of basic salary
        System.out.println("Employee DA is: " + da);
        ta = (basicSalary/100)*9;//9% of basic salary
        System.out.println("Employee TA is: " + ta);
        pf = (basicSalary/100)*20; //20% of basic salary
        System.out.println("Employee PF is: " + pf);
        grossSalary = basicSalary + hra + da + ta - pf;
        System.out.println("Employee gross salary: " + grossSalary);


    }
}
