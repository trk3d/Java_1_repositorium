package lesson7;

public class Cat {

   public String name;
   private int appetite;
   private boolean Sitost;

    public Cat(String name, int appetite, boolean sitost) {
        this.name = name;
        this.appetite = appetite;
        Sitost = sitost;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            Sitost = true;
        } else if (plate.getFood() < appetite) {
            plate.addFood(3000);
            plate.decreaseFood(appetite);
            Sitost = true;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSitost() {
        return Sitost;
    }

    public void setSitost(boolean sitost) {
        Sitost = sitost;
    }
}
