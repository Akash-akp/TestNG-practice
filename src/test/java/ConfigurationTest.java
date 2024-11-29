import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ConfigurationTest {
    @BeforeClass(description = "Before class (invokes once per class instance)")
    public void setUp() {
        System.out.println("Set some configuration for class");
    }
    @AfterClass(description = "After class (invokes once per class instance)")
    public void tearDown() {
        System.out.println("Return configuration back after all test methods");
    }
}