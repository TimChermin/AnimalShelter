package Shelter.Interfaces;

import Shelter.Enums.Gender;
import Shelter.Shelter;

public abstract interface Animal extends Sellable {
        Gender getGender();
        String toString();
}
