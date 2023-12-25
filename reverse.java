import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter any integer: ");
        int N = scannerObject.nextInt();
        int copyN = N;

        int reversedInt = 0;

        if (N == 0) {
            System.out.println("Reverse of " + N + " is: " + reversedInt);
        } else {

            boolean isNegative = false;
            if (N < 0) {
                isNegative = true;
                copyN *= -1;
            }
            while (copyN != 0) {
                reversedInt *= 10;
                reversedInt += copyN % 10;
                copyN /= 10;
            }

            if (isNegative)
                reversedInt *= -1;

            System.out.println("Reverse of " + N + " is: " + reversedInt);
        }

        scannerObject.close();
    }
}