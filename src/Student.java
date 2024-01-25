public class Student extends Person{
    private double gpa;
    private double Stipend = 36660.00;
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
        return getId() + getName() + getSurname() + getPaymentAmount();
    }
    @Override
    public double getPaymentAmount(){
        if(gpa > 2.67){return Stipend;}
        else{return 0;}
    }


}
