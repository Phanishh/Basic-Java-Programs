import java.util.Objects;

public class student
{
    String name;
    int rollno;

    public student(String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String  toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }
}
