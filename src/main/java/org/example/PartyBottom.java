package org.example;

// Implements bottom interface which overrides the getInfo method to return information about party bottoms
public class PartyBottom implements Bottom {

    @Override
    public String getInfo() {
        return "Party Pants";
    }
}
