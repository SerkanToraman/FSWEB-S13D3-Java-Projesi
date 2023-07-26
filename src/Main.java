import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Serkan","Toraman",38);
        System.out.println("Person first 3 instance variables-------");
        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Person to string ----------------------");
        person.cityLived = new String[3];
        person.cityLived[0]="Ankara";
        person.cityLived[1]="Istanbul";
        person.cityLived[2]="Shanghai";
        System.out.println("CityLived: "+Arrays.toString(person.cityLived));

        person.salary =30000;
        System.out.println(person);

        System.out.println("**********************************");
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("**********************************");
        Wall wall2 = new Wall(-5, -4);
        //wall2.width = -5;
        System.out.println("Wall2 width: " + wall2.width);
        System.out.println("Wall2 height: " + wall2.height);


    }
}