package specs;

import java.util.EmptyStackException;
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
import specs.StackSpec;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("when empty")
public class StackWhenEmptySpec extends StackSpec {
  @Subject
  public Stack subject;
  
  @Test
  @Named("subject.size => 0")
  @Order(99)
  public void subjectSize0() throws Exception {
    int _size = this.subject.size();
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size => 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("subject.pop throws EmptyStackException")
  @Order(99)
  public void subjectPopThrowsEmptyStackException() throws Exception {
    try{
      this.subject.pop();
      Assert.fail("Expected " + EmptyStackException.class.getName() + " in \n     subject.pop\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(EmptyStackException e){
      // expected
    }
  }
}
