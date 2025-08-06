package services.PaymentService;

import models.Payment;

public class PaymentGateWay {

    
    public boolean payAmount(Payment request){
        String Method =request.getPaymentMethod();
        PaymentMethod method = switch(Method){
                case "Gpay" -> new Gpay();
                case "Paytm" -> new Paytm();
               default -> throw new IllegalArgumentException("Unsupported payment method: " + Method);
        };
        return method.pay(request);
    }
}
