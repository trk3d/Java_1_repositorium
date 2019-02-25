package Lesson6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice1;
        int choice2;

        Cat cat = new Cat();
        cat.setMaxJump(2);
        cat.setMaxRun(200);
        cat.setMaxSwim(0);


        Dog bulldog = new Dog();
        bulldog.setMaxJump(0.5);
        bulldog.setMaxRun(500);
        bulldog.setMaxSwim(10);

        Dog kolli = new Dog();
        kolli.setMaxJump(0.5);
        kolli.setMaxRun(600);
        kolli.setMaxSwim(10);

        Polosa polosa1 = new Polosa();
        polosa1.setDlinaTrassi(400);
        polosa1.setVisotaNaTrasse(1);
        polosa1.setVodaNaTrasse(5);

        Polosa polosa2 = new Polosa();
        polosa2.setDlinaTrassi(150);
        polosa2.setVisotaNaTrasse(1.5);
        polosa2.setVodaNaTrasse(0);

        Polosa polosa3 = new Polosa();
        polosa3.setDlinaTrassi(550);
        polosa3.setVisotaNaTrasse(0.2);
        polosa3.setVodaNaTrasse(2);

        System.out.println("Выберите полосу препятствий.");
        System.out.println("1. Длина полосы 400 метров, высота препятствия 1 метр, 5 метров воды.");
        System.out.println("2. Длина полосы 150 метров, высота препятствия 1.5 метра, воды нет.");
        System.out.println("3. Длина полосы 550 метров, высота препятствия 0.2 метра, 2 метра воды.");

        choice1 = scanner.nextInt();

        if (choice1 == 1) {
            polosa1.getDlinaTrassi();
            polosa1.getVisotaNaTrasse();
            polosa1.getVodaNaTrasse();
            {
                if (choice1 == 2) {
                    polosa2.getDlinaTrassi();
                    polosa2.getVisotaNaTrasse();
                    polosa2.getVodaNaTrasse();
                }
                if (choice1 == 3) {
                    polosa3.getDlinaTrassi();
                    polosa3.getVisotaNaTrasse();
                    polosa3.getVodaNaTrasse();
                } else {
                    System.out.println("Введите корректный номер полосы.");
                }
            }
        }

        System.out.println("Выберите животное, которое будет проходить полосу препятствий.");
        System.out.println("1. Кошка.");
        System.out.println("2. Бульдог.");
        System.out.println("3. Колли.");

        choice2 = scanner.nextInt();

        if (choice2 == 1 && choice1 == 1) {
            cat.run(polosa1.getDlinaTrassi());
            cat.jump(polosa1.getVisotaNaTrasse());
            cat.swim(polosa1.getVodaNaTrasse());
            cat.printResult(polosa1.getVisotaNaTrasse(), polosa1.getDlinaTrassi(), polosa1.getVodaNaTrasse());
        }
        if (choice2 == 1 && choice1 == 2) {
            cat.run(polosa2.getDlinaTrassi());
            cat.jump(polosa2.getVisotaNaTrasse());
            cat.swim(polosa2.getVodaNaTrasse());
            cat.printResult(polosa2.getVisotaNaTrasse(), polosa2.getDlinaTrassi(), polosa2.getVodaNaTrasse());
        } if (choice2 == 1 && choice1 == 3) {
            cat.run(polosa3.getDlinaTrassi());
            cat.jump(polosa3.getVisotaNaTrasse());
            cat.swim(polosa3.getVodaNaTrasse());
            cat.printResult(polosa3.getVisotaNaTrasse(), polosa3.getDlinaTrassi(), polosa3.getVodaNaTrasse());
        }
        if (choice2 == 2 && choice1 == 1) {
            bulldog.run(polosa1.getDlinaTrassi());
            bulldog.jump(polosa1.getVisotaNaTrasse());
            bulldog.swim(polosa1.getVodaNaTrasse());
            bulldog.printResult(polosa1.getVisotaNaTrasse(), polosa1.getDlinaTrassi(), polosa1.getVodaNaTrasse());
        } if (choice2 == 2 && choice1 == 2) {
            bulldog.run(polosa2.getDlinaTrassi());
            bulldog.jump(polosa2.getVisotaNaTrasse());
            bulldog.swim(polosa2.getVodaNaTrasse());
            bulldog.printResult(polosa2.getVisotaNaTrasse(), polosa2.getDlinaTrassi(), polosa2.getVodaNaTrasse());
        } if (choice2 == 2 && choice1 == 3) {
            bulldog.run(polosa3.getDlinaTrassi());
            bulldog.jump(polosa3.getVisotaNaTrasse());
            bulldog.swim(polosa3.getVodaNaTrasse());
            bulldog.printResult(polosa3.getVisotaNaTrasse(), polosa3.getDlinaTrassi(), polosa3.getVodaNaTrasse());
        }
        if (choice2 == 3 && choice1 == 1) {
            kolli.run(polosa1.getDlinaTrassi());
            kolli.jump(polosa1.getVisotaNaTrasse());
            kolli.swim(polosa1.getVodaNaTrasse());
            kolli.printResult(polosa1.getVisotaNaTrasse(), polosa1.getDlinaTrassi(), polosa1.getVodaNaTrasse());
        }
        if (choice2 == 3 && choice1 == 2) {
            kolli.run(polosa2.getDlinaTrassi());
            kolli.jump(polosa2.getVisotaNaTrasse());
            kolli.swim(polosa2.getVodaNaTrasse());
            kolli.printResult(polosa2.getVisotaNaTrasse(), polosa2.getDlinaTrassi(), polosa2.getVodaNaTrasse());

        }if (choice2 == 3 && choice1 == 3) {
            kolli.run(polosa3.getDlinaTrassi());
            kolli.jump(polosa3.getVisotaNaTrasse());
            kolli.swim(polosa3.getVodaNaTrasse());
            kolli.printResult(polosa3.getVisotaNaTrasse(), polosa3.getDlinaTrassi(), polosa3.getVodaNaTrasse());
        }
        }
    }

