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
            int n = Integer.parseInt(args[0]);
            System.out.println(isPrime(n)); 
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }   
    
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
