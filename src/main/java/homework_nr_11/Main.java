package homework_nr_11;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alinka", "Selenkova", 25, "Software Engineering");
        Employee emp2 = new Employee("Johny", "Seems", 19, "Marketing");
        Employee emp3 = new Employee("Igor", "Vevk", 30, "Software Enginering");

        Hw11.testEmployee(emp1, Hw11.isSoftwareEngineer);
        Hw11.testEmployee(emp1, Hw11.isAdult);
        Hw11.testEmployee(emp1, Hw11.nameStartsWithA);

        Hw11.testEmployee(emp2, Hw11.isSoftwareEngineer);
        Hw11.testEmployee(emp2, Hw11.isAdult);
        Hw11.testEmployee(emp2, Hw11.nameStartsWithA);

        Hw11.testEmployee(emp3, Hw11.isSoftwareEngineer);
        Hw11.testEmployee(emp3, Hw11.isAdult);
        Hw11.testEmployee(emp3, Hw11.nameStartsWithA);
    }
}

