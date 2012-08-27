package specs

describe "The String 'Hello World'"{
  facts "about Hello World" => [
    length should be 11
    it should startWith "Hello"
    it should endWith "World"
    it should contain "Wor"
  ]
}