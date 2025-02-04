package Homework.HW31012025;

public enum Continents {

    ASIA("Asia",460000000),
    EUROPE("Europe", 750000000),
    AFRICA("Africa", 1300000000),
    AMERICA("America", 1000000000);

    public long getPopulation() {
        return population;
    }

    private final String continentName;
    private final long population;


    @Override
    public String toString() {
        return "Continents{" +
                "continentName='" + continentName + '\'' +
                ", population=" + population +
                '}';
    }

    Continents(String continentName, long population) {
        this.continentName = continentName;
        this.population = population;
    }


    /*

    2. Enum Method Override
Modify the Continents enum below to override the toString() method so that it returns the name of the continent along with its population.
public enum Continents {
    ASIA(4600000000),
    EUROPE(750000000),
    AFRICA(1300000000),
    AMERICA(1000000000);

    private final int population;

    Continents(int population) {
        this.population = population;
    }
}


     */



}
