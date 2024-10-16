package Demo4;

class OverloadExample {
    void display(int a) {
        System.out.println("Display int: " + a);
    }

    void display(String b) { // Overloading
        System.out.println("Display String: " + b);
    }
}

