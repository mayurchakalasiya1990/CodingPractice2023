package datastructure.coreconcepts;


class Parent{
    String x = " Parent's X";
    public void display(){
        System.out.println("x:"+x);
    }
}
public class VariableHiddingExample extends Parent{

    String x = " Child's X";


/*
    Variable Hiding : When the child and parent classes both have a variable with the same name,
    the child class variable hides the parent class variable.
 */
    @Override
    public void display(){
        System.out.println("x:"+x);
    }

    public static void main(String[] args) {
        Parent obj=new VariableHiddingExample();
        obj.display();

    }
}
