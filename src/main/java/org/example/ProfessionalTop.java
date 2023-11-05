package org.example;

// Implements top interface which overrides the getInfo method to return information about professional tops
public class ProfessionalTop implements Top {

    @Override
    public String getInfo() {
        return "Professional Top";
    }
}
