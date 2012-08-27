package teaching;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class TeachingClass {
  private ArrayList<String> enrolledStudents = new Function0<ArrayList<String>>() {
    public ArrayList<String> apply() {
      ArrayList<String> _arrayList = new ArrayList<String>();
      return _arrayList;
    }
  }.apply();
  
  public void enroll(final String student) {
    this.enrolledStudents.add(student);
  }
  
  public int numberOfStudents() {
    return this.enrolledStudents.size();
  }
  
  public boolean isEnrolled(final String student) {
    return this.enrolledStudents.contains(student);
  }
  
  public void dropsOut(final String student) {
    this.enrolledStudents.remove(student);
  }
}
