package Demo4;

public class OOPDemo {
    public static void main(String[] args) {
        // Class và Instance
        Animal myDog = new Dog();
        myDog.sound(); // Overriding: Dog barks

        // Abstract và Interface
        Circle circle = new Circle();
        circle.draw(); // Drawing a circle
        circle.color(); // Coloring the circle

        // this và super
        Child child = new Child();
        child.display(); // Parent display
    }
}
