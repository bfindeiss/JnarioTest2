package specs

import java.util.Stack
import java.util.EmptyStackException

describe Stack{
  context "when empty"{
    fact subject.size => 0
    fact subject.pop throws EmptyStackException
  }
  context "with elements"{
    before subject.add("an element")
    fact "pop decreases size"{
      subject.pop
      subject.size => 0
    }  
    fact "pop removes last element"{
      subject.pop => "an element"
    }    
  }
}