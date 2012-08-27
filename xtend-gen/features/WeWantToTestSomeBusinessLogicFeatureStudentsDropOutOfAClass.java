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
@Named("Scenario: Students drop out of a class")
@SuppressWarnings("all")
public class WeWantToTestSomeBusinessLogicFeatureStudentsDropOutOfAClass {
  @Test
  @Order(0)
  @Named("Given  an existing class with 2 students")
  public void givenAnExistingClassWith2Students() {
      TeachingClass _teachingClass = new TeachingClass();
      this.subject = _teachingClass;
      this.student1 = "Anna";
      this.student2 = "Bernhard";
      subject.enroll(student1);
      subject.enroll(student2);
  }
  
  @Test
  @Order(1)
  @Named("When a student drops out of a class")
  public void whenAStudentDropsOutOfAClass() {
    subject.dropsOut(student2);
  }
  
  @Test
  @Order(2)
  @Named("Then the number of students must have decreased by 1")
  public void thenTheNumberOfStudentsMustHaveDecreasedBy1() {
    int _numberOfStudents = subject.numberOfStudents();
    boolean _should_be = Should.should_be(Integer.valueOf(_numberOfStudents), Integer.valueOf(1));
    Assert.assertTrue("\nExpected subject.numberOfStudents should be 1 but"
     + "\n     subject.numberOfStudents is " + new StringDescription().appendValue(Integer.valueOf(_numberOfStudents)).toString()
     + "\n     subject is " + new StringDescription().appendValue(subject).toString() + "\n", _should_be);
    
  }
  
  @Test
  @Order(3)
  @Named("And only student 1 is still enrolled in the class")
  public void andOnlyStudent1IsStillEnrolledInTheClass() {
      boolean _isEnrolled = subject.isEnrolled(student1);
      boolean _should_be = Should.<Boolean>should_be(Boolean.valueOf(_isEnrolled), true);
      Assert.assertTrue("\nExpected subject.isEnrolled(student1) should be true but"
       + "\n     subject.isEnrolled(student1) is " + new StringDescription().appendValue(Boolean.valueOf(_isEnrolled)).toString()
       + "\n     subject is " + new StringDescription().appendValue(subject).toString()
       + "\n     student1 is " + new StringDescription().appendValue(student1).toString() + "\n", _should_be);
      
      boolean _isEnrolled_1 = subject.isEnrolled(student2);
      boolean _should_be_1 = Should.<Boolean>should_be(Boolean.valueOf(_isEnrolled_1), false);
      Assert.assertTrue("\nExpected subject.isEnrolled(student2) should be false but"
       + "\n     subject.isEnrolled(student2) is " + new StringDescription().appendValue(Boolean.valueOf(_isEnrolled_1)).toString()
       + "\n     subject is " + new StringDescription().appendValue(subject).toString()
       + "\n     student2 is " + new StringDescription().appendValue(student2).toString() + "\n", _should_be_1);
      
  }
  
  TeachingClass subject;
  
  String student1;
  
  String student2;
}
