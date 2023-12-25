import java.util.*;

public class prime {

    static boolean checkPrimality(int N) {

        if (N == 0 || N == 1)
            return false;
        if (N == 2)
            return true;

        for (int i = 2; i <= ((int) Math.pow(N, 0.5)); i++)
            if (N % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scannerObject.nextInt();

        if (checkPrimality(N))
            System.out.println(N + " is a prime number");
        else
            System.out.println(N + " is not a prime number.");

        scannerObject.close();
    }
}