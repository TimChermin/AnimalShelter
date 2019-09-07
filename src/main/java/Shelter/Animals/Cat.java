package Shelter.Animals;

import Shelter.Enums.Gender;
import Shelter.Interfaces.Animal;
import Shelter.Shelter;

import java.text.DecimalFormat;

public class Cat implements Animal {
    private String name;
    private Gender gender;
    private String badHabit;
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

    public String toString() {
        return name + " " + gender + " cat " + badHabit;
    }

    @Override
    public String getProductName() {
        return null;
    }

    @Override
    public void setProductName(String productName) {

    }

    @Override
    public DecimalFormat getProductPrice() {
        return null;
    }

    @Override
    public void setProductPrice(DecimalFormat productPrice) {

    }
}
