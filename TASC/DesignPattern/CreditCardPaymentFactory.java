package DesignPattern;

// Các Factory cụ thể
class CreditCardPaymentFactory extends PaymentFactory {
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}