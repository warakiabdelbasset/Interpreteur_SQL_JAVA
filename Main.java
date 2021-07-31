import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> p = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = sc.nextLine(); // reads string
        String[] words = a.split(" ");
        p.add(new Person("1", "mohamed", "61"));
        p.add(new Person("3", "ddde", "485"));
        p.add(new Person("2", "casillas", "44"));
        //////////////////// insert //////////////////////////////
        if (words[0].equals("insert") && words[1].equals("into") && words[2].equals("Person") && words[3].equals("(")
                && words[4].equals("id") && words[5].equals(",") && words[6].equals("name") && words[7].equals(",")
                && words[8].equals("age") && words[9].equals(")") && words[10].equals("values") && words[11].equals("(")
                && words[13].equals(",") && words[15].equals(",") && words[17].equals(")")) {

            p.add(new Person(words[12], words[14], words[16]));
            for (Person e : p)
                e.AfficherValeur();
            System.out.println("DONE.....");
        } 
        ////////////////// select ///////////////////////////////
        else if (words[0].equals("select") && words[1].equals("*") && words[2].equals("from")
                && words[3].equals("Person") && words[4].equals("where")
                ) {
                if(words[5].equals("id")){
                    if(words[6].equals("=")){
                        for (Person e : p) {
                            if (e.getId().equals(words[7])) {
                                e.AfficherValeur();
                            }      
                        }
                        System.out.println("DONE.....");    
                    }else if(words[6].equals(">")){                       
                        for (Person e : p) {
                            int id = Integer.parseInt(words[7]);
                            int idE = Integer.parseInt(e.getId());
                            if (idE > id) {
                                e.AfficherValeur();
                            }           
                        }
                        System.out.println("DONE....."); 
                    }else if(words[6].equals("<")){                        
                        for (Person e : p) {
                            int id = Integer.parseInt(words[7]);
                            int idE = Integer.parseInt(e.getId());
                            if (idE < id) {
                                e.AfficherValeur();
                            }   
                        }
                        System.out.println("DONE.....");        
                    }
                }
                else if(words[5].equals("name")){
                    if(words[6].equals("=")){
                        for (Person e : p) {
                            if (e.getName().equals(words[7])) {
                                e.AfficherValeur();
                            }                                    
                        }
                        System.out.println("DONE....."); 
                    }
                }
                else if(words[5].equals("age")){
                    if(words[6].equals("=")){
                        for (Person e : p) {
                            if (e.getAge().equals(words[7])) {
                                e.AfficherValeur();
                            }       
                        }
                        System.out.println("DONE.....");   
                    }
                }
                else{
                    System.out.println("Please enter a valid request....");
                }

        }
        /////////////////// update //////////////////////////
        else if (words[0].equals("update") && words[1].equals("Person") && words[2].equals("set")
                && words[3].equals("name") && words[4].equals("=") && words[6].equals(",") && words[7].equals("age")
                && words[8].equals("=") && words[10].equals("where") && words[11].equals("id")
                && words[12].equals("=")) {

            for (Person e : p) {

                if (e.getId().equals(words[13])) {
                    e.setName(words[5]);
                    e.setAge(words[9]);
                }
                e.AfficherValeur();

            }

        } 
        ///////////////////// delete /////////////////////
        else if (words[0].equals("delete") && words[1].equals("from") && words[3].equals("where")
                && words[4].equals("id") && words[5].equals("=")) {

            for (Person e : p) {

                if (e.getId().equals(words[6])) {
                    p.remove(e);

                }
                e.AfficherValeur();
            }
        }
    }
}