class GFG {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Please provide 2 numbers to swap");
            return;
        }
        
        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid numbers");
            return;
        }

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a + ", b: " + b);
    }
}