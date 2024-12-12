package homework_nr_11;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private String department;

    public Employee(String name, String surname, int age, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
