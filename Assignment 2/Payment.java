
public class Payment {
    private final Customer customer;
    private final String cardType;
    private final long number;
    private final double amount;
    private final String date;
    private Address address;
    private boolean valid;

    public Payment(Customer customer, Address address, String cardType, 
    long number, String date, Order order) {
        this.customer = customer;
        this.cardType = cardType;
        this.number = number;
        this.date = date;
        this.address = address;
        this.amount = order.getOrderTotal();
        validate();

        if(isValid()){
            makePayment(order);
        }else{
            order.setStatus("PAYMENT_FAILURE");
        }
    }
    

    private void validate(){
        if ((cardType.equalsIgnoreCase("Visa")|| cardType.equalsIgnoreCase("MasterCard"))
        && number > 12345 && amount <10000){
            valid = true;
        }
    }
   

    private void makePayment(Order order) {
        order.setStatus("PAYMENT_SUCCESS");
        order.setPaymentType(cardType);
    }

    public boolean isValid() {
        return valid;
    }
    

}
