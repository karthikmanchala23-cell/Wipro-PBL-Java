package JUnit.com.wipro.test;

import JUnit.com.wipro.task.DailyTasks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {

        DailyTasks obj = new DailyTasks();

        String result = obj.doStringConcat("Hello", "World");

        assertEquals("Hello World", result);
    }
}