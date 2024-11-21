import java.util.Random;

class CodersLab {
    public static void main(String[] args) {
        
        Random random = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50 - 1 + 1 + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
