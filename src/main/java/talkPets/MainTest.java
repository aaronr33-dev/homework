package talkPets;

/*
As a fair warning, I realized that this is not the most
"Object Oriented" approach. I kept running through scenarios
and different logic. After a while, I just stuck with the
basics and produced this code. I felt like I was overthinking
some things, but I didn't plan for my code to be this
rudimentary and basic
 */

import java.util.Scanner;
import java.util.Arrays;

public class MainTest {

    public static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Fish fish1 = new Fish();

        int i = 0; int howMany;   // initializes counter i to zero  howMany is the user input for how many pets they have
        String hp;  // hp for house pet


        System.out.println("How many pets do you have? ");      // prompts the user to ask how many pets they have
        howMany = sc.nextInt();
        String[] pets = new String [howMany];                   // creates an array to store all of the pet information

        while (i < howMany){                                       // This loop will continue based on how many pets the user has
            System.out.println("What kind of animal is it? ");      // Prompts the user to enter what kind of pet it is
            String animal = sc.next();                              // user enters the kind of pet
            switch (animal){                                        // The switch case is for invoking the getName and speak method based on the type of animal
                case "dog":
                    System.out.println("What is the name? ");
                    hp = sc.next();                                // This allows the user to enter the name
                    dog1.getName();                               // This invokes the getName method and assigns the hp variable to it
                    pets[i] = "I'm " + hp + "." + dog1.speak();   // This stores the information in the array that was created previously
                    break;                                         // This logic repeats itself for the cat and fish types
                case "cat":
                    System.out.println("What is the name? ");
                    hp = sc.next();
                    cat1.getName();
                    pets[i] = "I'm " + hp + "." + cat1.speak();
                    break;
                case "fish":
                    System.out.println("What is the name? ");
                    hp = sc.next();
                    fish1.getName();
                    pets[i] = " I'm " + hp + "." + fish1.speak();
                    break;
            }
            i++;
        }
        for(i = 0; i < pets.length; i++){     // This loop prints out all of the pets that were stored in the array
            System.out.println(pets[i]);
        }

   }
}
