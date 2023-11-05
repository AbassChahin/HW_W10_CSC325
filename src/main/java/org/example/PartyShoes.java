package org.example;

// Implements shoes interface which overrides the getInfo method to return information about party shoes
public class PartyShoes implements Shoes {

    @Override
    public String getInfo() {
        return "Party Shoes";
    }
}
