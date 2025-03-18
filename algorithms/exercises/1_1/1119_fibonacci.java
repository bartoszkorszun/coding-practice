import java.util.*;

class ALG {
    // Fibonacci
    private static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args){
        for (int N = 0; N < 100; N++)
            StdOut.println(N + " " + F(N)); // around 55 iterations under an hour
    }
    
    private static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        if (memo.containsKey(N))return memo.get(N);

        long result = F(N - 1) + F(N - 2);
        memo.put(N, result);
        return result;
    }
}
