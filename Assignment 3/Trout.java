public class Trout extends Fish
{
    String name;
    public Trout(String name)
    {
        super();
        this.name = name;
        hasSpikes = true;
        colour = "brown";
        isEdible=true;
        eggs="I swim upriver to lay eggs";
}
    @Override
    public String toString(){
        String strng ="";
        strng+= "Trout; \n";
        strng+= "Name: ";
        strng+= name;
        strng+= "; \n";
        strng+= "Colour: ";
        strng+= colour;
        strng+= "\n";
        strng+= "Breaths: " + breathes + "; \n";
        strng+= "Has Skin: " + hasSkin + "; \n";
        strng+= "Has spikes: " + hasSpikes + "; \n";
        strng+= "Has fins: " + hasFins + "; \n";
        strng+= "Eggs: " + eggs + "; \n";
        strng+= "Is Dangerous: " + canBite + "; \n";
        strng+= "Can Bite: " + canBite + "; ";
        return strng;
    }
    /**
     Equals method: here I decided to use object != null in order to ensure that a null object would return false
     I then used object==this as is is the shortest and most direct way to compare both objects. While a comparison of
     each internal variable, i.e. name == this.name, colour == this.colour etc., could have been used,
     i found my method to be a more efficient way of doing the same job
     */
    @Override
    public boolean equals(Object object) {
        if(object != null){
        if (object == this) {
            return true;
        } else {
            return false; //default equals}
        }
        }
        else{
            return false;
        }
    }
}

