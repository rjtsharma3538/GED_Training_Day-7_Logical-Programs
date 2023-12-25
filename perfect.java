import java.util.*;

public class perfect {

    static void findFactors(int N, ArrayList<Integer> factors) {
        for (int i = 1; i <= ((int) Math.pow(N, 0.5)); i++) {
            if (N % i == 0) {
                factors.add(i);
                if (N / i != i)
                    factors.add(N / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scannerObject.nextInt();

        ArrayList<Integer> factors = new ArrayList<>();
        findFactors(N, factors);

        int factorSum = 0;
        for (Integer currentFactor : factors) {
            factorSum += currentFactor;
        }

        if (factorSum == 2 * N) {
            System.out.println(N + " is a perfect number.");
        } else {
            System.out.println(N + " is not a perfect number.");
        }

        scannerObject.close();
    }
}