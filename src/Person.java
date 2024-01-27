public class Person implements Comparable<Person>, Payable{
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;
    //No-argument constructer to get a unique id for each Person
    public Person(){
        id = id_gen++;
    }
    //Constructer with parametres name, surname. this(); calls no-arg constructer(which is initialize id)
    public Person(String name,String surname){
        this();
        setName(name);
        setSurname(surname);
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        return  "id: " + id +" name: " + name +" surname: " + surname;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }


}
