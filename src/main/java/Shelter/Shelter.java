package Shelter;

import Shelter.Animals.Cat;
import Shelter.Animals.Dog;
import Shelter.Interfaces.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Reservation> reservations = new ArrayList<Reservation>();
    private int dogCount;

    List<Reservation> getReservations(){
        return reservations;
    }

    void addReservation(String animalName, String animalGender, String animalType, String badHabit, String reservatorName){
        reservations.add(new Reservation(addAnimalToReservation(animalName, animalGender, animalType, badHabit), reservatorName, LocalDateTime.now()));
    }

    private Animal addAnimalToReservation(String animalName, String animalType, String animalGender, String badHabit){
        switch(animalType) {
            case "cat":
                return new Cat(animalName, animalGender, badHabit);

            case "dog":
                dogCount++;
                return new Dog(animalName, animalGender, dogCount);
        }
        return null;
        //change location?
    }


    //public List<Shelter.Interfaces.Animal> Animals { get; private set; } = new List<Shelter.Interfaces.Animal>();
}
