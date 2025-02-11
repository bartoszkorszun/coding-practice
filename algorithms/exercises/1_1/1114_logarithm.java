class ALG {
    public static void main(String[] args) {
        for (int i = 30; i < 70; i++) {
            System.out.println("lg(" + i + ") = " + lg(i));
        }
    }

    private static int lg(int n) {
        int result = 0;
        for (int i = n; i > 0; i /= 2) {
            result++;
        }
        return result - 1;
    }
}