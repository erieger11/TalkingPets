package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        System.out.println("how many pets do you have?");
       int petsSize = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < petsSize ; i++) {
            System.out.println("What Kind of pet?");
            String typeOfPet = scan.nextLine().toLowerCase();
            System.out.println("What is the name of your pet?");
            String petName = scan.nextLine();

            switch(typeOfPet){
                case "cat" : petList.add(new Cat(petName));
                    break;
                case "dog" : petList.add(new Dog(petName));
                    break;
                case "lizard" : petList.add(new Lizard(petName));
                    break;
                case "rodent" : petList.add(new Rodent(petName));
                    break;
                default : System.out.println("Nope, wrong type");
                    break;
            }
        }
        for(Pet pet : petList){
            System.out.println(pet.getName() + " says " + pet.speak());
        }
    }
}
