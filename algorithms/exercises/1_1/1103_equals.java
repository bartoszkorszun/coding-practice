import java.util.Scanner;

class ALG {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (a == b && b == c) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
