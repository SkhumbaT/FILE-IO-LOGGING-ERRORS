import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.io.FileNotFoundException;

public class Bob  extends Visitor {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Bob.class.getName());

    public static String save(String name, String age, String date, String time, String questions_answered, String who_assisted) {
        final Logger logger = LogManager.getLogger(Bob.class.getName());
        try {
            FileWriter Save = new FileWriter("visitor_bob_marley.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(Save);
            bufferedWriter.write("Bob Marley");
            bufferedWriter.newLine();
            bufferedWriter.write("12");
            bufferedWriter.newLine();
            bufferedWriter.write("2019/11/12");
            bufferedWriter.newLine();
            bufferedWriter.write("12:32:19");
            bufferedWriter.newLine();
            bufferedWriter.write("Questions Answered");
            bufferedWriter.newLine();
            bufferedWriter.write("Thandiwe");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error occured");
            logger.error ("Could not write to file");
            System.out.println(e);
        }
    return "";
}

    public static String load(String bob) throws IOException, FileNotFoundException {
           final Logger logger = LogManager.getLogger(Bob.class.getName());
           try {
               FileReader load = new FileReader("visitor_bob_marley.txt");
               BufferedReader bufferedReader = new BufferedReader(load);
               String line;
               while ((line = bufferedReader.readLine()) != null) {
                  System.out.println(line);
               }
               load.close();
          } catch (FileNotFoundException e) {
            logger.error ("Could not read from file");
            System.out.println(e);
          }
          return bob;
    }
}