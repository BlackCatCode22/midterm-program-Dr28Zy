public class Cat {

    public static final int MAX_LIVES = 9;
    private static int CatCount = 0;
    String name;
    int age;
    int livesRemaining;

    String meowSound;

    public String toString() {
        return "Cat{name='" + name + "', age=" + age + "}";
    }

    public void meow(){
        System.out.println("Meow");
    }
    public Cat () {
        CatCount++;
        livesRemaining = MAX_LIVES;

    }

    public static int getCatCount(){
        return CatCount;
    }
}
