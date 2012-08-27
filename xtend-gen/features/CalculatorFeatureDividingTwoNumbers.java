package features;

import features.CalculatorFeatureBackground;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Dividing two numbers")
@SuppressWarnings("all")
public class CalculatorFeatureDividingTwoNumbers extends CalculatorFeatureBackground {
  @Test
  @Order(0)
  @Named("Given a calculator [PENDING]")
  public void givenACalculator() {
    super.givenACalculator();
  }
  
  @Test
  @Order(1)
  @Named("When entering two numbers \"15\" and \"5\" and pressing enter.")
  public void whenEnteringTwoNumbers15And5AndPressingEnter() {
      StepArguments _stepArguments = new StepArguments("15", "5");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      int _int = StringConversions.toInt(_first);
      String _second = JnarioIterableExtensions.<String>second(args);
      int _int_1 = StringConversions.toInt(_second);
      int _divide = calculator.divide(_int, _int_1);
      super.result = _divide;
  }
  
  @Test
  @Order(2)
  @Named("Then it prints \"2\"")
  public void thenItPrints2() {
      StepArguments _stepArguments = new StepArguments("2");
      final StepArguments args = _stepArguments;
      StepArguments _args = args;
      String _first = JnarioIterableExtensions.<String>first(_args);
      int _int = StringConversions.toInt(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(result), Integer.valueOf(_int));
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString() + "\n", _doubleArrow);
      
  }
}
