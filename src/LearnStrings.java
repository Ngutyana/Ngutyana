public class LearnStrings {
    public static void main(String[] args) {
        String fruit = "Orange";
        String anotherFruit = "Orange";
        String vegetable = new String("Carrot");
        String anotherVegetable = new String("Carrot");

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);
    }
}
