package Shelter;


import Shelter.Animals.Cat;
import Shelter.Animals.Dog;
import Shelter.Interfaces.Animal;

import java.time.LocalDateTime;

class Reservation {
    private String reservatorName;
    private java.time.LocalDateTime reservationDate;
    private Animal animal;
    private int dogCount;

    Animal getAnimal(){
        return animal;
    }

    String getReservatorName()
    { return reservatorName; }

    java.time.LocalDateTime getReservationDate()
    { return reservationDate; }

    Reservation(Animal animal, String reservatorName, LocalDateTime reservationDate){
        this.reservatorName = reservatorName;
        this.reservationDate = reservationDate;
        this.animal = animal;
        //this.animalType = AnimalType.valueOf(animalType);
    }


}
