package DesignPattern;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();

        Configuration config = Configuration.getInstance();
        System.out.println(config.getConfigValue());

        PaymentFactory factory = new CreditCardPaymentFactory();
        Payment payment = factory.createPayment();
        payment.processPayment(100.0);

        factory = new PayPalPaymentFactory();
        payment = factory.createPayment();
        payment.processPayment(200.0);


    }
}

