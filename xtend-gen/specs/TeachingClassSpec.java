package specs;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import specs.TeachingClassAClassWith2EnrolledStudentsSpec;
import specs.TeachingClassAnEmptyClassSpec;

@Contains({ TeachingClassAnEmptyClassSpec.class, TeachingClassAClassWith2EnrolledStudentsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("TeachingClass")
public class TeachingClassSpec {
}
