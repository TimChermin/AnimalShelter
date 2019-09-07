package Shelter.Animals;

import Shelter.Enums.Gender;
import Shelter.Interfaces.Animal;
import Shelter.Shelter;

import java.text.DecimalFormat;

public class Dog implements Animal {
    String name;
    Gender gender;
    Double productPrice;
    public Dog(String name, String gender, int dogCount){
        this.name = name;
        this.gender = Gender.valueOf(gender);
        productPrice = 500.0;
        calculatePrice(dogCount);
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
        return name + " " + gender + " dog " + productPrice;
    }


    @Override
    public Double getProductPrice() {
        return productPrice;
    }

    private void calculatePrice(int dogCount){
        for(int i=0; i<dogCount; i++){
            productPrice -= 50;
        }
        if (productPrice < 50){
            productPrice = 50.0;
        }
        //first dog in = €500 every dog after = min €50
        //never cheaper than €50 
    }

}
