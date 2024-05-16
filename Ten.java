import java.util.Hashtable;

public class Ten {
    public static void main(String[] args){
        Hashtable languages = new Hashtable();

        languages.put(100,"Java");
        languages.put(102,"Python");
        languages.put(120,"JS");
        languages.put(101,"PHP");

        System.out.println(languages);

        languages.forEach((key,lang) ->{
            System.out.println(lang);
        });
    }
}
