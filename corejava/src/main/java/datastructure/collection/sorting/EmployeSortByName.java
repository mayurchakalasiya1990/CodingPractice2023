package datastructure.collection.sorting;

import java.util.Comparator;

public class EmployeSortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int resutl = 0;
        if(o1.getEmpFname().compareTo(o2.getEmpFname())>0 ){
            resutl=1;
        }else if(o1.getEmpFname().compareTo(o2.getEmpFname())<0){
            resutl=-1;
        }
        return resutl;
    }
}
