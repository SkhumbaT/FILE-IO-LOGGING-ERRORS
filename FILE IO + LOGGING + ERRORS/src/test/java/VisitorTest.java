import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class VisitorTest {
@Test
    public void save()throws IOException{
    Assert.requireNonEmpty(
            true, Charlie.save("Charlie Sheen", "42", "2020/01/12", "13:02:29", "Questions Answered", "Thandiwe"));


    Assert.requireNonEmpty(
            true, Alice.save("Alice Cooper", "22","2018/11/11","15:22:12", "Questions Answered", "Thandiwe"));


    Assert.requireNonEmpty(
            true, Bob.save("Bob Marley", "12", "2019/11/12","12:32:19", "Questions Answered", "Thandiwe"));
}
@Test
    public void load ()throws IOException{
    Assert.requireNonEmpty(
            true, Charlie.load("Charlie"));

    Assert.requireNonEmpty(
            true, Alice.load("Alice"));

    Assert.requireNonEmpty(
            true, Bob.load("Bob"));
}
}
