package services.PaymentService;
import models.Payment;

interface PaymentMethod {

    public boolean pay(Payment payment);



}
