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

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            printNums(i);
            System.out.println();
        }
    }

    private static void printNums(int num) {
        if (num < 1) return;
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        printNums(num - 1);
        System.out.print(num + " ");
    }
}
