import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public abstract class Animal {
    protected String animalID;
    protected String animalName;
    protected String animalColor;
    protected String birthDate;

    // Constructor for the Animal class
    public Animal(String animalColor, String birthSeason) {
        this.animalColor = animalColor;
        this.birthDate = calcBirthdate(birthSeason);
    }

    // Utility method to read names from a file
    protected static List<String> readNamesFromFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Error reading from file: " + filePath);
            return new ArrayList<>();
        }
    }

    // Method to calculate birthdate based on birth season
    protected String calcBirthdate(String birthSeason) {
        switch (birthSeason.toLowerCase()) {
            case "spring":
                return "March 20";
            case "summer":
                return "June 21";
            case "fall":
                return "September 22";
            case "winter":
                return "December 21";
            default:
                return "Unknown";
        }
    }

    // Getter methods
    public String getAnimalID() {
        return animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
