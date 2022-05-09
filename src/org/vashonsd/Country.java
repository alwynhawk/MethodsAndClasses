package org.vashonsd;

public class Country {
    String name;
    int states;
    String president;
    int population;
    double growthRate;

    public Country(String name, int states, String president, int population, double growthRate) {
        this.name = name;
        this.states = states;
        this.president = president;
        this.population = population;
        this.growthRate = growthRate;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }

    public String getPresident() {
        return president;
    }


    public void setPresident(String president) {
        this.president = president;
    }

    public int compareSizeTo(Country otherCountry) {
        if (this.getPopulation() < otherCountry.getPopulation()) {
            return -1;
        }

        if(this.getPopulation() == otherCountry.getPopulation()) {
            return 0;
        }

        return 1;
    }

    public int sizeNYearsFromNow(int years) {
        return (int) ((population * getGrowthRate()) * years);
    }

}
