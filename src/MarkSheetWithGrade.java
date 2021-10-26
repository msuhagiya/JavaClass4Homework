import java.util.Scanner;
public class MarkSheetWithGrade {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        float TotalMarks, Percentage;
        //String studentName = scan.nextLine();
        //int rollNumber = scan.nextInt();
       // Double english = scan.nextDouble();
        //Double maths = scan.nextDouble();
       // Double science = scan.nextDouble();
        System.out.println("Enter the student name: ");
        String studentName = scan.nextLine();
        System.out.println("Enter student roll number: " );
        int rollNumber = scan.nextInt();
        System.out.println("English marks: " );
        int english = scan.nextInt();
        System.out.println("Maths marks: ");
        int maths= scan.nextInt();
        System.out.println("Science marks: " );
        int science = scan.nextInt();
        TotalMarks = english+maths+science;
        System.out.println("Total marks: " + TotalMarks );
      Percentage=(TotalMarks/300)*100;
        System.out.println("Student Percentage:" + Percentage);

        if(Percentage>=35) {
            System.out.println(studentName + " :" + " Pass");
            if (Percentage >= 80) {
                System.out.println(studentName + " Grade:" + " A+");
                  } else if ( Percentage >= 60) {
                System.out.println(studentName + " Grade:" + " A");
                    } else if ( Percentage >= 50) {
                System.out.println(studentName + " Grade:" + " B");
                      } else if (Percentage >= 35) {
                System.out.println(studentName + " Grade:" + " c");
            }
        } else {
                System.out.println(studentName + " :" + "Fail");
            }
        }
    }

