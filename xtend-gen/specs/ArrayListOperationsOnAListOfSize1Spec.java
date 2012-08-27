package specs;

import java.util.ArrayList;
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
import specs.ArrayListSpec;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Operations on a List of size 1")
public class ArrayListOperationsOnAListOfSize1Spec extends ArrayListSpec {
  @Subject
  public ArrayList subject;
  
  @Before
  public void before() throws Exception {
    this.subject.add("An Element");
  }
  
  @Test
  @Named("subject.size should be 1")
  @Order(99)
  public void subjectSizeShouldBe1() throws Exception {
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.size should be 1 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Adding another element increases list size to 2")
  @Order(99)
  public void addingAnotherElementIncreasesListSizeTo2() throws Exception {
    this.subject.add("Another Element");
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(2));
    Assert.assertTrue("\nExpected subject.size should be 2 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Removing element must be successful")
  @Order(99)
  public void removingElementMustBeSuccessful() throws Exception {
    this.subject.remove(0);
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.size should be 0 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
}
