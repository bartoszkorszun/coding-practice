import java.util.Arrays;

class GFG {
    public static void main(String[] args) {
        
        int[] arr = {7, 2, 5, 1, 4};

        System.out.println("Method 1: " + method1(arr));
        System.out.println("Method 2: " + method2(arr));
        System.out.println("Method 3: " + method3(arr));
    }

    private static int method1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    private static int method2(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    private static int method3(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = (max < arr[i]) ? arr[i] : max;
        }
        return max;
    }
}
