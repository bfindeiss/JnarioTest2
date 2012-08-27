package specs;

import java.util.Stack;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Stack")
public class StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("subject.size should be 0")
  @Order(99)
  public void subjectSizeShouldBe0() throws Exception {
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size should be 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Increases in size when pushing an element")
  @Order(99)
  public void increasesInSizeWhenPushingAnElement() throws Exception {
    this.subject.push("A String");
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.size => 1 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
}
