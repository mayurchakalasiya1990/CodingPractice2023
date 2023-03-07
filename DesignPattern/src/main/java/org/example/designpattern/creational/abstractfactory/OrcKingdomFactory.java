package org.example.designpattern.creational.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory{
    @Override
    public Army createArmy() {
        return new OrcArmy();
    }

    @Override
    public King createKing() {
        return new OrchKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }
}
