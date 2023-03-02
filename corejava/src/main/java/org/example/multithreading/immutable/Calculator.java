package org.example.multithreading.immutable;


/*
Problem:
even if the Calculator class uses an immutable object internally, it is not itself immutable, and therefore not thread safe.
In other words: The ImmutableValue class is thread safe, but the use of it is not.
This is something to keep in mind when trying to achieve thread safety through immutability.

Solution:
To make the Calculator class thread safe you could have declared the getValue(), setValue(), and add() methods synchronized.
That would have done the trick.
 */
public class Calculator {

    private ImmutableValue currentValue = null;

    public ImmutableValue getValue(){
        return currentValue;
    }

    public void setValue(ImmutableValue newValue){
        this.currentValue = newValue;
    }

    public void add(int newValue){
        this.currentValue = this.currentValue.add(newValue);
        System.out.println("current value:"+this.currentValue.getValue()+ " by thread:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ImmutableValue var1=new ImmutableValue(10);
        Calculator calculator=new Calculator();
        calculator.setValue(var1);
        Runnable runnable1 = ()->{
            calculator.add(10);
        };

        Runnable runnable2 = ()->{
            calculator.add(20);
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }

}
