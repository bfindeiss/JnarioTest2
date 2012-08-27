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
@Named("Scenario: Adding two numbers")
@SuppressWarnings("all")
public class CalculatorFeatureAddingTwoNumbers extends CalculatorFeatureBackground {
  @Test
  @Order(0)
  @Named("Given a calculator [PENDING]")
  public void givenACalculator() {
    super.givenACalculator();
  }
  
  @Test
  @Order(1)
  @Named("When adding two numbers \"5\" and \"6\".")
  public void whenAddingTwoNumbers5And6() {
      StepArguments _stepArguments = new StepArguments("5", "6");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      int _int = StringConversions.toInt(_first);
      String _second = JnarioIterableExtensions.<String>second(args);
      int _int_1 = StringConversions.toInt(_second);
      int _add = calculator.add(_int, _int_1);
      super.result = _add;
  }
  
  @Test
  @Order(2)
  @Named("Then it prints \"11\"")
  public void thenItPrints11() {
      StepArguments _stepArguments = new StepArguments("11");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      int _int = StringConversions.toInt(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(result), Integer.valueOf(_int));
      Assert.assertTrue("\nExpected result => args.first.toInt but"
       + "\n     result is " + new StringDescription().appendValue(Integer.valueOf(result)).toString()
       + "\n     args.first.toInt is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString()
       + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
       + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
      
  }
}
