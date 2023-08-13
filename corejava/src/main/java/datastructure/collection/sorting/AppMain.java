package datastructure.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        Employee emp1= Employee.builder()
                .empId(1)
                .empFname("Mayur")
                .empLname("chakalasiya")
                .email("15mayur.chakalasiya@gmail.com")
                .build();
        Employee emp2= Employee.builder()
                .empId(2)
                .empFname("Nilesh")
                .empLname("chakalasiya")
                .email("12nilesh.chakalasiya@gmail.com")
                .build();
        Employee emp3= Employee.builder()
                .empId(3)
                .empFname("Dipu")
                .empLname("chakalasiya")
                .email("11dipu.chakalasiya@gmail.com")
                .build();
        Employee emp4= Employee.builder()
                .empId(4)
                .empFname("Kalyani")
                .empLname("chakalasiya")
                .email("17kalyani.chakalasiya@gmail.com")
                .build();

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(emp4);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp1);
        System.out.println("Before Sort:");
        employeeList.forEach(emp -> System.out.println(emp.getEmpId()+" | " + emp.getEmpFname() +" | "+emp.getEmpLname()));
        //Collections.sort(employeeList, new EmployeSortByName());
        //Collections.sort(employeeList);
        //employeeList.sort(new EmployeSortByName());
        Collections.sort(employeeList, new Employee.EmployeeSortByEmail());
        System.out.println("After Sort:");
        employeeList.forEach(emp -> System.out.println(emp.getEmpId()+" | " + emp.getEmpFname() +" | "+emp.getEmpLname()));

    }
}
