package datastructure.coreconcepts.clone;

import lombok.*;
@Setter
@Getter
@ToString
class Company{
    private String name;
    public Company(String name){
        this.name = name;
    }


}
/* by default Object’s clone() method provide Shallow
        copy.
*/

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeShallowCloning implements Cloneable{

    private String name;
    private int age;
    private Company company;
    public static void main(String[] args) throws CloneNotSupportedException {
        Company company1=new Company("ABC");
        EmployeeShallowCloning e1=new EmployeeShallowCloning("Mike",10,company1);
        System.out.println("Employee-1:"+e1);

        EmployeeShallowCloning e2 = (EmployeeShallowCloning)e1.clone();
        System.out.println("Employee-2 (Cloning):"+e2);
        e2.setName("Mayur");
        e2.setCompany(new Company("XYX"));
        System.out.println("Employee-1:"+e1);
        System.out.println("Employee-2:"+e2);
    }
}
