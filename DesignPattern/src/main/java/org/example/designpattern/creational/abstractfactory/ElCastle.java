package org.example.designpattern.creational.abstractfactory;

public class ElCastle implements Castle{

    static final String DESCRIPTION = "Eleven Castle";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
