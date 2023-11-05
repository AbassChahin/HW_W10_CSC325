package org.example;

// Implements Shoes interface which overrides the getInfo method to return information about casual shoes
public class CasualShoes implements Shoes {

    @Override
    public String getInfo() {
        return "Casual Shoes";
    }
}
