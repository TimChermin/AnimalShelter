package Shelter.Interfaces;

import Shelter.Enums.Gender;
import Shelter.Shelter;

public abstract interface Animal {
        String getName();
        Gender getGender();
        String toString();
        int getValue();
}
