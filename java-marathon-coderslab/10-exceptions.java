import java.util.Scanner;

class CodersLab {
    public static void main(String[] args) {
        
        System.out.println("Podaj liczbę: "); 
        Scanner sc = new Scanner(System.in);

        try {
            int i = Integer.parseInt(sc.nextLine());
            System.out.println("Podana liczba to " + i);
        } catch (Exception e) {
            System.out.println("Nieprawidłowy format!");
        }
    }
}
