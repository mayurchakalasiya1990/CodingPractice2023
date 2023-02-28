package org.example.designpattern.creational.abstractfactory;

public class App {
    public static final Kingdom kingdom=new Kingdom();
    public static void main(String[] args) {
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }

    public static void createKingdom(Kingdom.FactoryMaker.KingdomType kingdomType){
        final KingdomFactory kingdomFactory= Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setArmy(kingdomFactory.createArmy());
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
    }
}

