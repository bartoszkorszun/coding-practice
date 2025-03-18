class ALG {
    // ln(N!)

    public static void main(String[] args){
        try {
            int N = Integer.parseInt(args[0]);
            System.out.println(ln(N));
        } catch (Exception e) {
            System.err.println("Not a valid number! Enter number as a parameter - java ALG <num>");
        }
    }
    
    private static double ln(int N){
        if (N <= 0) return 0;
        return Math.log(N) + ln(N-1);
    }
}
