package Lesson5;

import java.text.MessageFormat;


public class Sotrudnik {

    public String name;
    public String profession;
    public String email;
    public long phone;
    public int sallary;
    public int age;


    public static void main(String[] args) {

        Sotrudnik[] sotrudniki = new Sotrudnik[5];
        sotrudniki[0] = new Sotrudnik("Иванов Иван Иванович", "Пекарь", "ivanov@mail.ru", 89999999999L, 10000, 30);
        sotrudniki[1] = new Sotrudnik("Петров Петр Петрович", "Поп", "petrov@mail.ru", 86666666666L, 100000, 20);
        sotrudniki[2] = new Sotrudnik("Сидоров Сидор Сидорович", "Слесарь", "sidorov@mail.ru", 88888888888L, 15000, 43);
        sotrudniki[3] = new Sotrudnik("Смирнов Евгений Евгеньевич", "Токарь", "smirnov@mail.ru", 87777777777L, 12000, 41);
        sotrudniki[4] = new Sotrudnik("Орлов Орёл Орлович", "Продавец", "orlov@mail.ru", 86666666666L, 20000, 32);


    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }


    public Sotrudnik(String name, String profession, String email, long phone, int sallary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.phone = phone;
        this.sallary = sallary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(MessageFormat.format(
                "ФИО: {0}, Профессия: {1}, Электронная почта: {2}, Номер телефона: {3}, Зарплата: {4}, Возраст: {5}",
                name, profession, email, phone, sallary, age
        ));
    }



}



