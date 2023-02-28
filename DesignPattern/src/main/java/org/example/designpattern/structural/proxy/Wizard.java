package org.example.designpattern.structural.proxy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Wizard {

    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
