package services.PaymentService;

import models.Payment;

public class Gpay implements PaymentMethod{


    @Override
    public boolean pay(Payment payment) {
        System.out.println("Amount paid successfully  Rs: "+ payment.getAmount() +" PaymentMethod :  "+payment.getPaymentMethod());
        return true;
    }

    
}
