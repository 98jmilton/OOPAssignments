
/**
 * Write a description of class ShoppingCart here.
 *
 * @author James Milton
 * @version 16/10/2018
 */
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShoppingCart {
    private String timeStamp;
    private final long cartID;
    private ArrayList<Item> items;
    private int total;
    private Customer customer;
    private boolean closed = false;



    /**
     * Constructor for objects of class ShoppingCart
     */
    public ShoppingCart(Customer customer)
    {
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        this.cartID = makeID();
        this.customer = customer;
        items = new ArrayList<>();
    }


    public void addItem(Item item) {
        if(!closed){
            items.add(item);
        }
    }


    public void fillOrder(Order order){
        if(closed){
          for(Item item : items){
              order.addItem(item);
          }
        items.clear();
         }
    }
    
    public Item getItem(int index){
        return items.get(index);
    }
    
    public int getNumItems(){
        return  items.size();
    }
    
    public void removeItem(int index) {
        if(!closed){
            items.remove(index);
        }
    }
    
    public void removeItem(Item item) {
        items.remove(item);
    }

    public long makeID() {
        long id = (long)(1000000000L * Math.random());
        return id;
    }



    public boolean hasItems() {
        if(items.size() > 0){
            return true;
        }
        return false;
    }

    
    public Item getNext() {
        return items.remove(0); // 
    }

    public Customer getCustomer() {
   
       return customer;
    }

    @Override
    public String toString(){
        String out = "Cart Details \n";
        
        out+= "******************************\n";
    
        for (Item item: items){
            out+=item + "\n";
        }

        out+="________________________________\n";
        out+= "Cart Price Total:\t\t" + getCartTotal();

        return out;
        
    }
    
    public int getCartTotal(){
        int total = 0;
        for (Item item: items){
            total+=item.getPrice();
        }
        return total;
    }

    public void clear() {
        items.clear();
    }

    public long getCartID() {
        return cartID;
    }

    public void close() {
            closed = true;

    }

    public long getCartId() {
        return cartID;
    }
}
