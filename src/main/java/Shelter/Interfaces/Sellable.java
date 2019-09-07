package Shelter.Interfaces;

import java.text.DecimalFormat;

public interface Sellable {
public String productName = null;
public DecimalFormat productPrice = null;

String getProductName();
void setProductName(String productName);
DecimalFormat getProductPrice();
void setProductPrice(DecimalFormat productPrice);
}

