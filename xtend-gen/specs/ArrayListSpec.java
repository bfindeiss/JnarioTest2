package specs;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import specs.ArrayListOperationsOn2ListsSpec;
import specs.ArrayListOperationsOnAListOfSize0Spec;
import specs.ArrayListOperationsOnAListOfSize1Spec;

@Contains({ ArrayListOperationsOnAListOfSize0Spec.class, ArrayListOperationsOnAListOfSize1Spec.class, ArrayListOperationsOn2ListsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("ArrayList")
public class ArrayListSpec {
}
