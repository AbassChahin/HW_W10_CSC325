package org.example;

// Interface which requires methods to create new shoes, tops, and bottoms
public interface GarmentBuilder {
    Shoes newShoes();
    Top newTop();
    Bottom newBottom();
}
