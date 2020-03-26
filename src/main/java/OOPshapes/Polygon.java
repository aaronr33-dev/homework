package OOPshapes;

public class Polygon {
    //Fields
    private int height;
    private int base;

    //Default Constructor
    public Polygon(){}

    public Polygon(int height, int base){}


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int calculateArea(int height, int base) {
        return base * height;
    }

    public int calculateArea(int x){
        return x * 10;
    }




}
class Main {
    public static void main(String[] args) {
        Polygon triangle = new Polygon();
        System.out.println(triangle.calculateArea(4,6));

        triangle.setBase(10);
        triangle.setHeight(20);

        System.out.println(triangle.calculateArea(5));

    }
}