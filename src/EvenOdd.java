public class EvenOdd {
    public static void findEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Given number  " + number + " even number." );
        } else {
            System.out.println("Given number " + number + " odd number.");
        }
    }

    public static void main(String[] args) {
       // EvenOdd evenOdd = new EvenOdd(); need to create object when i create non-static method
        findEvenOdd(45);
        findEvenOdd(30);

    }
}

