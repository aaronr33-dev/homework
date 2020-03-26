package talkPets;

public class Pet {
    //Fields
    private String name;

    //Default Constructor
    public Pet(){}

    //Overloaded Constructor
    public Pet(String name ){
        this.name = name;
        //this.legs = legs;
        //this.hasTail = hasTail;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "All animals speak";
    }


}
