import java.util.TreeSet;

public class Thirteen {
    public static void main(String[] args){
        TreeSet<Integer> percentage = new TreeSet<>();

        percentage.add(79);
        percentage.add(44);
        percentage.add(61);
        percentage.add(99);
        percentage.add(64);

        System.out.println(percentage);

        percentage.forEach(percent ->{
            System.out.println(percent);
        });
     }
}
