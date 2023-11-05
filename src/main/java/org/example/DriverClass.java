package org.example;

// Author: Abass Chahin

// Main class to create combinations of the builders and the top, bottoms, and shoes
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