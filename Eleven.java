import java.util.ArrayList;

public class Eleven {
    public static void main(String[] args){
        ArrayList philosphers = new ArrayList();

        philosphers.add("Plato");
        philosphers.add("Socrates");
        philosphers.add("Karl Marx");
        philosphers.add("Aristotle");

        System.out.println(philosphers);

        philosphers.forEach(philu ->{
            System.out.println(philu);
        });
    }
}
