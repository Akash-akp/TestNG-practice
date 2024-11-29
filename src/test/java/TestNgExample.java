import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgExample extends ConfigurationTest {
    @Parameters({"first-name"})
    @Test
    public void testPrintFirstName(@Optional(value = "Bill") String firstName) {
        System.out.println("I got from parameters name: " + firstName);
    }
}
