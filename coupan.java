import java.util.*;

public class coupan {
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);

        Set<Integer> coupleNumbers = new HashSet<Integer>();

        System.out.println("Enter the number of Couple Numbers: ");
        int N = scannerObject.nextInt();

        int maximumElement = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            Integer currNum = scannerObject.nextInt();
            maximumElement = Math.max(maximumElement, currNum);
            coupleNumbers.add(currNum);
        }

        Random rand = new Random();
        int generatedCount = 0;

        while (coupleNumbers.size() > 0) {
            System.out.println("Inside");
            int currentNum = rand.nextInt(maximumElement + 1);
            System.out.println(currentNum);
            if (coupleNumbers.contains(currentNum)) {
                coupleNumbers.remove(currentNum);
            }
            generatedCount++;
        }

        System.out.println("Random numbers required to be generated to get all couple numbers is: " + generatedCount);

        scannerObject.close();

    }
}