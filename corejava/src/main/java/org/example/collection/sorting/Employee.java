package org.example.collection.sorting;

import lombok.Builder;
import lombok.Data;

import java.util.Comparator;

@Data
@Builder
public class Employee implements Comparable<Employee>{

    private String empFname;
    private String empLname;
    private String email;
    private int empId;

    @Override
    public int compareTo(Employee o) {
        int resutl = 0;
        if(this.empId > o.empId){
            resutl=1;
        }else if(this.empId < o.empId){
            resutl=-1;
        }
        return resutl;
    }

    static class EmployeeSortByLastname implements Comparator<org.example.collection.sorting.Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            int resutl = 0;
            if(o1.getEmpLname().compareTo(o2.getEmpLname())>0 ){
                resutl=1;
            }else if(o1.getEmpLname().compareTo(o2.getEmpLname())<0){
                resutl=-1;
            }
            return resutl;
        }
    }

    static class EmployeeSortByEmail implements Comparator<org.example.collection.sorting.Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            int resutl = 0;
            if(o1.getEmail().compareTo(o2.getEmail())>0 ){
                resutl=1;
            }else if(o1.getEmail().compareTo(o2.getEmail())<0){
                resutl=-1;
            }
            return resutl;
        }
    }
}

