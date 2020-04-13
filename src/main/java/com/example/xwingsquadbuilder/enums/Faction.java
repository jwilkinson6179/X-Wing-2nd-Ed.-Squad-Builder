package com.example.xwingsquadbuilder.enums;

public enum Faction
{
    REBEL("Rebel"),
    EMPIRE("Imperial"),
    SCUM("Scum And Villainy"),
    FIRST_ORDER("First Order"),
    RESISTANCE("Resistance"),
    REPUBLIC("Galactic Republic"),
    SEPARATIST("Separatist Alliance");

    private final String factionName;

    private Faction(String factionName)
    {
        this.factionName = factionName;
    }

    @Override
    public String toString() {
        return factionName;
    }
}
