package org.example;

// Implements top interface which overrides the getInfo method to return information about casual tops
public class CasualTop implements Top {

    @Override
    public String getInfo() {
        return "Casual Top";
    }
}
