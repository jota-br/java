import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public List<String> write() {
        List<String> list = new ArrayList<>(4);
        list.addFirst(name);
        list.add(1, "" + hitPoints);
        list.add(2, "" + strength);
        list.add(3, weapon);
        return list;
    }

    public void read(List<String> list) {
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            return;
        }

        name = list.getFirst();
        hitPoints = Integer.parseInt(list.get(1));
        strength = Integer.parseInt(list.get(2));
        weapon = list.getLast();

    }

    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
