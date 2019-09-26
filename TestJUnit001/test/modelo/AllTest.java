
package modelo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
        {
            TestSumar.class, TestMultiplicar.class,
            TestDividir.class, TestRestar.class
        }
)
public class AllTest {}
