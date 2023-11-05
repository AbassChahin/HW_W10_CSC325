package org.example;

// Builder which implements garment builder but for casual combinations
public class CasualGarmentBuilder implements GarmentBuilder {

    @Override
    public Shoes newShoes() {
        return new CasualShoes();
    }

    @Override
    public Bottom newBottom() {
        return new CasualBottom();
    }

    @Override
    public Top newTop() {
        return new CasualTop();
    }
}
