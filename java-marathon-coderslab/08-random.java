import java.util.Random;

class CodersLab {
    public static void main(String[] args) {
        
        Random random = new Random();
        int min = 1;
        int max = 36;
        int rand = random.nextInt(((max - min) + 1) + min);
        System.out.println("Liczba od " + min + " do " + max + " to " + rand);
    }
}
