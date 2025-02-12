class ALG {
    // Fibonacci
    public static void main(String[] args){
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N)); // around 55 iterations under an hour
    }
    // TODO write better implementation of F
    public static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}
