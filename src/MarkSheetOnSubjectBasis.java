import java.util.Scanner;
public class MarkSheetOnSubjectBasis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float Total, Percentage;
        System.out.println("Please enter student name: ");
        String studentName = scan.nextLine();
        System.out.println("Please enter student roll number: ");
        int rollNumber = scan.nextInt();
        System.out.println("English Marks: ");
        int english = scan.nextInt();
        if (english >= 35) {
            System.out.println("English: " + " Pass");

            System.out.println("Maths Marks: ");
            int maths = scan.nextInt();
            if (maths>=35) {
                System.out.println("Maths: Pass");

                System.out.println("Science Marks: ");
                int science = scan.nextInt();
                if (science>=35){
                    System.out.println("Science: Pass");
                    Total= english+maths+science;
                    System.out.println("Total Marks of three sub: " + Total);
                    Percentage=Total/300*100;
                    System.out.println("Percentage: " + Percentage);
                    if(Percentage>=80){
                        System.out.println("Student Grade:" + " A+");
                    }else if (Percentage>=60){
                        System.out.println("Student Grade:" + " A");
                    }else if (Percentage>=50){
                        System.out.println("Student Grade: " + " B");
                    }else  if (Percentage>=35){
                        System.out.println("Student Grade: " + " C");
                    }
                }else {
                  System.out.println("Science: Fail");
                }
            }else{
                System.out.println("Maths: Fail");
            }
        }else {
            System.out.println(english + ": " + "Fail");
        }

    }

}
