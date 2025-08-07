package models;

public class Payment {
    private static int id =1;
    private final int paymentId ;
    private final String paymentMethod;
    private final float amount;
    private final String transactionId;
    private final String paymentDate;

    public Payment(String paymentMethod ,String transactionId ,String paymentDate, float amount ) {
    this.paymentId = id++;
    this.paymentMethod=paymentMethod ;
    this.amount=amount;
    this.transactionId=transactionId;
    this.paymentDate=paymentDate;

    }

    // getter

    public int getPaymentId(){
        return this.paymentId;
    }

   public String getTransactionId(){
        return this.transactionId;
    }

    public float getAmount(){
        return this.amount;
    }

    public String getPaymentDate(){
        return this.paymentDate;
    }
    public String getPaymentMethod(){
        return this.paymentMethod;
    }
    

}
