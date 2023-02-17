package equipment;

public class Sort extends OffensiveEquipment {
    private int sortilege;

    public Sort(int level, String name) {
        super(name, level);
        this.sortilege = sortilege;
    }

    public int Sortilege() {
        return sortilege;
    }

    public void setSortilege(int sortilege) {
        this.sortilege = sortilege;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "sortilege=" + sortilege +
                '}';
    }
}