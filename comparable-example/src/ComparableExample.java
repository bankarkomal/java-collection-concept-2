import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class student implements Comparable<student>{
    String name;
    int id;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(student o) {
        return this.id - o.id;// grater than 1 or less than 1 or zero
    }
}


public class ComparableExample {
    public static void main(String[] args) {
        List<student> studentList = new ArrayList<>();

        studentList.add(new student("Ranjit" , 100));
        studentList.add(new student("Komal" , 101));
        studentList.add(new student("Omkar" , 102));
        studentList.add(new student("Mayur", 103));
        studentList.add(new student("Jayshree" , 104));

        System.out.println("Before sorting");
        studentList.forEach(System.out::println);
        Collections.sort(studentList);
        System.out.println("After sorting");
        studentList.forEach(System.out::println);


    }
}
