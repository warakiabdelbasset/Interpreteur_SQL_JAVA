import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> p = new ArrayList<Person>();
        Scanner sc = new Scanner(System.in);
        p.add(new Person("1", "mohamed", "61"));
        p.add(new Person("3", "ddde", "485"));
        p.add(new Person("2", "casillas", "44"));

        String a ;
        do {
            System.out.print("Enter an SQL statement : ");
            a= sc.nextLine();
        
         // reads string
        String[] words = a.split(" ");
        
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
        ////////////////// select all ///////////////////////////////

        else if (words.length < 5 && words[0].equals("select") && words[1].equals("*") && words[2].equals("from")
        && words[3].equals("Person") ) {
            System.out.println(words.length);
            System.out.println(a.length());
            for (Person e : p) {
                e.AfficherValeur();
            }
        }


        ////////////////// select where ///////////////////////////////
        else if (words[0].equals("select") && words[1].equals("*") && words[2].equals("from")
                && words[3].equals("Person") && words[4].equals("where")) {
                    
            if (words[5].equals("id")) {
                if (words[6].equals("=")) {
                    for (Person e : p) {
                        if (e.getId().equals(words[7])) {
                            e.AfficherValeur();
                        }
                    }
                    System.out.println("DONE.....");
                } else if (words[6].equals(">")) {
                    for (Person e : p) {
                        int id = Integer.parseInt(words[7]);
                        int idE = Integer.parseInt(e.getId());
                        if (idE > id) {
                            e.AfficherValeur();
                        }
                    }
                    System.out.println("DONE.....");
                } else if (words[6].equals("<")) {
                    for (Person e : p) {
                        int id = Integer.parseInt(words[7]);
                        int idE = Integer.parseInt(e.getId());
                        if (idE < id) {
                            e.AfficherValeur();
                        }
                    }
                    System.out.println("DONE.....");
                }
            } else if (words[5].equals("name")) {
                if (words[6].equals("=")) {
                    for (Person e : p) {
                        if (e.getName().equals(words[7])) {
                            e.AfficherValeur();
                        }
                    }
                    System.out.println("DONE.....");
                }
            } else if (words[5].equals("age")) {
                if (words[6].equals("=")) {
                    for (Person e : p) {
                        if (e.getAge().equals(words[7])) {
                            e.AfficherValeur();
                        }
                    }
                    System.out.println("DONE.....");
                }
            } else {
                System.out.println("Please enter a valid request....");
            }

        }
        /////////////////// update one attribue //////////////////////////
        else if ( words.length < 11 && words[0].equals("update") && words[1].equals("Person") && words[2].equals("set")
                 && words[4].equals("=") 
                && words[6].equals("where") && words[7].equals("id")
                && words[8].equals("=")) {
                    System.out.println(words.length);
            for (Person e : p) {
                if (e.getId().equals(words[9])) {
                    if(words[3].equals("name")){
                        e.setName(words[5]);
                    }else if(words[3].equals("age")){
                        e.setAge(words[5]);
                    }                   
                }
                e.AfficherValeur();
            }

        }
        else if ( words.length > 11 && words[0].equals("update") && words[1].equals("Person") && words[2].equals("set")
                 && words[4].equals("=") 
                && words[7].equals("=") && words[9].equals("where")
                && words[10].equals("id")&& words[11].equals("=")) {
                    System.out.println(words.length);
                    
            for (Person e : p) {
                if (e.getId().equals(words[12])) {
                    if(words[3].equals("name")&&words[6].equals("age")){
                        e.setName(words[5]);
                        e.setAge(words[8]);
                    }else if(words[3].equals("age")&&words[6].equals("name")){
                        e.setName(words[8]);
                        e.setAge(words[5]);
                    }   
                                   
                }
                e.AfficherValeur();
            }

        } 
                ///////////// delete /////////////////////
        else if (words[0].equals("delete") && words[1].equals("from")&& words[2].equals("Person") && words[3].equals("where")
                 && words[5].equals("=")) { 
                    Iterator i = p.iterator();
                    Person str ;
                    while (i.hasNext()) {
                       str = (Person) i.next();
                       if(words[4].equals("id")){
                       if (str.getId().equals(words[6])) {
                          i.remove();
                          System.out.println("\nThe person with the id ' "+str.getId()+" ' is removed");
                          break;
                       }
                        }
                        if(words[4].equals("name")){
                            if (str.getName().equals(words[6])) {
                               i.remove();
                               System.out.println("\nThe person with the name ' "+str.getName()+" ' is removed");
                               break;
                            }
                             }
                             if(words[4].equals("age")){
                                if (str.getAge().equals(words[6])) {
                                   i.remove();
                                   System.out.println("\nThe person with the age : ' "+str.getAge()+" ' is removed");
                                   break;
                                }
                                 }
                    }
            for (Person e : p) {
                e.AfficherValeur();
            }
        }
        }while(!a.equals("exit"));
}
}