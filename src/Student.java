public class Student extends Person{
    private double gpa;
    private final double stipend = 36660.00;
    public Student(){
        super();
    }
    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa = gpa;

    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return getId() +": " +"Student: " + getName() + getSurname() +" Gpa:"+ getGpa() +" earns "+ getPaymentAmount();
    }
    @Override
    public double getPaymentAmount(){
        if(gpa > 2.67){return stipend;}
        else{return 0.0;}
    }


}
