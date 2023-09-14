import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> catList = new ArrayList<>();

        Cat myCat1 = new Cat();
        myCat1.meowSound = "Moo";
        myCat1.name = "Fluffy";
        myCat1.age = 3;

        Cat myCat2 = new Cat();
        myCat2.meowSound = "Bark";
        myCat2.name = "Gansito";
        myCat2.age = 8;

        Cat myCat3 = new Cat();
        myCat3.meowSound = "Roar";
        myCat3.name = "Whiskers";
        myCat3.age = 1;

        Cat myCat4 = new Cat();
        myCat4.meowSound = "I'm Cool";
        myCat4.name = "Simba";
        myCat4.age = 2;

        Cat myCat5 = new Cat();
        myCat5.meowSound = "AAAHHH";
        myCat5.name = "Lucy";
        myCat5.age = 5;

        catList.add(myCat1);
        catList.add(myCat2);
        catList.add(myCat3);
        catList.add(myCat4);
        catList.add(myCat5);

        for (Cat cat : catList) {
            System.out.println(cat.toString()); // Print the cat object's fields using toString
        }
        

        System.out.println("Max Lives: " + Cat.MAX_LIVES);

        System.out.println("Cat Count: " + Cat.getCatCount());

    }
}