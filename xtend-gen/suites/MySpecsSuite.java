package suites;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import specs.StackSpec;

@RunWith(ExampleGroupRunner.class)
@Named("My Specs")
@Contains(StackSpec.class)
@SuppressWarnings("all")
public class MySpecsSuite {
}
