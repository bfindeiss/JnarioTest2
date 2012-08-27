package features;

import features.CalculatorFeatureAddingTwoNumbers;
import features.CalculatorFeatureDividingTwoNumbers;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ CalculatorFeatureAddingTwoNumbers.class, CalculatorFeatureDividingTwoNumbers.class })
@Named("Calculator")
@SuppressWarnings("all")
public class CalculatorFeature {
}
