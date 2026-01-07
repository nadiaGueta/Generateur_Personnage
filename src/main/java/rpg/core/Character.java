package main.java.rpg.core;

import main.java.rpg.builder.CharacterBuilder;

public class Character {
    private String name;
    private int strength;
    private int agility;
    private int intelligence;


    public Character(CharacterBuilder builder) {
        this.name = builder.name;
        this.agility = builder.agility;
        this.strength = builder.strength;
        this.intelligence = builder.intelligence;


    }


    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public String getDescription() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }

    public int getPowerLevel() {
        return (strength * 3) + (agility * 2) + (intelligence * 2);

    }


}
