class GFG {
    public static void main(String[] args) {
        int n;
        
        try {
            n = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java GFG <number>");
            return;
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
            return;
        }

        if (n == 0) {
            System.out.println("0");
            return;
        }

        for (int i = 0; i <= n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
