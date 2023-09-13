import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Employee{
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && salary == employee.salary && Objects.equals(name,employee.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name ,id ,salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class ImmutableCollectionExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ranjit", 100, 130000));
        employeeList.add(new Employee("Omkar", 100, 120000));
        employeeList.add(new Employee("Omkar", 100, 110000));
        employeeList.add(new Employee("Jayshree", 500, 300000));
        employeeList.add(new Employee("Ajit", 200, 120000));
        employeeList.add(new Employee("Nilam", 100, 100000));

        Employee RanjitEmp = new Employee("Ranjit", 100, 130000);

        //list.of method return immutable list
        // cannot be added or removed item of the list
        List<Employee> immutableList = List.of(
                RanjitEmp,
                new Employee("Omkar", 100, 120000),
                new Employee("Omkar", 100, 110000),
                new Employee("Jayshree", 100, 300000)
        );
        System.out.println(immutableList);
        RanjitEmp.id = 200; // this is allowed  because employee class is not immutable.
        System.out.println(immutableList);
        //        immutableList.set(1, new Employee("Ajit",302,230000)); replace is not allowed
//        immutableList.remove(0);//adding or removing is not allowed on immutable list
//        immutableList.add(new Employee("Ajit",200, 120000));//adding or removing is not allowed on immutable list

        // Example of arrays.aslist()
        Employee[] employees = new Employee[]{RanjitEmp,
                new Employee("Omkar", 100, 120000),
                new Employee("Ajit", 100, 110000),
                new Employee("Jayshree", 500, 300000)};
        List<Employee> employeeList1 = Arrays.asList(employees);//this returns list backed by each other
        //array changes are visible in the list
        //also list changes are visible in the array
        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("employeeList1 list : "+ employeeList1);
        employees[0].name = "Mayur";

        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("employeeList1 list : "+ employeeList1);
//        employeeList1.add(1, "Moin"); this is not allowed because array size is static and cannot updated.
//        employeeList1.remove(1);//not allowed
        employeeList1.set(0,new Employee("Varsha",1,100000));
        for (int i = 0; i < employees.length; i++) {
            System.out.print(" "+ employees[i].name);
        }
        System.out.println();
        System.out.println("String list : "+ employeeList1);
    }
}



