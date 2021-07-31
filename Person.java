import java.util.*;

public class Person {
    String id;
    String name;
    String age;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return this.age;
    }

    public Person(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    static Scanner sc = new Scanner(System.in);

    public void AfficherValeur() {
        System.out.println("Person [id=" + id + ", age=" + age + ", name=" + name + "]");

    }

    public void saisirValeur(String i, String n, String a) {
        // System.out.print("Saisir le id: ");
        // id = sc.nextInt();
        // System.out.print("Saisir le nom: ");
        // name = sc.next();
        // System.out.print("Saisir le age: ");
        // age = sc.nextInt();
        id = i;
        name = n;
        age = a;
    }
}
