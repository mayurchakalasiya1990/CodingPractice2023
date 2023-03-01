package org.example.designpattern.behavioral.Iteration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedList;
import java.util.List;

@Data
@Setter
@Getter
public class Vertex<T> {

    private final T data;

    private boolean visited;


    private List<Vertex<T>> neighbors = new LinkedList<>();
}
