package org.example;

// Author: Abass Chahin

// Main class to create combinations of the builders and the top, bottoms, and shoes
//I used the Abstract Factory Design for this assignment as it requires many different combinations
// while also allowing for new combinations in the future without having to completely re-do the whole code.
// Abstract Factory Design uses a lot of interfaces which I did the same for this assignment for Top, Bottom, and
// Shoes, and also for different family types and builders. This way we are using the pros of Abstract Factory Design
// of not hard coupling between concrete product and the code but instead allowing for flexibility in combinations of garments.
// I did initially want to use Builder Design Pattern but it was not realistic since it didn't allow for many different combinations.


public class DriverClass {
    public static void main(String[] args) {
        GarmentBuilder casualBuilder = new CasualGarmentBuilder();
        GarmentBuilder partyBuilder = new PartyGarmentBuilder();
        GarmentBuilder professionalBuilder = new ProfessionalGarmentBuilder();

        Top casualTop = casualBuilder.newTop();
        Bottom casualBottom = casualBuilder.newBottom();
        Shoes casualShoes = casualBuilder.newShoes();

        System.out.println("Casual Build:\n" + casualTop.getInfo() + "\n" + casualBottom.getInfo() + "\n" + casualShoes.getInfo());

        Top partyTop = partyBuilder.newTop();
        Bottom partyBottom = partyBuilder.newBottom();
        Shoes partyShoes = partyBuilder.newShoes();

        System.out.println("\nParty Build:\n" + partyTop.getInfo() + "\n" + partyBottom.getInfo() + "\n" + partyShoes.getInfo());

        Top professionalTop = professionalBuilder.newTop();
        Bottom professionalBottom = professionalBuilder.newBottom();
        Shoes professionalShoes = professionalBuilder.newShoes();

        System.out.println("\nProfessional Build:\n" + professionalTop.getInfo() + "\n" + professionalBottom.getInfo() + "\n" + professionalShoes.getInfo());
    }
}