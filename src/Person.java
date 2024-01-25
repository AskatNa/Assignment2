public class Person implements Payable{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    public Person(){
        id = id_gen++;
    }
    public Person(String name,String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return  id  + name + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

}
