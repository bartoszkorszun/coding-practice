class GFG {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java GFG <integer>");
            return;
        }
        
        int n = 0;

        try {
            n = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Oops something went wrong!");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
