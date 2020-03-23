import java.io.IOException;

public class Visitor {
    public static void main (String[]args) throws IOException {
        Alice alice = new Alice();
        alice.save("Alice Cooper", "22","2018/11/11","15:22:12", "Questions Answered", "Thandiwe");
        alice.load("Alice");
System.out.println("");
        Charlie charlie = new Charlie();
        Charlie.save("Charlie Sheen", "42","2020/01/12","13:02:29", "Questions Answered","Thandiwe");
        charlie.load("Charlie");
System.out.println("");
        Bob bob = new Bob();
        Bob.save("Bob Marley", "12", "20;19/11/12","12:32:19", "Questions Answered", "Thandiwe");
        bob.load("Bob");
    }
}