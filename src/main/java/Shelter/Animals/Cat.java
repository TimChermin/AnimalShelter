package Shelter.Animals;

import Shelter.Enums.Gender;
import Shelter.Interfaces.Animal;
import Shelter.Shelter;

public class Cat implements Animal {
    String name;
    Gender gender;
    String badHabit;
    public Cat(String name, String gender, String badHabit){
        this.name = name;
        this.gender = Gender.valueOf(gender);
        this.badHabit = badHabit;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getValue() {
        return 0;
    }

    public String getBadHabbit(){
        return badHabit;
    }

    public String toString() {
        return name + " " + gender + " cat " + badHabit;
    }

}
