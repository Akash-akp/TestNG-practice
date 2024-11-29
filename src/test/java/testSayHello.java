import org.example.Hello;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testSayHello {
    Hello m = new Hello();
    @Parameters({"Hello"})
    @Test
    public void tstSayHello(@Optional(value="He") String expected){
        String result = m.sayHello();
        Assert.assertEquals(result,expected);
    }
}
