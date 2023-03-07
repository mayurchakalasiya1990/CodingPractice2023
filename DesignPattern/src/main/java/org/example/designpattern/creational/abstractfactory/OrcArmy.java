package org.example.designpattern.creational.abstractfactory;

public class OrcArmy implements Army{


    static final String DESCRIPTION = "orc Army";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
