package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.logging.Logger;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Vector2Test.class
})

public class RunAllTests {
    public static Logger LOGGER = Logger.getLogger("TestLogger");
}
