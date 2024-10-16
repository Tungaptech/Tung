package Demo4;

// Class kế thừa từ Abstract và Interface
class Circle extends Shape implements Colorable {
    void draw() {
        System.out.println("Drawing a circle");
    }

    public void color() {
        System.out.println("Coloring the circle");
    }
}