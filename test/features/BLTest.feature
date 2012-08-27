package features

import teaching.TeachingClass

Feature: We want to test some business logic

As a teacher, I want to be able to add all my students to a list of students per class

Scenario: Enrolling students in a class
TeachingClass subject
String student1
String student2
Given When I start a new class
	subject = new TeachingClass
    student1 = "Anna"
    student2 = "Bernhard"
When I enroll students in that class
	subject.enroll(student1)
	subject.enroll(student2)
Then those students must be stored successfully
	subject.numberOfStudents should be 2
	subject.isEnrolled(student1) should be true
	subject.isEnrolled(student2) should be true
	

Scenario: Students drop out of a class
TeachingClass subject
String student1
String student2
Given  an existing class with 2 students
	subject = new TeachingClass
    student1 = "Anna"
    student2 = "Bernhard"
    subject.enroll(student1)
	subject.enroll(student2)
When a student drops out of a class
	subject.dropsOut(student2)
Then the number of students must have decreased by 1
	subject.numberOfStudents should be 1
And only student 1 is still enrolled in the class
	subject.isEnrolled(student1) should be true
	subject.isEnrolled(student2) should be false
	
	
	

	