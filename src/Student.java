public class Student extends Person{
    private double gpa;
    private String position;
    private final double stipend = 36660.00;

    public Student(){
        super();
    }
    public Student(String position,String name, String surname, double gpa){
        super(name,surname);
        this.gpa = gpa;
        this.position = position;
    }
    //Getters and setters
    @Override
    public String getPosition() {
        return position;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return getId() +": " + getPosition() +": "+ getName() + getSurname() + " earns "+ getPaymentAmount() + " tenge";
    }
    //Method to check GPA
    @Override
    public double getPaymentAmount(){
        if(gpa > 2.67){return stipend;}
        else{return 0.0;}
    }


}
