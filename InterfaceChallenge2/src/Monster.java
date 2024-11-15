import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        List<String> list = new ArrayList<>(3);
        list.addFirst(name);
        list.add(1, "" + hitPoints);
        list.add(2, "" + strength);
        return list;

    }

    public void read(List<String> list) {
        name = list.getFirst();
        hitPoints = Integer.parseInt(list.get(1));
        strength = Integer.parseInt(list.getLast());
    }

    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
