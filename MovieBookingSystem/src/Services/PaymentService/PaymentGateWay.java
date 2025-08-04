package Services.PaymentService;

import Models.Payment;
import Services.PaymentService.*;

public class PaymentGateWay {

    
    public boolean payAmount(Payment resquest){
        String Method =resquest.getPaymentMethod();
        PaymentMethod method = switch(Method){
                case "Gpay" -> new Gpay();
                case "Paytm" -> new Paytm();
               default -> throw new IllegalArgumentException("Unsupported payment method: " + Method);
        };
        return method.pay(request);
    }
}
