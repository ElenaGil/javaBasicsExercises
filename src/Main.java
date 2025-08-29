import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// ARRAY_EXERCISES
// ============================================================================

        // Level 1
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        //------------------------
        String[] names = { "Anna", "Max", "Peter", "Monika" };
        for (String name : names) {
            System.out.println(name);
        }

        //------------------------
        int[] nums = { 2, 4, 6, 8 };
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(Math.pow(nums[i], 2));
        }

        // Level 2
        int[] tenNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < tenNums.length ; i++) {
            System.out.print(tenNums[i] % 2 == 0 ? tenNums[i] : " ");
        }
        System.out.println();
        for (int num : tenNums) {
            System.out.print(num % 2 == 0 ? num : " ");
        }
        System.out.println();

        //------------------------
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Die Summe:" + sum);

        //------------------------
        String[] cities = { "Berlin", "Hamburg", "Uelze", "Moskau" };
        System.out.println();
        for (int i = 0; i < cities.length; i++) {
            System.out.println(i+1 + ". " + cities[i]);
        }

        //------------------------
        int[] numArr = { 12, 24, 3, 48, 5, 60, 71, 18, 9, 10 };
        int min = numArr[0];
        int max = numArr[0];
        for (int num : numArr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Level 3
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = 2 * numArr[i];
            System.out.println(numArr[i]);
        }

        //------------------------
        String[] lastNames = { "Schmidt", "Mustermann", "Hase", "Schreibikus" };

        System.out.println("_NAMES_:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + lastNames[i]);
        }

        //------------------------
        int[] threeNums = new int[3];
        System.out.println("---- Nenne 3 Ganzzahlen ----");

        for (int i = 1; i <= threeNums.length; i++) {
            System.out.println("Nenne Zahl " + i + ":");
            threeNums[i-1] = scanner.nextInt();
        }
        System.out.print("Du hast folgende Zahlen eingegeben: ");
        for (int num : threeNums) {
            System.out.print(num + " ");
        }
        System.out.println();

        //------------------------ Notenrechner
        int[] scors = { 85, 70, 15, 60 };
        int summe = 0;
        for (int score : scors) {
            summe += score;
        }
        int average = summe / scors.length;
        System.out.println("Die Durchschnitt ist: " + average);
        System.out.println(average > 70 ? "Bestanden!" : "Nicht bestanden!");

        //------------------------ Zufallszahlen sortieren

        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 100);
        }
        System.out.println("--- Unsortiert ---");
        for (int num : randomNums) {
            System.out.print(num + " ");
        }

        Arrays.sort(randomNums);
        System.out.println();
        System.out.println("--- Sortiert ---");
        for (int num : randomNums) {
            System.out.print(num + " ");
        }
    }
}
