package flavins.com.codes;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {
    private String name;
    private int strenght;
    private int hitPoints;
    private String weapon;

    public Player(String name, int strenght, int hitPoints) {
        this.name = name;
        this.strenght = strenght;
        this.hitPoints = hitPoints;
        this.weapon = "Ofor";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strenght=" + strenght +
                ", hitPoints=" + hitPoints +
                ", weapon='" + weapon + '\'' +
                '}';

    }


    @Override
    public List<String> write() {
        List<String>values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strenght );
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null & savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }
}

