package features;

import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import teaching.TeachingClass;

@RunWith(FeatureRunner.class)
@Named("Scenario: Enrolling students in a class")
@SuppressWarnings("all")
public class WeWantToTestSomeBusinessLogicFeatureEnrollingStudentsInAClass {
  @Test
  @Order(0)
  @Named("Given When I start a new class")
  public void givenWhenIStartANewClass() {
      TeachingClass _teachingClass = new TeachingClass();
      this.subject = _teachingClass;
      this.student1 = "Anna";
      this.student2 = "Bernhard";
  }
  
  @Test
  @Order(1)
  @Named("When I enroll students in that class")
  public void whenIEnrollStudentsInThatClass() {
      subject.enroll(student1);
      subject.enroll(student2);
  }
  
  @Test
  @Order(2)
  @Named("Then those students must be stored successfully")
  public void thenThoseStudentsMustBeStoredSuccessfully() {
      int _numberOfStudents = subject.numberOfStudents();
      boolean _should_be = Should.should_be(Integer.valueOf(_numberOfStudents), Integer.valueOf(2));
      Assert.assertTrue("\nExpected subject.numberOfStudents should be 2 but"
       + "\n     subject.numberOfStudents is " + new StringDescription().appendValue(Integer.valueOf(_numberOfStudents)).toString()
       + "\n     subject is " + new StringDescription().appendValue(subject).toString() + "\n", _should_be);
      
      boolean _isEnrolled = subject.isEnrolled(student1);
      boolean _should_be_1 = Should.<Boolean>should_be(Boolean.valueOf(_isEnrolled), true);
      Assert.assertTrue("\nExpected subject.isEnrolled(student1) should be true but"
       + "\n     subject.isEnrolled(student1) is " + new StringDescription().appendValue(Boolean.valueOf(_isEnrolled)).toString()
       + "\n     subject is " + new StringDescription().appendValue(subject).toString()
       + "\n     student1 is " + new StringDescription().appendValue(student1).toString() + "\n", _should_be_1);
      
      boolean _isEnrolled_1 = subject.isEnrolled(student2);
      boolean _should_be_2 = Should.<Boolean>should_be(Boolean.valueOf(_isEnrolled_1), true);
      Assert.assertTrue("\nExpected subject.isEnrolled(student2) should be true but"
       + "\n     subject.isEnrolled(student2) is " + new StringDescription().appendValue(Boolean.valueOf(_isEnrolled_1)).toString()
       + "\n     subject is " + new StringDescription().appendValue(subject).toString()
       + "\n     student2 is " + new StringDescription().appendValue(student2).toString() + "\n", _should_be_2);
      
  }
  
  TeachingClass subject;
  
  String student1;
  
  String student2;
}
