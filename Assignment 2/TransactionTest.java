
/**
 * TransactionTest is a class that does one thing only
 * It provides methods for testing out different test scenarios
 * for our Shopping Cart Transaction classes
 * @author Ihsan Ullah
 * @version 04 October 2018
 */

public class TransactionTest
{
    

    public static void main(String[] args)
    {
       TransactionTest test = new TransactionTest();
       test.transaction1();
       test.transaction2();
    }
    
    public void transaction1(){ 
        System.out.println(" ******** Transaction Scenario 1 ******** ");
    
        Customer customer = new Customer("Niamh", "O'Leary", "niamhol@zmail.com");
   
        ShoppingCart cart = new ShoppingCart(customer);
    
        Item item1 = new Item("Milk", 846512);
        item1.setPrice(4);
        cart.addItem(item1);
   
        Item item2 = new Item("Coat", 159851);
        item2.setPrice(24);
        cart.addItem(item2);
   
        Item item3 = new Item("Eggs", 489532);
        item3.setPrice(8);
        cart.addItem(item3);
   
        cart.close();
   
        Order order = new Order(cart);
   
        Address delivery = new Address();
        delivery.setAddressField1("141 Dun na coiribe");
        delivery.setAddressField2 ("Headford Rd");
        delivery.setCity ("Galway");
        delivery.setCountry ("Ireland");
        delivery.setZip ("G12 H123");
   
        order.setDelivery(delivery);
   
        Address invoice = new Address(delivery);
        order.setInvoice(invoice);


        Payment payment = new Payment(customer, invoice, "Visa", 1234567891, "16/10/2018", order);
  
        Email email = new Email(customer);
        
        if (order.getPaymentSuccess()){
            email.createMessage("ORDER_SUCCESS", order); //create a message for the success email
        }else{
            email.createMessage("ORDER_FAIL", order); // create a message for the failure email
        }
        email.send(); //send the email
    }
    
    
    
    public void transaction2(){  
    
    System.out.println(" ******** Transaction Scenario 2 ******** ");
    
    Customer customer = new Customer("Kaelan", "Quinn", "kaelan@zmail.com");
   
    ShoppingCart cart = new ShoppingCart(customer);
    
    Item item1 = new Item("2kg of pasta", 91345);
    item1.setPrice(15);
    cart.addItem(item1);
   
    Item item2 = new Item("Super Mario Hat", 91342);
    item2.setPrice(10);
    cart.addItem(item2);
   
    Item item3 = new Item("Maroon Jacket", 12394);
    item3.setPrice(16);
    cart.addItem(item3);
    
    System.out.println(cart);
    

    cart.removeItem(1); //remove 2nd item

    cart.close();
  
    Order order = new Order(cart);
   
    Address delivery = new Address();
    delivery.setAddressField1("141 Dun na coiribe");
    delivery.setAddressField2 ("Headford Rd");
    delivery.setCity ("Galway");
    delivery.setCountry ("Ireland");
    delivery.setZip ("G12 H123");
   
    order.setDelivery(delivery);

    Address invoice = new Address(delivery);
    order.setInvoice(invoice);

    Payment payment = new Payment(customer, invoice, "MasterCard", 987654445, "01/10/2018", order);
  
    Email email = new Email(customer);

    if (order.getPaymentSuccess()){
        email.createMessage("ORDER_SUCCESS", order);
     }else{
        email.createMessage("ORDER_FAIL", order); 
     }
    email.send(); //send the email
    }
}
