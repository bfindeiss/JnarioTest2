package specs;

import java.util.Stack;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import specs.StackSpec;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("with elements")
public class StackWithElementsSpec extends StackSpec {
  @Subject
  public Stack subject;
  
  @Before
  public void before() throws Exception {
    this.subject.add("an element");
  }
  
  @Test
  @Named("pop decreases size")
  @Order(99)
  public void popDecreasesSize() throws Exception {
    this.subject.pop();
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size => 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("pop removes last element")
  @Order(99)
  public void popRemovesLastElement() throws Exception {
    Object _pop = this.subject.pop();
    boolean _doubleArrow = Should.operator_doubleArrow(_pop, "an element");
    Assert.assertTrue("\nExpected subject.pop => \"an element\" but"
     + "\n     subject.pop is " + new StringDescription().appendValue(_pop).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
}
