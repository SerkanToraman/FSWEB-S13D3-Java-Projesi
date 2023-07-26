import java.util.Arrays;

public class Person {

    String firstName;
    String lastName;
    int age;
    double salary;
    String[] cityLived;
    Boolean developer;

    //Constructors
    public Person(String firstName,String lastName, int age){
        this.firstName = firstName;
        this.lastName=lastName;
        this.age = age;

    }
    //Constructor Overloading
    public Person(String firstName,String lastName, int age, double salary, String[] cityLived,Boolean developer){
        this(firstName,lastName,age);
        this.salary = salary;
        this.cityLived=cityLived;
        this.developer=developer;
    }

    //Methods
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public boolean isTeen(){return age>=13 && age<=19;}

    @Override
    public String toString() {
        return String.format("Firstname: %s, Lastname: %s,Age: %d, salary: %.2f,cityLived: %s", firstName, lastName, age, salary, Arrays.toString(cityLived));
    }

}
