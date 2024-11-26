class GFG {
    public static void main(String[] args) {
        int principal = 10000;
        int rate = 5;
        int time = 5;

        int interest = calculateInterest(principal, rate, time);
        System.out.println("Simple Interest: " + interest);   
    }

    public static int calculateInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100;
    }
}
