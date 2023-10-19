import java.util.*;

public class Hyena extends Animal {
    private static ArrayList<String> hyenaNames = new ArrayList<>();
    private static int hyenaCount = 0;

    // Constructor for the Hyena class
    public Hyena(String animalColor, String birthSeason) {
        super(animalColor, birthSeason);
        hyenaCount++;
        this.animalID = "HYE" + hyenaCount;
        this.animalName = hyenaNames.get(hyenaCount - 1);
    }

    // Static initialization block to read hyena names from file
    static {
        hyenaNames.addAll(readNamesFromFile("C:\\Users\\nstp2\\Documents\\School TINGS\\CIT 63 Java Programming\\arrivingAnimals.txt"));
    }
}
