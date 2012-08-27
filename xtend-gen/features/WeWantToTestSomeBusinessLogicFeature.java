package features;

import features.WeWantToTestSomeBusinessLogicFeatureEnrollingStudentsInAClass;
import features.WeWantToTestSomeBusinessLogicFeatureStudentsDropOutOfAClass;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ WeWantToTestSomeBusinessLogicFeatureEnrollingStudentsInAClass.class, WeWantToTestSomeBusinessLogicFeatureStudentsDropOutOfAClass.class })
@Named("We want to test some business logic")
@SuppressWarnings("all")
public class WeWantToTestSomeBusinessLogicFeature {
}
