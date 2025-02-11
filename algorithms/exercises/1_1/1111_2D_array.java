import java.security.SecureRandom;

class ALG {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        boolean[][] a = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = random.nextBoolean();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(a[i][j] ? "*" : " ");
            }
            System.out.println();
        }
    }
}