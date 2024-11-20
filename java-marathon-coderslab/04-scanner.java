import java.util.Scanner;

class CodersLab {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imię:");
        
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Cześć, " + name + "!");
        }
    }
}
