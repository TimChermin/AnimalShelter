package Shelter.Animals;

import Shelter.Enums.Gender;
import Shelter.Interfaces.Animal;
import Shelter.Shelter;

import java.text.DecimalFormat;

public class Cat implements Animal {
    private String name;
    private Gender gender;
    private String badHabit;
    private double productPrice;
    public Cat(String name, String gender, String badHabit){
        this.name = name;
        this.gender = Gender.valueOf(gender);
        this.badHabit = badHabit;
        calculatePrice(badHabit);
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
        return name + " " + gender + " cat " + badHabit + " €" + productPrice;
    }


    @Override
    public Double getProductPrice() {
        return productPrice;
    }

    private void calculatePrice(String badHabit){
        double length = badHabit.length();
        productPrice = (350 - (20 * length));
        if (productPrice < 35){
            productPrice = 35;
        }
        //maxprice cat €350 for every char in badhabbit min €20 never cheaper than €35
    }
}
