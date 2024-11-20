import java.util.Scanner;

class CodersLab {
    public static void main(String[] args) {
        System.out.println("Podaj swój wiek:");
        
        try (Scanner sc = new Scanner(System.in)) {
            int wiek = sc.nextInt();
            
            if (wiek >= 18) {
                System.out.println("Jesteś pełnoletni.");
            } else {
                System.out.println("Jesteś niepełnoletni.");
            }
        } catch (Exception e) {
            System.out.println("Oops! Something went wrong. Check the input and try again.");
        }
    }
}
