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
        System.out.println("Играем! Угадай число от " + minNumber + " до " + maxNumber + "! Осталось попыток: " + chances);
        number = scanner.nextInt();
        do {
            if ((randomNumber > number) && (chances != 1)) {
                System.out.println("Загаданное число больше! Осталось попыток: " + (chances - 1));
                number = scanner.nextInt();
            }

            if ((randomNumber < number) && (chances != 1)) {
                System.out.println("Загаданное число меньше! Осталось попыток: " + (chances-1));
                number = scanner.nextInt();
            }
            chances--;
            if ((chances == 0) && (randomNumber != number)) {
                System.out.println("Вы проиграли. Повезет в следующий раз!");
                System.out.println("Сыграем еще? 1 - да, другое - нет.");
                answer = scanner.nextInt();
                if (answer != 1) {
                    System.out.println("Игра окончена. Спасибо за участие!");
                    break;
                }
                randomNumber = random.nextInt(maxNumber);
                chances = 3;
                System.out.println("Играем! Угадай число от " + minNumber + " до " + maxNumber + "! Осталось попыток: " + chances);
                number = scanner.nextInt();
            }
            if (randomNumber == number) {
                System.out.println("Угадал! Вы только посмотрите на этого везунчика!");
                System.out.println("Сыграем еще? 1 - да, другое - нет.");
                answer = scanner.nextInt();
                if (answer != 1) {
                    System.out.println("Игра окончена. Спасибо за участие!");
                    break;
                }
                randomNumber = random.nextInt(maxNumber);
                chances = 3;
                System.out.println("Играем! Угадай число от " + minNumber + " до " + maxNumber + "! Осталось попыток: " + chances);
                number = scanner.nextInt();
            }

        } while (randomNumber != number);
        scanner.close();
    }
}



