import java.util.Scanner;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {

// MAIN_METHOD_EXERCISES
// ============================================================================
        System.out.println("Hello World");
        System.out.println("Test");
        System.out.println("Test2");

        String myName = "Elena";
        System.out.println("Hello, " + myName);

        System.out.println(3+5);
        System.out.println(4*4);
        System.out.println("10-7=" + (10-7));
        int a = 8;
        int b = 2;
        System.out.println(a / b);

        // Aufgabe 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie heißen Sie?");
        String userName = scanner.nextLine();
        System.out.println("Ich begrüße Sie, " + userName + "!");
        System.out.println();

        // Aufgabe 9
        System.out.println("========================");
        System.out.println("| Peter         |  18  |");
        System.out.println("| Mirabella     |  21  |");
        System.out.println("| Jonny         |  15  |");
        System.out.println("========================");

        // Aufgabe 10

        System.out.println("Mein Name ist Elena");
        System.out.println("Mir ist 45");
        System.out.println("Mein Lieblingsspruch: Das Leben ist wunderbar!");
        System.out.println(45 * 2);

        System.out.println("_______________________________");


// DATA_TYPES_EXERCISES
// ============================================================================

        // Level 1
        int age = 45;
        System.out.println(age);

        double height = 1.68;
        System.out.println(height);

        char firstLetter = 'E';
        System.out.println(firstLetter);

        String firstName = "Elena";
        System.out.println(firstName);

        // Level2

        System.out.println("Mein Name ist " + firstName + ", ich bin " + age + " Jahre alt und " + height + " Meter groß.");

        boolean isAdult = age >= 18;

        if (isAdult) {
            System.out.println("Ich bin erwachsen.");
        }

        System.out.println("___________________________");
        int x = 25;
        int y = 5;
        System.out.println("Summe von " + x + " und " + y +  " ist " + (x+y));
        System.out.println("Differenz von " + x + " und " + y +  " ist " + (x-y));
        System.out.println("Produkt von " + x + " und " + y +  " ist " + (x*y));
        System.out.println("Quotient von " + x + " und " + y +  " ist " + (x/y));

        System.out.println("___________________________");

        String satz = "Lorem ipsum dolores";
        System.out.println(satz);
        System.out.println(satz.length());
        System.out.println(satz.charAt(0));
        System.out.println(satz.toUpperCase());

        System.out.println("___________________________");

        // Level 3
        System.out.println("Wie heißt du?");
        String userFirstName = scanner.nextLine();

        System.out.println("Wie alt bis du?");
        int userAge = scanner.nextInt();

        System.out.println("Wie ist deine Lieblingsbuchstabe?");
        char userFavorLetter = scanner.next().charAt(0);

        System.out.println("Hallo " + userFirstName + ", dein Lieblingsbuchstabe ist " + userFavorLetter + " und du bist " + userAge + " Jahre alt.");

        double d = 1.23;
        double f = 4.56;

        if (d+f > 10) {
            System.out.println("Summe ist größer als 10.");
        } else {
            System.out.println("Summe ist kleiner als 10.");
        }

        System.out.println("___________________________");

        System.out.println("Füg bitte einen Zeichen ein: ");
        char zeichen = scanner.next().charAt(0);
        char[] vocalArr = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};

        boolean isVocal = false;

        for (char vocal : vocalArr) {
            if (vocal == zeichen) {
                isVocal = true;
                break;
            }
        }

        if (isVocal) {
            System.out.println("Vokal!");
        } else {
            System.out.println("Kein Vokal!");
        }

        System.out.println("___________________________");

        System.out.println("Nenne erste Ganzzahl: ");
        int firstNum = scanner.nextInt();

        System.out.println("Nenne zweite Ganzzahl: ");
        int secondNum = scanner.nextInt();

        System.out.println("Nenne eine Kommazahl: ");
        double doubleNum = scanner.nextDouble();

        double result = (double)(firstNum + secondNum) - doubleNum;
        System.out.println(firstNum + " + " + secondNum + " - " + doubleNum + " = " + result);

        if (result > 0) {
            System.out.println("Das Ergebnis ist positiv!");
        } else  {
            System.out.println("Das Ergebnis ist negativ!");
        }

// OPERATOREN_EXERCISES
// ============================================================================
        // Level 1
        int num1 = 12;
        int num2 = 8;
        int sum = num1 + num2;
        System.out.println("Summe: " + sum);

        if (num1 == num2) {
            System.out.println("Die Zahlen sind gleich!");
        } else {
            System.out.println("Die Zahlen sind ungleich!");
        }

        System.out.println(num1 > 0 && num1 < 100);


        // Level 2
        int rest = num1 % num2;
        System.out.println(rest == 0 && num1 > 0 && num2 > 0);

        double preis = 15.75;
        boolean rabatt = true;

        if (rabatt == true) {
            preis = preis - preis * 10 / 100;
        }
        System.out.println("Preis: " + preis);

        // Prüfen, ob eine Zahl entweder gerade oder größer als 50 ist.
        int num = 77;
        if (num % 2 == 0 || num > 50) {
            System.out.println("Die Zahl ist gerade oder größer als 50");
        }

        // Level 3 - Bonus
        // -//-

// IF_ELSE_EXERCISE
// ============================================================================

        // Level 1
        int age1 = 23;
        if (age1 >= 18) {
            System.out.println("Volljährig!");
        }

        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Nimm einen Regenschirm!");
        } else {
            System.out.println("Kein Regenschirm nötig");
        }

        String city = "Berlin";
        if (city.contains("Berlin")) {
            System.out.println("Hauptstadt!");
        }

        // Level 2
        int score = 22;
        boolean hasTicket = true;
        if (hasTicket && score >= 50) {
            System.out.println("Eintritt erlaubt!");
        } else {
            System.out.println("Eintritt nicht erlaubt!");
        }

        // ------------------
        int temperature = 37;

        if (temperature >= 30) {
            System.out.println("Heiß!");
        } else if (temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature >= 10) {
            System.out.println("Kühl");
        } else {
            System.out.println("Kalt");
        }

        // ------------------

        int number = 19;
        String parity = number % 2 == 0 ? "Gerade" : "Ungerade";

        // Level 3

        for (int i = 0; i < 3; i++) {
            System.out.print("----- Wie ist Ihr Name? -----");
            String name = scanner.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("Ungültiger Name!");
            } else {
                System.out.println("Hallo, " + name);
            }
        }

        // ------------------

        double xx = 0.1 + 0.2;
        System.out.println("Die Summe von zwei doubles: " + xx);
        String yy = xx + "";

        if (yy.contains("0.3")) {
            System.out.println("Fast 0.3");
        } else {
            System.out.println("Nicht gleich 0.3");
        }

        // ------------------

        register("Tomas", 17);
        register("Milan", 21);

// METHODEN_EXERCISE
// ============================================================================

        // Level 1
        printHello();
        getGreeting();
        printName("Monika");

        // Level 2
        int summe = add(5, 7);
        System.out.println("5 + 7" + summe);

        System.out.println("Calculated area: " + calculateArea(2.5, 3.5));

        checkPositive(4);
        checkPositive(-5);

        // Level 3
        System.out.println("Ist die '13' gerade? " + isEven(13));

        printSumMessage(20, 30);

        // Calculation
        add(10, 1);
        add(10, -1);
        subtract(-12, -5);
        subtract(12, -5);
        subtract(0, 3);
        multiply(0, 0);
        multiply(-3, 7);
        divide(20.5,5);
        divide(4.15, 0);
        divide(4.15, 0.15);
        divide(3.3, -33.3);
    }

    private static void printSumMessage(int x, int y) {
        System.out.println("Die Summe von " + x + " und " + y + " ist " + add(x, y));
    }


    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

    private static void checkPositive(int number) {
        if (number < 0) {
            System.out.println("Negative Zahl!");
            return;
        }
    }
    private static double calculateArea(double width, double height) {
        return width * height;
    }

    private static int add(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
    private static int subtract(int a, int b) {
        System.out.println(a - b);
        return a - b;
    }
    private static int multiply(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }
    private static double divide(double a, double b) {
        if (b == 0d) {
            System.out.println("Division durch 0!");
            return 0d;
        }
        System.out.println(a / b);
        return a / b;
    }

    private static void printName(String name) {
        System.out.println("Hallo " + name);
    }

    private static void printHello() {
        System.out.println("Hallo Welt!");
    }

    private static String getGreeting() {
        return "Willkommen im Java-Kurs";
    }

    private static void register(String username, int age) {
        if (username == null || username.isEmpty() || age < 18) {
            return;
        } else {
            System.out.println(username + ": Registrierung erfolgreich");
        }
    }
}
