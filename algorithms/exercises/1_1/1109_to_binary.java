class ALG {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n > 0) {
            System.out.println(toBinary(n));
        } else {
            System.out.println("Invalid input");
        }
    }

    private static String toBinary(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = n; i > 0; i /= 2) {
            s.append(i % 2);
        }
        return s.toString();
    }
}