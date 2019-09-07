package Shelter;

import Shelter.Enums.Gender;

import java.util.Scanner;

public class Form {
    public static void main (String[] args)
    {
        try
        {
            Form obj = new Form();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }

    private Shelter shelter = new Shelter();
    Scanner kbd = new Scanner (System.in);
    String decision;
    boolean continueReservating = true;
    Gender animalGender;

    public void run (String[] args) throws Exception
    {
        while(continueReservating)
        {
            askQuestions();
        }
    }

    public void askQuestions(){
        System.out.println("please enter your name");
        String nameReservator = kbd.nextLine();

        System.out.println("Please enter the name of the animal you are making a reservation for");
        String animalName = kbd.nextLine();

        System.out.println("Please enter the type of animal you are making a reservation for : cat or dog");
        String animalType = kbd.nextLine();
        String badHabit = catOrDog(animalType);


        System.out.println("Please enter the gender of animal you are making a reservation for : male or female");
        String animalGender = kbd.nextLine();

        shelter.addReservation(animalName, animalType, animalGender, badHabit, nameReservator);
        getReservationList();

        System.out.println("enter another name : yes or no");
        decision = kbd.nextLine();
        continueReservating = continueReservations(decision);
    }

    public String catOrDog(String animalType){
        if(animalType.equals("cat")){
            System.out.println("Please enter the badHabit of the animal you are making a reservation for");
            return kbd.nextLine();
        }
        return null;
    }

    private void getReservationList()
    {
        for(Reservation reservation : this.shelter.getReservations()) {
            System.out.println(reservation.getAnimal().toString() + " Reservation made by: " + reservation.getReservatorName()); //+ " " + reservation.getReservationDate().toString());
        }
    }

    private boolean continueReservations(String decision){
        switch(decision) {
            case "yes":
                return true;

            case "no":
                return false;
        }
        return true;
    }
}


