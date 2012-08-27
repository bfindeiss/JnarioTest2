package features

import bl.Calculator2

Feature: Calculator

Background:
  Calculator2 calculator = new Calculator2
  int result
  Given a calculator

Scenario: Adding two numbers
  When adding two numbers "5" and "6". 
    result = calculator.add(args.first.toInt, args.second.toInt)
  Then it prints "11"
    result => args.first.toInt
    
Scenario: Dividing two numbers
 When entering two numbers "15" and "5" and pressing enter. 
   result = calculator.divide(args.first.toInt, args.second.toInt)
 Then it prints "2"
	
