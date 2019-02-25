package Lesson6;

public class Animal {

    protected int maxRun;
    protected double maxJump;
    protected int maxSwim;


    public void run(int dlina) {
        if (dlina <= this.maxRun) {
            System.out.println("Ваш питомец пробежал всю трассу до конца!");
        } else {
            System.out.println("Ваш питомец не смог пробежать трассу.");
        }

    }


    public void jump(double visota) {

        if (visota <= this.maxJump) {
            System.out.println("Ваш питомец изящно перемахнул через преграду!");
        } else {
            System.out.println("Ваш питомец не смог перепрыгнуть препятствие");
        }
    }

    public void swim(int waterDlina) {
        if (waterDlina > this.maxSwim) {
            System.out.println("Ваш питомец не смог переплыть препятствие.");
        }
        if (maxSwim == 0 && waterDlina > 0) {
            System.out.println("Ваш питомец побоялся идти в воду!");
        }
        if (maxSwim == 0 && waterDlina == 0) {
            System.out.println("Как здорово, что на полосе препятствий нет воды!");
        } else {
            System.out.println("Ваш питомец успешно проплыл нужное расстояние!");
        }

    }

    public void printResult(double visota, int dlina, int waterDlina) {
        if (waterDlina <= this.maxSwim && visota <= this.maxJump && dlina <= this.maxRun) {
            System.out.println("Ваш питомец уверенно прошел всю полосу препятствий! Поздравляем!");
        } else {
            System.out.println("Ваш питомец не справился с полосой препятствий. Уделите больше внимания тренировкам!");
        }

    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(double maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }
}

