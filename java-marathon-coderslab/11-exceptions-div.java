import java.util.Scanner;

class CodersLab {
    public static void main(String[] args) {
        
        System.out.println("Podaj 2 liczby oddzielone spacją: "); 
        Scanner sc = new Scanner(System.in);

        int a, b;
        try {
            a = sc.nextInt();
            b = sc.nextInt();

            try {
                System.out.println(a / b);
            } catch (ArithmeticException ae) {
                System.out.println("Nie dziel przez 0!");
            }
        } catch (Exception e) {
            System.out.println("Nieprawidłowy rofmat!");
        }
    }
}
