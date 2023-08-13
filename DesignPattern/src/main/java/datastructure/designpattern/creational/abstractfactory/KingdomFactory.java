package datastructure.designpattern.creational.abstractfactory;

public interface KingdomFactory {
    Army createArmy();
    King createKing();
    Castle createCastle();
}
