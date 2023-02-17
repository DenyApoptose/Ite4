package equipment;


public class Potion extends DefensiveEquipment {
    private int healingRecovered;

    @Override
    public String toString() {
        return "Potion{" +
                "healingRecovered=" + healingRecovered +
                '}';
    }

    public Potion(int level, String name) {
        super(name,level);
        this.healingRecovered = healingRecovered;
    }

    public int gethealingRecovered() {
        return healingRecovered;
    }

    public void sethealingRecovered(int healingRecovered) {
        this.healingRecovered = healingRecovered;
    }
}