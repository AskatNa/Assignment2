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
        //this.position = position;
    }

    @Override
    public String getPosition() {
        return "Student";
    }
    //@Override
   //public String getPosition() {return super.getPosition();}

    //@Override
    //public void setPosition(String position) {super.setPosition(position);}

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return getId() +": " + getPosition() +": "+ getName() + getSurname() +" Gpa:"+ getGpa() +" earns "+ getPaymentAmount();
    }
    @Override
    public double getPaymentAmount(){
        if(gpa > 2.67){return stipend;}
        else{return 0.0;}
    }


}
