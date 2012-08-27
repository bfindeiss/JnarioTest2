package specs;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("The String \\\'Hello World\\\'")
public class TheStringHelloWorldSpec {
  @Test
  @Named("\\\"about Hello World\\\" => [ length should be 11 it should startWith \\\"Hello\\\" it should endWith \\\"World\\\" it should contain \\\"Wor\\\" ]")
  @Order(99)
  public void aboutHelloWorldLengthShouldBe11ItShouldStartWithHelloItShouldEndWithWorldItShouldContainWor() throws Exception {
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          int _length = it.length();
          boolean _should_be = Should.should_be(Integer.valueOf(_length), Integer.valueOf(11));
          Assert.assertTrue("\nExpected length should be 11 but"
           + "\n     length is " + new StringDescription().appendValue(Integer.valueOf(_length)).toString() + "\n", _should_be);
          
          boolean _should_startWith = Should.should_startWith(it, "Hello");
          Assert.assertTrue("\nExpected it should startWith \"Hello\" but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_startWith);
          
          boolean _should_endWith = Should.should_endWith(it, "World");
          Assert.assertTrue("\nExpected it should endWith \"World\" but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_endWith);
          
          boolean _should_contain = Should.should_contain(it, "Wor");
          Assert.assertTrue("\nExpected it should contain \"Wor\" but"
           + "\n     it is " + new StringDescription().appendValue(it).toString() + "\n", _should_contain);
          
        }
      };
    ObjectExtensions.<String>operator_doubleArrow("about Hello World", _function);
  }
}
