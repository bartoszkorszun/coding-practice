import java.util.Random;
import java.util.Scanner;

class MasterMind {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        System.out.println("Wellcome to MasterMind!");
        System.out.println("Guess the secret code of 4 digits between 1 and 6.");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int codeLength = 4;
        int maxDigit = 6;
        int[] secretCode = new int[codeLength];
        int[] userCode = new int[codeLength];
        boolean isGuessed = false;

        for (int i = 0; i < codeLength; i++) {
            secretCode[i] = random.nextInt(maxDigit) + 1;
        }

        while (!isGuessed) {
            try {
                System.out.println("Enter your guess: ");
                String guess = scanner.nextLine();
                
                if (guess.length() != codeLength) {
                    throw new NumberFormatException();
                }

                for (int i = 0; i < codeLength; i++) {
                    userCode[i] = Character.getNumericValue(guess.charAt(i));
                    if (userCode[i] < 1 || userCode[i] > maxDigit) {
                        throw new NumberFormatException();
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("An error occurred. Enter numbers from 1 to " + maxDigit);
            }

            int identicalNotInPlace = 0;
            int identicalInPlace = 0;
            boolean[] countedInUserCode = new boolean[codeLength];
            boolean[] countedInSecretCode = new boolean[codeLength];

            for (int i = 0; i < codeLength; i++) {
                if (userCode[i] == secretCode[i]) {
                    identicalInPlace++;
                    countedInUserCode[i] = true;
                    countedInSecretCode[i] = true;
                }
            }

            for (int i = 0; i < codeLength; i++) {
                if (!countedInUserCode[i]) {
                    for (int j = 0; j < codeLength; j++) {
                        if (!countedInSecretCode[j] && userCode[i] == secretCode[j]) {
                            identicalNotInPlace++;
                            countedInUserCode[i] = true;
                            countedInSecretCode[j] = true;
                        }
                    }
                }   
            }

            if (identicalInPlace == codeLength) {
                System.out.println("Nice - code guessed!");
                isGuessed = true;
            } else {
                System.out.println("Correct numbers on correct positions: " + identicalInPlace);
                System.out.println("Correct numbers on wrong positions: " + identicalNotInPlace);
            }
        }

        scanner.close();
    }
}