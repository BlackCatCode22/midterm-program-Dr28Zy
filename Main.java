import java.io.*;
import java.util.*;

public class Main {

    // Method to generate a unique ID for an animal based on its species and number
    public static String genUniqueID(String species, int number) {
        return species.substring(0, 3).toUpperCase() + number;
    }

    public static void main(String[] args) {

        // Welcome message for the Zoo Program
        System.out.println("\nWelcome to Daniel & Angelo's Zoo Program!\n");

        // Initialize ArrayLists to store objects of each animal type
        ArrayList<Hyena> hyenaArrayList = new ArrayList<>();
        ArrayList<Lion> lionArrayList = new ArrayList<>();
        ArrayList<Tiger> tigerArrayList = new ArrayList<>();
        ArrayList<Bear> bearArrayList = new ArrayList<>();

        // Define the path to the file containing arriving animal data
        String path = "C:\\Users\\nstp2\\Documents\\School TINGS\\CIT 63 Java Programming\\arrivingAnimals.txt";

        // Read the file and process each line to create animal objects
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String myFileLine;

            // Loop through each line in the file
            while ((myFileLine = br.readLine()) != null) {
                // Split the line into an array based on commas
                String[] myArrayOfAnimalData = myFileLine.split(",");

                // Extract attributes from the split data
                String[] ageSexSpecies = myArrayOfAnimalData[0].split(" ");
                String age = ageSexSpecies[0];
                String sex = ageSexSpecies[3];
                String species = ageSexSpecies[4];
                String birthSeason = myArrayOfAnimalData[1].split(" ")[2].toLowerCase();
                String color = myArrayOfAnimalData[2];
                String weight = myArrayOfAnimalData[3];
                String origin1 = myArrayOfAnimalData.length > 4 ? myArrayOfAnimalData[4] : "";
                String origin2 = myArrayOfAnimalData.length > 5 ? myArrayOfAnimalData[5] : "";
                String origin3 = myArrayOfAnimalData.length > 6 ? myArrayOfAnimalData[6] : "";

                // Create animal objects based on the species and add them to the respective ArrayLists
                switch (species.toLowerCase()) {
                    case "hyena":
                        Hyena newHyena = new Hyena(color, birthSeason);
                        hyenaArrayList.add(newHyena);
                        break;
                    case "lion":
                        Lion newLion = new Lion(color, birthSeason);
                        lionArrayList.add(newLion);
                        break;
                    case "tiger":
                        Tiger newTiger = new Tiger(color, birthSeason);
                        tigerArrayList.add(newTiger);
                        break;
                    case "bear":
                        Bear newBear = new Bear(color, birthSeason);
                        bearArrayList.add(newBear);
                        break;
                }
            }
        } catch (IOException e) {
            // Print any exceptions that occur during file reading
            e.printStackTrace();
        }

        // Print details of each animal in the ArrayLists
        for (Hyena aHyena : hyenaArrayList) {
            System.out.println(aHyena.getAnimalID() + ", " + aHyena.getAnimalName() + ", " + aHyena.getAnimalColor());
        }
        for (Lion aLion : lionArrayList) {
            System.out.println(aLion.getAnimalID() + ", " + aLion.getAnimalName() + ", " + aLion.getAnimalColor());
        }
        for (Tiger aTiger : tigerArrayList) {
            System.out.println(aTiger.getAnimalID() + ", " + aTiger.getAnimalName() + ", " + aTiger.getAnimalColor());
        }
        for (Bear aBear : bearArrayList) {
            System.out.println(aBear.getAnimalID() + ", " + aBear.getAnimalName() + ", " + aBear.getAnimalColor());
        }
    }
}
