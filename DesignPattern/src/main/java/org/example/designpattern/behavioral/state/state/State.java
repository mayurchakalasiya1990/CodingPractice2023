package org.example.designpattern.behavioral.state.state;

import org.example.designpattern.behavioral.state.Phone;

public abstract class State{
    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onHome();

    public abstract String onOffOn();
}
