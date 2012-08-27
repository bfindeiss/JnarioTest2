package specs

import teaching.TeachingClass

describe TeachingClass {
	
	context "An empty class"{
		TeachingClass subject = new TeachingClass
		
		fact "The class is empty"{
			subject.numberOfStudents should be 0
		}
		
		fact "Students can't drop out of an empty class"{
			subject.dropsOut("someone") throws Exception
		}
	}
	
	context "A class with 2 enrolled students"{
		
	}

}