package JUnit.AssertMethodsWithAnnotations;

import JUnit.com.wipro.task.DailyTasks;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Q2TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        assertTrue(obj.checkPresence("Hello World", "World"));
        assertFalse(obj.checkPresence("Hello World", "Java"));
    }
}