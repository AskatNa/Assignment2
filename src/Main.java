import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Employee","Aset ","Asetov ",25000.15);
        Employee employee2 = new Employee("Employee","Sky ", "Skyev ", 500000.0);

        Student student1 = new Student("Student","Aska ", "Nar", 3.40);
        Student student2 = new Student("Student", "Aer ", "Someone", 2.57);
        ArrayList<Person> person = new ArrayList<>();

        person.add(employee1);
        person.add(employee2);
        person.add(student1);
        person.add(student2);

        Collections.sort(person);

        printData(person);
    }
    public static void printData(Iterable<Person> person) {
        for (Person persons: person) {
            System.out.println(persons);
        }
    }
}
