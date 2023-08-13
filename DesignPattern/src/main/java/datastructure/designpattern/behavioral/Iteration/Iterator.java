package datastructure.designpattern.behavioral.Iteration;

public interface Iterator<T> {

    boolean hasNext();

    Vertex<T> getNext();

    void reset();
}
