package SOLID;

interface PaymentMethod {
    void processPayment();
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Credit Card payment method called");
    }
}

class QiwiPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Credit Card payment method called");
    }
}


public class OpenClosed {
    private final PaymentMethod paymentMethod;

    public OpenClosed(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void processPayment() {
        paymentMethod.processPayment();
    }
    public static void main(String[] args) {

        OpenClosed paymentMethod = new OpenClosed(new CreditCardPayment());
        OpenClosed qiwiPayment = new OpenClosed(new QiwiPayment());
        paymentMethod.processPayment();
        qiwiPayment.processPayment();
    }
}
