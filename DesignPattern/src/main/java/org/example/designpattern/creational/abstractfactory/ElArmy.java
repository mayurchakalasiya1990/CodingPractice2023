package org.example.designpattern.creational.abstractfactory;

public class ElArmy implements Army{

    static final String DESCRIPTION = "Eleven Army";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
