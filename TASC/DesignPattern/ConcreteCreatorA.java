package DesignPattern;

// Các Creator cụ thể
class ConcreteCreatorA extends Creator {
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}