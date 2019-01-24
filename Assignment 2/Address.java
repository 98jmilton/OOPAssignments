 

public class Address {
    String addressField1;
    String addressField2;
    String city;
    String zip;
    String country;



    public Address(Address address) {
        addressField1= address.getAddressField1();
        addressField2= address.getAddressField2();
        city= address.getCity();
        zip= address.getZip();
        country = address.getCountry();
    }

    public Address() {

    }


    public void setAddressField1(String address1){
        addressField1 = address1;
       
    }
    
    public void setAddressField2(String address2){
        addressField2 = address2;
       
    }
    
    public void setCity(String city){
        this.city = city;
       
    }
    
    public void setZip(String zip){
        this.zip = zip;
       
    }
    
    public void setCountry(String country){
        this.country = country;
       
    }

    public String printAddress(String type) {
        String out= type+ " Address for this order:\n" ;
        out+="\t"+getAddressField1()+"\n";
        out+="\t"+getAddressField2()+"\n";
        out+="\t"+getCity()+"\n";
        out+="\t"+getCountry()+"\n";
        out+="\t"+getZip()+"\n";
        return out;
    }


    public String getAddressField1(){
        return addressField1;
    }
    
    public String getAddressField2(){
        return addressField2;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getZip(){
        return zip;
    }
    
    public String getCountry(){
        return country;
    }



}
