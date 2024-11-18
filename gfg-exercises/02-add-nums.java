class GFG {
    public static void main(String[] args) {
        
        // Check if the number of arguments is 2
        if (args.length != 2) {
            System.out.println("Please provide 2 numbers separated by space");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println(num1 + num2);
    }
}
