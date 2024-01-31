public class Employee extends Person{
    private double salary;
    private String position;
    //takes no-arg constructer of Person(id)
    public Employee(){super();}
    public Employee(String position,String name,String surname,double salary){
    super(name,surname);
    this.salary = salary;
    this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overridden toString method from the Person class
    // Provides a string representation specific for Employee objects
    @Override
    public String toString(){
        return  getId()+": " + getPosition() + ": " + getName() + getSurname() +"earns " +getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }


}
