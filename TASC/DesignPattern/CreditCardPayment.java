package DesignPattern;

// Các sản phẩm cụ thể
class CreditCardPayment extends Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of: $" + amount);
    }
}