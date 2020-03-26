package talkPets;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {

    }

    @Override
    public String speak(){
        return " Meow Meow";
    }
}
