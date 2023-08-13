package datastructure.externalization;

import lombok.*;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
public class Student extends Department implements Externalizable {
    private int studentId;
    private String studentName;
    private int age;

    public Student() {
        System.out.println("No arg Constructor of Student class call");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(getDeptId());
        out.writeUTF(getDeptName());
        out.writeInt(studentId);
        out.writeUTF(getStudentName());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setDeptId(in.readInt());
        setDeptName(in.readUTF());
        setStudentId(in.readInt());
        setStudentName(in.readUTF());
    }
}
