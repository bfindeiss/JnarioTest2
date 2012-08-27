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
@Named("Operations on 2 lists")
public class ArrayListOperationsOn2ListsSpec extends ArrayListSpec {
  @Subject
  public ArrayList subject;
  
  ArrayList<String> anotherList;
  
  @Before
  public void before() throws Exception {
    this.subject.add("An Element");
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.anotherList = _arrayList;
  }
  
  @Test
  @Named("Joining two lists")
  @Order(99)
  public void joiningTwoLists() throws Exception {
    this.anotherList.add("Some other element");
    this.subject.addAll(this.anotherList);
    int _size = this.subject.size();
    boolean _should_be = Should.should_be(Integer.valueOf(_size), Integer.valueOf(2));
    Assert.assertTrue("\nExpected subject.size should be 2 but"
     + "\n     subject.size is " + new StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
    boolean _should_contain = Should.<String>should_contain(
      this.subject, "An Element");
    Assert.assertTrue("\nExpected subject should contain \"An Element\" but"
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_contain);
    
    boolean _should_contain_1 = Should.<String>should_contain(
      this.subject, "Some other element");
    Assert.assertTrue("\nExpected subject should contain \"Some other element\" but"
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_contain_1);
    
    int _size_1 = this.anotherList.size();
    boolean _should_be_1 = Should.should_be(Integer.valueOf(_size_1), Integer.valueOf(1));
    Assert.assertTrue("\nExpected anotherList.size should be 1 but"
     + "\n     anotherList.size is " + new StringDescription().appendValue(Integer.valueOf(_size_1)).toString()
     + "\n     anotherList is " + new StringDescription().appendValue(this.anotherList).toString() + "\n", _should_be_1);
    
    boolean _should_contain_2 = Should.<String>should_contain(
      this.anotherList, "Some other element");
    Assert.assertTrue("\nExpected anotherList should contain \"Some other element\" but"
     + "\n     anotherList is " + new StringDescription().appendValue(this.anotherList).toString() + "\n", _should_contain_2);
    
  }
}
