package specs;

import java.util.ArrayList;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import specs.ArrayListSpec;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Operations on a List of size 0")
public class ArrayListOperationsOnAListOfSize0Spec extends ArrayListSpec {
  @Subject
  public ArrayList subject;
  
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
  @Named("subject.empty should be true")
  @Order(99)
  public void subjectEmptyShouldBeTrue() throws Exception {
    boolean _isEmpty = this.subject.isEmpty();
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isEmpty), true);
    Assert.assertTrue("\nExpected subject.empty should be true but"
     + "\n     subject.empty is " + new StringDescription().appendValue(Boolean.valueOf(_isEmpty)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Removing element must throw Exception")
  @Order(99)
  public void removingElementMustThrowException() throws Exception {
    try{
      this.subject.remove(0);
      Assert.fail("Expected " + Exception.class.getName() + " in \n     subject.remove(0)\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(Exception e){
      // expected
    }
  }
  
  @Test
  @Named("Adding an element increases list size by 1")
  @Order(99)
  public void addingAnElementIncreasesListSizeBy1() throws Exception {
    this.subject.add("An Element");
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.size should be 1 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("After adding, an element can be found in the list")
  @Order(99)
  public void afterAddingAnElementCanBeFoundInTheList() throws Exception {
    final String element = "A random element";
    this.subject.add(element);
    boolean _contains = this.subject.contains(element);
    boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_contains), true);
    Assert.assertTrue("\nExpected subject.contains(element) should be true but"
     + "\n     subject.contains(element) is " + new StringDescription().appendValue(Boolean.valueOf(_contains)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     element is " + new StringDescription().appendValue(element).toString() + "\n", _should_be);
    
  }
}
