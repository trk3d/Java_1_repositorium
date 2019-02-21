package Lesson5;


public class Main {


    public static void main(String[] args) {


        Sotrudnik[] sotrudniki = new Sotrudnik[5];
        sotrudniki[0] = new Sotrudnik("Иванов Иван Иванович", "Пекарь", "ivanov@mail.ru", 89999999999L, 10000, 30);
        sotrudniki[1] = new Sotrudnik("Петров Петр Петрович", "Поп", "petrov@mail.ru", 86666666666L, 100000, 20);
        sotrudniki[2] = new Sotrudnik("Сидоров Сидор Сидорович", "Слесарь", "sidorov@mail.ru", 88888888888L, 15000, 43);
        sotrudniki[3] = new Sotrudnik("Смирнов Евгений Евгеньевич", "Токарь", "smirnov@mail.ru", 87777777777L, 12000, 41);
        sotrudniki[4] = new Sotrudnik("Орлов Орёл Орлович", "Продавец", "orlov@mail.ru", 86666666666L, 20000, 32);


//        for (int i = 0; i < sotrudniki.length; i++) {
//            if (sotrudniki[i].getAge() > 40) {
//                sotrudniki[i].printInfo();
//            }
//        }



        for (Sotrudnik sotrudnik : sotrudniki) {
            if (sotrudnik.getAge() > 40) sotrudnik.printInfo();
            }
        }

    }




















