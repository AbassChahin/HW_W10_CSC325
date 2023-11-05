package org.example;

// Builder which implements garment builder but for party combinations
public class PartyGarmentBuilder implements GarmentBuilder {

    @Override
    public Shoes newShoes() {
        return new PartyShoes();
    }

    @Override
    public Bottom newBottom() {
        return new PartyBottom();
    }

    @Override
    public Top newTop() {
        return new PartyTop();
    }
}
