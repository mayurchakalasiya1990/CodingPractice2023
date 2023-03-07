package org.example.coreconcepts.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
class Company1 implements Cloneable{
    private String name;
    public Company1(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

@Setter
@Getter
@ToString
@AllArgsConstructor
public class EmployeeDeepCloning implements Cloneable{

    private String name;
    private int age;
    private Company1 company;

    public Object clone() throws CloneNotSupportedException {
        EmployeeDeepCloning deepCloning= (EmployeeDeepCloning)super.clone();
        deepCloning.setCompany((Company1)company.clone());
        return deepCloning;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeDeepCloning emp=new EmployeeDeepCloning("Mayur",100, new Company1("ACX"));
        System.out.println("Employee-1:"+emp);
        EmployeeDeepCloning emp2= (EmployeeDeepCloning) emp.clone();
        System.out.println("Employee-2:"+emp2);
        System.out.println("-".repeat(70));
        emp2.setCompany(new Company1("XYZ"));
        System.out.println("Employee-1:"+emp);
        System.out.println("Employee-2:"+emp2);
    }

}
