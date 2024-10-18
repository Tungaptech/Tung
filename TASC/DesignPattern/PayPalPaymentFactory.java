package DesignPattern;

class PayPalPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new PayPalPayment();
    }
}