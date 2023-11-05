package org.example;

// Implements shoes interface which overrides the getInfo method to return information about professional shoes
public class ProfessionalShoes implements Shoes {

    @Override
    public String getInfo() {
        return "Professional Shoes";
    }
}
