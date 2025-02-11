class GFG {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java GFG <integer>");
            return;
        }
        
        int n = 0;

        try {
            n = Integer.parseInt(args[0]);

            if (n < 1) {
                System.out.println("Number must be a positive integer");
                return;
            }

        } catch (Exception e) {
            System.out.println("Oops something went wrong!");
        }

        printHorizontal(n);
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* ");
            for (int j = 1; j < n - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        printHorizontal(n);
    }

    private static void printHorizontal(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
