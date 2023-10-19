import java.util.*;

public class Lion extends Animal {
    private static ArrayList<String> lionNames = new ArrayList<>();
    private static int lionCount = 0;

    // Constructor for the Lion class
    public Lion(String animalColor, String birthSeason) {
        super(animalColor, birthSeason);
        lionCount++;
        this.animalID = "LIO" + lionCount;
        this.animalName = lionNames.get(lionCount - 1);
    }

    // Static initialization block to read lion names from file
    static {
        lionNames.addAll(readNamesFromFile("C:\\Users\\nstp2\\Documents\\School TINGS\\CIT 63 Java Programming\\arrivingAnimals.txt"));
    }
}
