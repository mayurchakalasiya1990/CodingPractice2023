package org.example.designpattern.creational.builder;

public class App {
    public static void main(String[] args) {
        var warrior = new Actor.Builder()
                .profession(Profession.WARRIOR)
                .hairColor(HairColor.BROWN)
                .hairType(HairType.LONG_CURLY)
                .armor(Armor.LEATHER)
                .weapon(Weapon.SWORD)
                .build();

        System.out.println(warrior);
    }
}
