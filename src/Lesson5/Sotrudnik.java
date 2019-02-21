package Lesson5;

import java.lang.reflect.Array;
import java.text.MessageFormat;


public class Sotrudnik {

    public String name;
    public String profession;
    public String email;
    public long phone;
    public int sallary;
    public int age;

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



