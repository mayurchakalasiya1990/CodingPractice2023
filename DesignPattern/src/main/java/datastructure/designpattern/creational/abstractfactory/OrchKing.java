package datastructure.designpattern.creational.abstractfactory;

public class OrchKing implements King{

    static final String DESCRIPTION = "orc King";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
