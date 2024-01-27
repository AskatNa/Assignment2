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
        return "Employee";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return  getId()+": " + getPosition() + ": " + getName() + getSurname() +"earns " +getPaymentAmount();
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }


}
