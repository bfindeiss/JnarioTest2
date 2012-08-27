package features;

import bl.Calculator2;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Background:")
@SuppressWarnings("all")
public class CalculatorFeatureBackground {
  @Test
  @Order(0)
  @Ignore
  @Named("Given a calculator [PENDING]")
  public void givenACalculator() {
    
  }
  
  Calculator2 calculator = new Function0<Calculator2>() {
    public Calculator2 apply() {
      Calculator2 _calculator2 = new Calculator2();
      return _calculator2;
    }
  }.apply();
  
  int result;
}
