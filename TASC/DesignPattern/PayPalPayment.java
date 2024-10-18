package DesignPattern;

class PayPalPayment extends Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of: $" + amount);
    }
}