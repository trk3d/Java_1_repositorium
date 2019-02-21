package Lesson5;


public class Main {

    public static void main(String[] args) {


        Sotrudnik ivanov = new Sotrudnik("Иванов Иван Иванович", "Пекарь", "ivanov@mail.ru", 89999999999L, 10000, 30);
        Sotrudnik petrov = new Sotrudnik("Петров Петр Петрович", "Поп", "petrov@mail.ru", 86666666666L, 100000, 20);
        Sotrudnik sidorov = new Sotrudnik("Сидоров Сидор Сидорович", "Слесарь", "sidorov@mail.ru", 88888888888L, 15000, 43);
        Sotrudnik smirnov = new Sotrudnik("Смирнов Евгений Евгеньевич", "Токарь", "smirnov@mail.ru", 87777777777L, 12000, 41);
        Sotrudnik orlov = new Sotrudnik("Орлов Орёл Орлович", "Продавец", "orlov@mail.ru", 86666666666L, 20000, 32);

        if (petrov.age > 40) {
            petrov.printInfo();
        }
        if (ivanov.age > 40) {
            ivanov.printInfo();
        }
        if (sidorov.age > 40) {
            sidorov.printInfo();
        }
        if (smirnov.age > 40) {
            smirnov.printInfo();
        }
        if (orlov.age > 40) {
            orlov.printInfo();
        }
    }

}

