package equipment;

public class Arme extends OffensiveEquipment {


    public Arme(int level, String name) {
        super(name, level);

    }

    private int untruc;

    public int getUnTruc() {
        return untruc;
    }

    public void setUnTruc(int untruc) {
        this.untruc = untruc;
    }
}