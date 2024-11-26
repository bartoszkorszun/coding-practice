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
        
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}