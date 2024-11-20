class ALG {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java ALG <integer>");
            return;
        }

        if (!args[0].matches("-?\\d+")) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            System.out.println(abs(x));   
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }   
    
    private static int abs(int x) {
        if (x < 0) return -x;
        else return x;
    }
}
