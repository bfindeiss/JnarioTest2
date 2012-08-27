package specs

import java.util.Stack

describe Stack {
	
	fact subject.size should be 0
	
	fact "Increases in size when pushing an element"{
		subject.push("A String")
		subject.size => 1	
	}

}