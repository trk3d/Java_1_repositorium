package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 9;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 0, y = 3, z = 0;
        int x = random.nextInt(b);
        do {
            System.out.println("Играем! Угадай число от " + a + " до " + b + "! Осталось попыток: " + y);
            number = scanner.nextInt();
            if (x > number) {
                System.out.println("Загаданное число больше! Попробуй еще раз.");
            }
            if (x < number) {
                System.out.println("Загаданное число меньше! Попробуй еще раз.");
            }
            y--;
            if (y == 0) {
                System.out.println("Вы проиграли. Повезет в следующий раз!");
                break;
            }
            if (x == number) {
                System.out.println("Вы только посмотрите на этого везунчика!");
                break;
            }
            System.out.println("Сыграем еще? 1 - да, другое - нет.");
            z = scanner.nextInt();
            if (z != 1) {
                System.out.println("Игра окончена. Спасибо за участие!");
                break;
            }
        } while (x != number);
        scanner.close();
    }
}
