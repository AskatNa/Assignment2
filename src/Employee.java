public class Employee extends Person{
    private String position;
    private double salary;
    //takes no-arg constructer of Person(id)
    public Employee(){super();}

    public Employee(String name, String surname, double salary){
    super(name,surname);
    this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return  getId()+": " + "Employee: " + getName() + getSurname() +"earns " +getPaymentAmount();
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }


}
