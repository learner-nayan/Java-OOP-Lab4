import java.util.Stack;

public class Nine {
    public static void main(String args[]){
        Stack youtubers = new Stack();

        System.out.println(youtubers.empty());

        youtubers.push("Hitesh Chaudhary");
        youtubers.push("CodeWithHarry");
        youtubers.push("Programming with Mosh");
        youtubers.push("Telusko");
        youtubers.push("Chai aur Code");

        System.out.println(youtubers.empty());

        System.out.println(youtubers);

        youtubers.push("Virat Kholi");
        System.out.println(youtubers);

        youtubers.pop();
        System.out.println(youtubers);

        System.out.println(youtubers.peek());

        System.out.println(youtubers.search("Telusko"));
    }
}
