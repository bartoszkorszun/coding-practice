class ALG {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
