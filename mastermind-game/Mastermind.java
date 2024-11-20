import java.util.Scanner;

class MasterMind {
    public static void main(String[] args) {
        
        System.out.println("Wellcome to MasterMind!");
        System.out.println("GHuess the secret code of digits between 1 and 6.");

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter your guess: ");
            
            String guess = scanner.nextLine();
            System.out.println("You guessed: " + guess);
            
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}