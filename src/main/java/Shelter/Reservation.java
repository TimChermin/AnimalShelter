package Shelter;


import Shelter.Animals.Cat;
import Shelter.Animals.Dog;
import Shelter.Interfaces.Animal;

import java.time.LocalDateTime;

public class Reservation {
    private String reservatorName;
    private java.util.Date reservationDate;
    private Animal animal;

    public Animal getAnimal(){
        return animal;
    }

    public String getReservatorName()
    { return reservatorName; }

    public java.util.Date getReservationDate()
    { return reservationDate; }

    public Reservation (String animalName, String animalGender, String animalType, String badHabit, String reservatorName, LocalDateTime reservationDate ){
        this.reservatorName = reservatorName;
        addAnimalToReservation(animalName, animalType, animalGender, badHabit);
        //this.animalType = AnimalType.valueOf(animalType);
    }

    public void addAnimalToReservation(String animalName, String animalType, String animalGender, String badHabit){
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
