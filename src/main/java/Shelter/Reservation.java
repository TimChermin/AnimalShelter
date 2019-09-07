package Shelter;


import Shelter.Animals.Cat;
import Shelter.Animals.Dog;
import Shelter.Interfaces.Animal;

import java.time.LocalDateTime;

class Reservation {
    private String reservatorName;
    private java.time.LocalDateTime reservationDate;
    private Animal animal;

    Animal getAnimal(){
        return animal;
    }

    String getReservatorName()
    { return reservatorName; }

    java.time.LocalDateTime getReservationDate()
    { return reservationDate; }

    Reservation(String animalName, String animalGender, String animalType, String badHabit, String reservatorName, LocalDateTime reservationDate){
        this.reservatorName = reservatorName;
        this.reservationDate = reservationDate;
        addAnimalToReservation(animalName, animalType, animalGender, badHabit);
        //this.animalType = AnimalType.valueOf(animalType);
    }

    private void addAnimalToReservation(String animalName, String animalType, String animalGender, String badHabit){
        switch(animalType) {
            case "cat":
                animal = new Cat(animalName, animalGender, badHabit);
                break;

            case "dog":
                animal = new Dog(animalName, animalGender);
                break;
        }
    }
}
