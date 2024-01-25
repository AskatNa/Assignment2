import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Person> person = new ArrayList<>();
    Employee employee1 = new Employee("Aset","Asetov","earns",25.000);
    Employee employee2 = new Employee("Luke","Sky","earns",25.000);

    Student student1 = new Student("ASka","NAr",3.40);
    Student student2 = new Student("AFK", "WASD",2.57);


    person.add(employee1);
    person.add(employee2);
    person.add(student1);
    person.add(student2);

    }
}
