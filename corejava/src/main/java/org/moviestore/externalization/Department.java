package org.example.externalization;

import lombok.*;

@Getter
@Setter
@ToString

public class Department {
    private int deptId;
    private String deptName;
    private int capacity;

    public Department(){
        System.out.println("No arg Constructor of Department class call");
    }
}
