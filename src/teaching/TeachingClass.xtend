package teaching

import java.util.ArrayList

class TeachingClass {
	
	
	ArrayList<String> enrolledStudents = new ArrayList<String>

	def void enroll(String student) { 
		enrolledStudents.add(student)
	}
	
	def int numberOfStudents() { 
		return enrolledStudents.size()
	}
	
	def boolean isEnrolled(String student){
		return (enrolledStudents.contains(student))
	}
	
	def void dropsOut(String student) {
		enrolledStudents.remove(student)
	}
}