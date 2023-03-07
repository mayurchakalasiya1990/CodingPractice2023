package org.example.designpattern.creational.abstractfactory;

public class ElKingdomFactory implements KingdomFactory{
    @Override
    public Army createArmy() {
        return new ElArmy();
    }

    @Override
    public King createKing() {
        return new ElKing();
    }

    @Override
    public Castle createCastle() {
        return new ElCastle();
    }
}
