package org.vashonsd;

public class Resident {
    String name;
    int age;
    boolean cool;

    public Resident(String name, int age, boolean cool) {
        this.name = name;
        this.age = age;
        this.cool = cool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCool() {
        return cool;
    }

    public void setCool(boolean cool) {
        this.cool = cool;
    }
    public boolean isHappy() {
        return (cool == true && name.length() > 3 && age < 70);
    }

    public int baldingRateBaldBy(int hairLeft) {
        return hairLeft / age;
    }
}
