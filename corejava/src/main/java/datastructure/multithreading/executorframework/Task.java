package datastructure.multithreading.executorframework;

import lombok.AllArgsConstructor;

import java.security.InvalidParameterException;
import java.util.concurrent.Callable;
@AllArgsConstructor
public class Task implements Callable<Integer> {

    private int num;
    @Override
    public Integer call() throws Exception {
        if(num<0){
            throw new InvalidParameterException("Negative number not allowed.");
        }

        return num;
    }
}
