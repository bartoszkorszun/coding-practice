import java.util.Scanner;

class ALG {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StdOut.printf("_____________________________________________\n");

        while (sc.hasNextLine()) {
            var line = sc.nextLine();
            String[] arguments = line.split(" ");

            printArgs(arguments);
        }
        StdOut.printf("---------------------------------------------");

        sc.close();
    }

    private static void printArgs(String[] arguments) {
        StdOut.printf("|");
        StdOut.printf(arguments[0]);
        for (int i = arguments[0].length(); i < 20; i++) {
            StdOut.printf(" ");
        }
        StdOut.printf("|");
        StdOut.printf(arguments[1]);
        for (int i = arguments[1].length(); i < 5; i++) {
            StdOut.printf(" ");
        }
        StdOut.printf("|");
        StdOut.printf(arguments[2]);
        for (int i = arguments[2].length(); i < 5; i++) {
            StdOut.printf(" ");
        }
        StdOut.printf("|");
        try {
            double a = Double.parseDouble(arguments[1]);
            double b = Double.parseDouble(arguments[2]);
            double c = a / b;
            StdOut.printf("%.3f", c);
        } catch (Exception e) {
            StdOut.printf("Incorrect number format");
            System.exit(0);
        }
        StdOut.printf("|\n");
    }
}
