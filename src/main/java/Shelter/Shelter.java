package Shelter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shelter {

    private List<Reservation> reservations = new ArrayList<Reservation>();

    public List<Reservation> getReservations(){
        return reservations;
    }

    public void addReservation(String animalName, String animalGender, String animalType, String badHabit, String reservatorName){
        reservations.add(new Reservation(animalName, animalType, animalGender, badHabit, reservatorName, LocalDateTime.now()));
    }

    //public List<Shelter.Interfaces.Animal> Animals { get; private set; } = new List<Shelter.Interfaces.Animal>();
}
