package org.vashonsd;

public class Bugs {
    String name;
    String color;
    boolean fatBug;

    public Bugs(String name, String color, boolean fatBug) {
        this.name = name;
        this.color = color;
        this.fatBug = fatBug;
    }

    String thisbugwheighs = "this bug wheighs";
    String Stones = "Stones";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFatBug() {
        return fatBug;
    }

    public void setFatBug(boolean fatBug) {
        this.fatBug = fatBug;
    }

    public double findWeightFromName() {
        if (fatBug == true) {
            return name.length() * color.length();
        }
        return name.length() / color.length();
    }

    public boolean canFly() {
        if (findWeightFromName() <= 14){
            return true;
        }
        return false;

    }
}
