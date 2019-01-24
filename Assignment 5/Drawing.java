import java.util.ArrayList;

public class Drawing {
    private ArrayList<Drawing> drawingArr = new ArrayList<>();
    private String name="";
    private String colour="Black";

    Drawing() {
    }

    //used to add a new shape to drawingArray
    void add(Drawing drawing){
            drawingArr.add(drawing);
    }

    //used to remove a shape from drawingArray
    void remove(Drawing drawing){
        drawingArr.remove(drawing);
    }

    //Used to print all objects in the array
    void print(){
        for (Drawing aDrawingArr : drawingArr) {
            System.out.println("Drawing a: \"" +aDrawingArr.getName()+ "\" of Colour: \""+getColour() + "\"\n");

        }
    }

    //sets colour of the drawing, handling any incorrect colours that might be added
    void setColour(String colour) throws IllegalArgumentException{
        if(colour.equalsIgnoreCase("black") ||colour.equalsIgnoreCase("red") ||colour.equalsIgnoreCase("blue"))
        {this.colour=colour;}
        else{
            throw new IllegalArgumentException("Invalid color argument entered: \""+colour+"\"\n");
        }
    }

    
    //Getters and setters
    void setName(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }

    public String getColour(){
        return colour;
    }
}
