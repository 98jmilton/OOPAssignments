 

import java.util.ArrayList;


public class Order {
    private final long orderId;
    private final Customer customer;
    private long cartId;
    private ArrayList<Item> orderItems = new ArrayList<Item>();
    private double orderTotal;
    private Address delivery;
    private Address invoice;
    private String paymentType;
    private String orderStatus = "PREPAYMENT";
    
    public Order(ShoppingCart cart){
        orderId = getNewId();
        customer = cart.getCustomer();
        cartId = cart.getCartId();
        int numItems = cart.getNumItems();


        while(cart.hasItems()){
            Item item = cart.getNext();
            orderItems.add(item);
            orderTotal+=item.getPrice();
        }

        }

    private long getNewId(){
        long id = (long)(1000000000L * Math.random());
        return id;
    }
    
    public void addItem(Item item){
        orderItems.add(item);
    }

    
    public long getOrderNumber(){
        return orderId;
    }

    public void setAddress(Address delivery) {
        this.delivery = delivery;
    }

    public long getOrderId() {
        return orderId;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public boolean getPaymentSuccess() {
        return orderStatus.equals("PAYMENT_SUCCESS");
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;

    }

    public void setDelivery(Address delivery) {
        this.delivery = delivery;

    }


    public void setInvoice(Address invoice) {
        this.invoice = invoice;
    }


    public String getPaymentType(String paymentType) {
         return paymentType;
    }
    
    public void setStatus(String status) {
        orderStatus = status;
    }
    
    
    public String getStatus() {
        return orderStatus;
    }

    @Override
    public String toString(){
        String out = "Order Details for order number " ;
        out += orderId;
        out += "\n";
        
        out+= "******************************\n";
    
        for (Item item: orderItems){
            out+=item + "\n";
        }
        out+="________________________________\n";

        out+= delivery.printAddress("Delivery");
        out+= invoice.printAddress("Billing");

        out+="________________________________\n";
        out+= "Order Price Total:\t\t";
        out+= + getOrderTotal();
        out+="\n";
        out+= "Order status: ";
        out+= getStatus();
        out+="\n******************************\n ";
        
        return out;
        
    }


}
