import java.util.Scanner;

public class fibannoci {

    static void generateFibonacci(int N) {
        System.out.println("Fibonacci Series: ");
        int secondLast = 0;
        System.out.print(0 + " ");
        if (N == 1) {
            System.out.println();
            return;
        }

        int last = 1;
        System.out.print(1 + " ");
        if (N == 2) {
            System.out.println();
            return;
        }

        for (int i = 3; i <= N; i++) {
            int currNumber = secondLast + last;
            secondLast = last;
            last = currNumber;
            System.out.print(currNumber + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number of elements of Fibonacci to be generated: ");
        int N = scannerObject.nextInt();

        generateFibonacci(N);

        scannerObject.close();

    }
}