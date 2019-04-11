package lesson7;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Барсик", 200, false);
        cat[1] = new Cat("Мурзик", 200, false);
        cat[2] = new Cat("Шарик", 200, false);
        cat[3] = new Cat("Додик", 200, false);
        cat[4] = new Cat("Персик", 200, false);

        Plate plate = new Plate(800);
        plate.PlateInfo();
        cat[0].eat(plate);
        cat[1].eat(plate);
        cat[2].eat(plate);
        cat[3].eat(plate);
        cat[4].eat(plate);
        plate.PlateInfo();






    }
}
