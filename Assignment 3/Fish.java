public class Fish extends Animal
{

    Boolean hasFins;
    Boolean canBite;
    Boolean isDangerous;
    Boolean hasSpikes;
    Boolean isEdible;
    String eggs;


    public Fish()
    {
        hasFins = true;
        colour = "grey";
        canBite = false;
        isDangerous = false;
       hasSpikes = false;
       isEdible = false;
    }


    public void eat(Food food){
        //TODO - leave this for now
    }

    public String getColour(){
        return colour;
    }

    public boolean hasFins(){
        return hasFins;
    }
}
