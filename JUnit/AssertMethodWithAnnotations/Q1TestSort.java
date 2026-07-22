package JUnit.AssertMethodsWithAnnotations;

import JUnit.com.wipro.task.DailyTasks;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Q1TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int[] input = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, obj.sortValues(input));
    }
}