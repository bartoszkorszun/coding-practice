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

        printDiamond(n, 1);
    }

    private static void printDiamond(int n, int t) {
        if (t > n) return;
        for (int i = 0; i < n - t; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < (t * 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
        printDiamond(n, t + 1);
        if (t == n) return;
        for (int i = 0; i < n - t; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < (t * 2) - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
