class Fruit {
    private String name;
    private String taste;
    private String size;
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }
    public void eat() {
        System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}
class Apple extends Fruit {
    public Apple(String size) {
        super("Apple", "Sweet", size);
    }
    @Override
    public void eat() {
        System.out.println("Apple: Sweet and Crispy");
    }
}
class Orange extends Fruit {
    public Orange(String size) {
        super("Orange", "Citrusy", size);
    }
    @Override
    public void eat() {
        System.out.println("Orange: Tangy and Juicy");
    }
}
public class FruitTest {
    public static void main(String[] args) {
        Apple apple = new Apple("Medium");
        Orange orange = new Orange("Large"); // Calling overridden eat() method for each fruit
        apple.eat();
        orange.eat();
    }
}
