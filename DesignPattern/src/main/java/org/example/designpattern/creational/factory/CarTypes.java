package org.example.designpattern.creational.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum CarTypes {
    Ford(Ford::new),
    Ferrari(Ferrari::new);

    private final Supplier<Car> constructor;


}
