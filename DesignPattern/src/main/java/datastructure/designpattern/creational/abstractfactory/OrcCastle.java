package datastructure.designpattern.creational.abstractfactory;

public class OrcCastle implements Castle{
    static final String DESCRIPTION = "orc Castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
