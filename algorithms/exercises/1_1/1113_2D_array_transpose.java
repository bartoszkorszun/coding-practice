class ALG {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int[] b1 : b) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b1[j] + " ");
            }
            System.out.println();
        }
    }
}