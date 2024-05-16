import java.util.TreeMap;

public class Fifteen {
    public static void main(String[] args){
        TreeMap falacies = new TreeMap();

        falacies.put(11,"Ad hominem falacy");
        falacies.put(12,"Red herring falacy");
        falacies.put(13,"Straw man falacy");
        falacies.put(14,"Slippery slope falacy");
        falacies.put(15,"Apeal to authority falacy");
        falacies.put(16,"Psychologists falacy");
        falacies.put(17,"Tone polishing falacy");

        System.out.println(falacies);

        falacies.forEach((key, falacy) ->{
            System.out.println(falacy);
        });
    }
}
