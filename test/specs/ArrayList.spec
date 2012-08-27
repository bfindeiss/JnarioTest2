package specs

import java.util.ArrayList

describe ArrayList {
	
	
	


	context "Operations on a List of size 0"{
		
		fact subject.size should be 0
		
		fact subject.empty should be true
		
		fact "Removing element must throw Exception"{
			subject.remove(0) throws Exception
		}
		
		fact "Adding an element increases list size by 1"{
			subject.add("An Element")
			subject.size should be 1
		}
		
		fact "After adding, an element can be found in the list"{
			val String element = "A random element"
			subject.add(element)
			subject.contains(element) should be true
		}
	}

	context "Operations on a List of size 1"{
		before subject.add("An Element")
		
		fact subject.size should be 1
		
		fact "Adding another element increases list size to 2"{
			subject.add("Another Element")
			subject.size should be 2
		}
		
		fact "Removing element must be successful"{
			subject.remove(0)
			subject.size should be 0
		}
		
		
		
	}
	
	context "Operations on 2 lists"{
		var ArrayList<String> anotherList
		
		before{
			subject.add("An Element")
			anotherList = new ArrayList<String>
		}
		
		
		fact "Joining two lists"{
			
			anotherList.add("Some other element")
			
			subject.addAll(anotherList)
			
			subject.size should be 2	
			subject should contain "An Element"
			subject should contain "Some other element"
			
			anotherList.size should be 1
			anotherList should contain "Some other element"
			
		}
		
		
		
	}

}