public class Animal {

    public static int numOfAnimals = 0;

    //Create a constructor
    public Animal () {
        numOfAnimals++;
    }

    public Animal(String theName, String theSpecies) {
        this.name = theName;
        this.species = theSpecies;
    }

    String name;
    String species;

    String birthSeason;

    String color;

    String weight;

    String origin1;

    String origin2;



}