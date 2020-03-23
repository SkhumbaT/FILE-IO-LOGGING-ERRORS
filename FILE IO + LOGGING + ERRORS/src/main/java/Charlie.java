import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.io.FileNotFoundException;

public class Charlie  extends Visitor {
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Charlie.class.getName());

    public static String save(String name, String age, String date, String time, String questions_answered, String who_assisted) {
            final Logger logger = LogManager.getLogger(Charlie.class.getName());
            try {
                FileWriter Save = new FileWriter("visitor_charlie_sheen.txt", false);
                BufferedWriter bufferedWriter = new BufferedWriter(Save);
                bufferedWriter.write("Charlie Sheen");
                bufferedWriter.newLine();
                bufferedWriter.write("42");
                bufferedWriter.newLine();
                bufferedWriter.write("2020/01/12");
                bufferedWriter.newLine();
                bufferedWriter.write("13:02:29");
                bufferedWriter.newLine();
                bufferedWriter.write("Questions Answered");
                bufferedWriter.newLine();
                bufferedWriter.write("Thandiwe");
                bufferedWriter.close();
            } catch (IOException e) {
                logger.error("Could not write to file");
                System.out.println(e);
            }
            return "";
        }


    public static String load(String charlie) throws IOException, FileNotFoundException{
        try {
            FileReader load = new FileReader("visitor_charlie_sheen.txt");
            BufferedReader bufferedReader = new BufferedReader(load);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            load.close();
        } catch (FileNotFoundException e) {
            logger.error("Could not read from file");
            System.out.println(e);
        }
        return charlie;
    }
}