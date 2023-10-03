import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Specify the file path for reading and writing
        String filePath = "C:\\Users\\BE218\\IdeaProjects\\ArrivingAnimals\\src\\arrivingAnimals.txt";

        //How many animals do we have
        System.out.println("\n Before we use 'new' We have: " + Animal.numOfAnimals);

        // String genUniqueID (String species, )



        ArrayList<Animal> animalList = new ArrayList<>(); // Fix the ArrayList declaration

        // Create the File object
        File file = new File(filePath);

        try {
            // Create the parent directories if they don't exist
            File parentDirectory = file.getParentFile();
            if (!parentDirectory.exists()) {
                parentDirectory.mkdirs();
            }

            // Create a FileWriter to write to the file
            FileWriter writer = new FileWriter(file);

            // Create a BufferedWriter to write efficiently
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            // Open and read an existing animal file
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;

            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                // Split the line into 5 substrings (assuming your data has 5 parts)
                String[] myArray = line.split(",");

                // Create an Animal object from the Animal class
                Animal anyOldAnimal = new Animal();

                // Fill the object's data fields
                anyOldAnimal.species = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.origin1 = myArray[3];
                anyOldAnimal.origin2 = myArray[4];

                // Add the Animal object to the ArrayList
                animalList.add(anyOldAnimal);

                // Write each line of the animalList to the file (you may remove this if not needed)
                bufferedWriter.write(anyOldAnimal.toString() + "\n");
            }

            // Close the BufferedReader and BufferedWriter
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Data has been read from and written to the file successfully.");

            // Output the ArrayList
            for (Animal animal : animalList) {
                System.out.println(animal.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Animal animal : animalList) {
            System.out.print(animal.species);
            System.out.print(animal.birthSeason);
            System.out.print(animal.color);
            System.out.print(animal.weight);
            System.out.print(animal.origin1);
            System.out.print(animal.origin2);

        //Create a new animal object.
        Animal myAnimal = new Animal();
        Animal mySecondAnimal = new Animal("some name", "hyena");

        String aName = mySecondAnimal.name;
            System.out.println("\n the animal name is: " + aName);

//        // Hyenas
        Hyena myHyena = new Hyena();
//        myHyena.name = "Shenzi";
//        myHyena.birthSeason = "Spring";
//        myHyena.color = "Tan color";
//        myHyena.weight = "70 pounds";
//        myHyena.origin1 = "Friguria Park";
//        myHyena.origin2 = "Tunisia";

        //Look at the new Hyena object.
            System.out.println("\n The hyena name is: " + myHyena.name);

        Hyena aNewHyena = new Hyena("Zig", "hyena");

        System.out.println("\n the name of my Hyena is: " + aNewHyena.name);
        }

    }
}