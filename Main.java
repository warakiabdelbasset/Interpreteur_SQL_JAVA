import java.util.*;

public class Main {
    // String from = words[3
    // for (String word : words){
    // list.getid().equals(1)
    // }

    // Scanner sc = new Scanner(System.in); // System.in is a standard input stream

    public static void main(String[] args) {

        List<Person> p = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = sc.nextLine(); // reads string
        String[] words = a.split(" ");

        if (words[0].equals("insert") && words[1].equals("into") && words[2].equals("Person") && words[3].equals("(")
                && words[4].equals("id") && words[5].equals(",") && words[6].equals("name") && words[7].equals(",")
                && words[8].equals("age") && words[9].equals(")") && words[10].equals("values") && words[11].equals("(")
                && words[13].equals(",") && words[15].equals(",") && words[17].equals(")")) {

            p.add(new Person("1", "mohamed", "61"));
            p.add(new Person("2", "casillas", "44"));
            p.add(new Person(words[12], words[14], words[16]));
            System.out.println(p.size());
            for (Person e : p)
                e.AfficherValeur();
                System.out.println("DONE.....");
        } else {
            System.out.println("please enter the correct syntax");

        }

        // System.out.println(s.a());

    }
}