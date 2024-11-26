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

        if (n < 1) {
            System.out.println("0");
            return;
        } else if (n == 1) {
            System.out.println("1");
            return;
        } else if (n == 2) {
            System.out.println("2");
            return;
        }
        
        int sum = 2;
        int[] fib = new int[n];

        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
            sum += fib[i];
        }

        System.out.println(sum);
    }
}
