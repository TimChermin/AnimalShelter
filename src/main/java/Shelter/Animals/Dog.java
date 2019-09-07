package Shelter.Animals;

import Shelter.Enums.Gender;
import Shelter.Interfaces.Animal;
import Shelter.Shelter;

import java.text.DecimalFormat;

public class Dog implements Animal {
    String name;
    Gender gender;
    public Dog(String name, String gender){
        this.name = name;
        this.gender = Gender.valueOf(gender);
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
        return name + " " + gender + " dog";
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
