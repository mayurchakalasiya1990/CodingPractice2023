package datastructure.designpattern.creational.abstractfactory;

public class ElKing implements King{

    static final String DESCRIPTION = "Eleven King";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
