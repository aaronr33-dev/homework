package objectHomework;

public class Person {
    //fields
    private String name;
    private int age;
    private String favSport;
    private String occup;
    private int salary;

    //Default Constructor
    public Person(){}
    //Overloaded Constructor
    public Person (String name, int age, String favSport, String occup, int salary){
        this.name = name;
        this.age = age;
        this.favSport = favSport;
        this.occup = occup;
        this.salary = salary;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Favorite Sport
    public String getFavSport() {
        return favSport;
    }
    public void setFavSport(String favSport) {
        this.favSport = favSport;
    }

    // getter and Setter for Occupation
    public String getOccup() {
        return occup;
    }
    public void setOccup(String occup) {
        this.occup = occup;
    }

    //Getter and Setter for Salary
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // the Print Method that prints out their whole life story
    public String printMethod(/*String name, int age, String favSport, String occup, int salary*/){
        return "My name is " + name + " and I am " + age + " years old. My Favorite sport is " + favSport +
                " and by this time next year my occupation will be " + occup + " meaning I could be making up" +
                " to $" + salary+ " yearly! ";

    }

    //Bonus MEthod
    public int yearlyBonus(int salary, int bonus){
        return salary + bonus;
    }





}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mike", 34, "Football", "Software Developer", 85000);
        Person p2 = new Person("John", 23, "Soccer", "I.T. Manager", 90000);
        Person p3 = new Person("Huey", 28, "Lacrosse", "AWS Solutioins Architect", 105000);

        Person[] peeps = {p1, p2, p3};

        for (Person p : peeps) {
            System.out.println(p.printMethod());
        }

        p1.setSalary(90000);
        System.out.println("\n" + p1.getName() + "\'s new salary is $" + p1.getSalary());

        //p1.yearlyBonus(90000, 800);
        System.out.println("\n" + p1.getName() + "\'s new salary after the bonus is $" + p1.yearlyBonus(90000, 800));

    }
}