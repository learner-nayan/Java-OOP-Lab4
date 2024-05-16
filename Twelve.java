import java.util.LinkedList;

public class Twelve {
    public static void main(String[] args){
        LinkedList politicalIdeologies = new LinkedList();

        politicalIdeologies.add("Communism");
        politicalIdeologies.add("Liberalism");
        politicalIdeologies.add("Socialism");
        politicalIdeologies.add("Anarchism");
        politicalIdeologies.add("Fascism");
        politicalIdeologies.add("Prachanda Path");

        System.out.println(politicalIdeologies);

        politicalIdeologies.forEach(ideology ->{
            System.out.println(ideology);
        });
    }
}
