package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        Country first = new Country("Jonas land", 4, "Hayden", 47, 2.0);
        Country second = new Country("Leichtenstein", 8, "Egborg", 2300, 1.3);
        Resident person = new Resident("Edmond", 28,false);
        Bugs bug = new Bugs("jawnoliver the 3th", "red", true);


        System.out.println(first.compareSizeTo(second));
        System.out.println(first.sizeNYearsFromNow(4));
        System.out.println("This Bug wheighs " + bug.findWeightFromName() + " Stones");
        System.out.println(bug.canFly());
        System.out.println(person.isHappy());
        System.out.println("this person will be bald in " + person.baldingRateBaldBy(200) + " years");
    }
}
