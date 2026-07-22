package JUnit.TestSuite;

import JUnit.AssertMethodsWithAnnotations.Q1TestSort;
import JUnit.AssertMethodsWithAnnotations.Q2TestCheckPresence;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        JUnit.com.wipro.test.TestStringConcat.class,
        Q1TestSort.class,
        Q2TestCheckPresence.class
})

public class Q3TestSuite {
}