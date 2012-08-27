package suites;

import features.CalculatorFeature;
import features.JnarioIntroductionFeature;
import features.WeWantToTestSomeBusinessLogicFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("My Features")
@Contains({ WeWantToTestSomeBusinessLogicFeature.class, CalculatorFeature.class, JnarioIntroductionFeature.class })
@SuppressWarnings("all")
public class MyFeaturesSuite {
}
