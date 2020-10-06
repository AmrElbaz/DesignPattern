package designPattern.behavioral.strategy;

public class Strategy implements Payment {
   Payment payment;
   public Strategy(Payment payment) {
       this.payment = payment;
   }
    @Override
    public String calcPayment() {
        return payment.calcPayment();
    }
}
