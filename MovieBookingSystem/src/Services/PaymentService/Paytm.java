package Services.PaymentService;

import Models.Payment;

public class Paytm implements PaymentMethod {

    @Override
    public boolean pay(Payment payment) {
        System.out.println("Amount paid successfully  Rs: "+ payment.getAmount() +" PaymentMethod :  "+payment.getPaymentMethod());
        return true;   
     }
    
}
