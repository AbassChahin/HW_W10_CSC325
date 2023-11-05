package org.example;

// Implements top interface which overrides the getInfo method to return information about party tops
public class PartyTop implements Top {

    @Override
    public String getInfo() {
        return "Party Top";
    }
}
