package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int minNumber = 0;
        int maxNumber = 9;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 0, chances = 3, answer = 0;
        int randomNumber = random.nextInt(maxNumber);
        do {
            System.out.println("Играем! Угадай число от " + minNumber + " до " + maxNumber + "! Осталось попыток: " + chances);
            number = scanner.nextInt();
            if (randomNumber > number) {
                System.out.println("Загаданное число больше! Попробуй еще раз.");
            }
            if (randomNumber < number) {
                System.out.println("Загаданное число меньше! Попробуй еще раз.");
            }
            chances--;
            if ((chances == 0) && (randomNumber != number)) {
                System.out.println("Вы проиграли. Повезет в следующий раз!");
                chances = 3;
            }
            if (randomNumber == number) {
                System.out.println("Угадал! Вы только посмотрите на этого везунчика!");
                chances = 3;
            }
            System.out.println("Сыграем еще? 1 - да, другое - нет.");
            answer = scanner.nextInt();
            if (answer != 1) {
                System.out.println("Игра окончена. Спасибо за участие!");
                break;
            }

        } while (answer == 1);
        scanner.close();
    }
}
