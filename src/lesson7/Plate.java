package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void PlateInfo() {
        System.out.println("В миске Осталось " + food + " еды");
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
            System.out.println("Кот наелся, теперь он сытый");
        } else if (food < appetite) {
            System.out.println("Коту не хватило еды.");
        }

    }

    public void addFood (int food) {
            this.food = 3000;
        }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}

