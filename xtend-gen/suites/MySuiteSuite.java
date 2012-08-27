package suites;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import suites.MyFeaturesSuite;
import suites.MySpecsSuite;

@RunWith(ExampleGroupRunner.class)
@Named("My Suite")
@Contains({ MyFeaturesSuite.class, MySpecsSuite.class })
@SuppressWarnings("all")
public class MySuiteSuite {
}
