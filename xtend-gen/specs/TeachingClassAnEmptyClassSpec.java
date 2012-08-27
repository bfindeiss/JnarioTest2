package specs;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import specs.TeachingClassSpec;
import teaching.TeachingClass;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("An empty class")
public class TeachingClassAnEmptyClassSpec extends TeachingClassSpec {
  TeachingClass subject = new Function0<TeachingClass>() {
    public TeachingClass apply() {
      TeachingClass _teachingClass = new TeachingClass();
      return _teachingClass;
    }
  }.apply();
  
  @Test
  @Named("The class is empty")
  @Order(99)
  public void theClassIsEmpty() throws Exception {
    int _numberOfStudents = this.subject.numberOfStudents();
    boolean _should_be = Should.should_be(Integer.valueOf(_numberOfStudents), Integer.valueOf(0));
    Assert.assertTrue("\nExpected subject.numberOfStudents should be 0 but"
     + "\n     subject.numberOfStudents is " + new StringDescription().appendValue(Integer.valueOf(_numberOfStudents)).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Named("Students can\\\'t drop out of an empty class")
  @Order(99)
  public void studentsCanTDropOutOfAnEmptyClass() throws Exception {
    try{
      this.subject.dropsOut("someone");
      Assert.fail("Expected " + Exception.class.getName() + " in \n     subject.dropsOut(\"someone\")\n with:"
       + "\n     subject is " + new StringDescription().appendValue(this.subject).toString());
    }catch(Exception e){
      // expected
    }
  }
}
