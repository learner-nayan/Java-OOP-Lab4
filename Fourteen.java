import java.util.HashMap;

public class Fourteen {
    public static void main(String[] args){
        HashMap<String,String> leaders = new HashMap<String,String>();

        leaders.put("Nepali Congress","Sher Bahadud deuba");
        leaders.put("CPN UML","KP Sharma Oli");
        leaders.put("CPN Maoist Center","Puspa Kamal Dahal(Prachanda)");
        leaders.put("Democratic Party","Joe Biden");
        leaders.put("Republican Party","Donald Trump");

        System.out.println(leaders);

        leaders.forEach((party, president) ->{
            System.out.println(party +": "+ president);
        });
    }
}
