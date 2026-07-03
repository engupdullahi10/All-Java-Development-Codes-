import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    enum Difficulty {
        EASY, NORMAL, HARD, CUSTOM
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        System.out.println("=== Number Guessing Game ===");
        boolean playAgain = true;

        while (playAgain) {
            Difficulty difficulty = chooseDifficulty(scanner);
            int min = 1;
            int max;
            int attempts;

            switch (difficulty) {
                case EASY:
                    max = 10;
                    attempts = 7;
                    break;
                case NORMAL:
                    max = 100;
                    attempts = 8;
                    break;
                case HARD:
                    max = 1000;
                    attempts = 10;
                    break;
                default: // CUSTOM
                    int[] custom = chooseCustomRangeAndAttempts(scanner);
                    min = custom[0];
                    max = custom[1];
                    attempts = custom[2];
            }

            System.out.printf("I have chosen a number between %d and %d. You have %d attempts.%n", min, max, attempts);
            int secret = rng.nextInt(max - min + 1) + min;
            boolean won = playRound(scanner, secret, min, max, attempts);

            if (won) {
                System.out.println("🎉 Congratulations! You guessed the number!");
            } else {
                System.out.printf("☹ Out of attempts. The number was %d.%n", secret);
            }

            System.out.print("Play again? (y/n): ");
            playAgain = readYesNo(scanner);
        }

        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }

    private static Difficulty chooseDifficulty(Scanner scanner) {
        System.out.println("Choose difficulty:");
        System.out.println("1) Easy (1-10, 7 attempts)");
        System.out.println("2) Normal (1-100, 8 attempts)");
        System.out.println("3) Hard (1-1000, 10 attempts)");
        System.out.println("4) Custom");

        while (true) {
            System.out.print("Enter choice (1-4): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                switch (choice) {
                    case 1:
                        return Difficulty.EASY;
                    case 2:
                        return Difficulty.NORMAL;
                    case 3:
                        return Difficulty.HARD;
                    case 4:
                        return Difficulty.CUSTOM;
                }
            } catch (NumberFormatException e) {
                // fall through to prompt again
            }
            System.out.println("Invalid choice. Try again.");
        }
    }

    private static int[] chooseCustomRangeAndAttempts(Scanner scanner) {
        int min = 1, max = 100, attempts = 8;
        while (true) {
            try {
                System.out.print("Enter minimum number: ");
                min = Integer.parseInt(scanner.nextLine().trim());
                System.out.print("Enter maximum number: ");
                max = Integer.parseInt(scanner.nextLine().trim());
                if (max <= min) {
                    System.out.println("Maximum must be greater than minimum. Try again.");
                    continue;
                }
                System.out.print("Enter number of attempts: ");
                attempts = Integer.parseInt(scanner.nextLine().trim());
                if (attempts <= 0) {
                    System.out.println("Attempts must be positive. Try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter integers.");
            }
        }
        return new int[] {min, max, attempts};
    }

    private static boolean playRound(Scanner scanner, int secret, int min, int max, int attempts) {
        int remaining = attempts;

        while (remaining > 0) {
            System.out.printf("Attempts left: %d. Enter your guess (%d - %d): ", remaining, min, max);
            Integer guess = readInteger(scanner);
            if (guess == null) {
                System.out.println("Invalid input; please enter an integer.");
                continue;
            }
            if (guess < min || guess > max) {
                System.out.printf("Guess out of range. Please pick between %d and %d.%n", min, max);
                continue;
            }

            if (guess == secret) {
                return true;
            }

            remaining--;
            if (guess < secret) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }

            // Proximity hint example
            int distance = Math.abs(secret - guess);
            if (distance <= Math.max(1, (max - min) / 20)) { // roughly within 5% of range
                System.out.println("You're very close!");
            } else if (distance <= Math.max(2, (max - min) / 10)) {
                System.out.println("You're close.");
            }

            if (remaining == 0) break;
        }
        return false;
    }

    private static Integer readInteger(Scanner scanner) {
        try {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) return null;
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static boolean readYesNo(Scanner scanner) {
        while (true) {
            String line = scanner.nextLine().trim().toLowerCase();
            if (line.isEmpty()) continue;
            if (line.startsWith("y")) return true;
            if (line.startsWith("n")) return false;
            System.out.print("Please answer y or n: ");
        }
    }
}
