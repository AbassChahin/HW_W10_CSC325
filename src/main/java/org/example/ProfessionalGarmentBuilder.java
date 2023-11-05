package org.example;

// Builder which implements garment builder but for professional combinations
public class ProfessionalGarmentBuilder implements GarmentBuilder {

    @Override
    public Shoes newShoes() {
        return new ProfessionalShoes();
    }

    @Override
    public Bottom newBottom() {
        return new ProfessionalBottom();
    }

    @Override
    public Top newTop() {
        return new ProfessionalTop();
    }
}
