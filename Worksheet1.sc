
println("Hello World!")


val a: String = "Hello World!"
println(a)

def printString(a: String): Unit = {

  println(a)

}

printString("Hello World!")



def returnString(): String = {

  "Hello World!"

}

println(returnString())


val a1 = 1+2+3
val b = 5.5
val c = a1.toString
val d = true

def printVal(x: Any): Unit ={

  println(x)

}

printVal(a1)
printVal(b)
printVal(c)
printVal(d)

def returnChars(word: String, position: Int): Unit = {

  println(word.takeRight(position))

}

returnChars("Hello",3)

def joinStringsAndRemoveChars(s1: String, s2: String, c1: Char, c2: Char): Unit = {

  val s3 = s1.concat(s2) //join s2 onto end of s1

  val s4 = s3.replace(c1, c2) //replace occurrences of c1 with c2

  println(s4)

}

println(joinStringsAndRemoveChars("Ha","llo",'a','e'))

def addTwoIntegers(x: Int, y: Int): Unit = {

  println(x + y)

}

addTwoIntegers(2,3)

def conditionalMaths(x: Int, y: Int, check: Boolean): Unit ={

  if(check == true)
   println(x+y)
  else
    println(x*y)

}

conditionalMaths(2,3,true)
conditionalMaths(2,3,false)

def conditionalMaths2(x: Int, y: Int, check: Boolean): Unit = {

  /*
  If x is zero, print y,
  if y is zero, print x,
  if x and y is zero, print zero,
  else, run through previous conditions from previous exercise
   */

  if(x==0)
    print(y)
  else if(y==0)
    print(x)
  else if(x==0 && y==0)
    print(0)
  else
    if(check == true)
      println(x + y)
    else
      println(x * y)

}

conditionalMaths2(2,3,true)
conditionalMaths2(2,0,false)
conditionalMaths2(0,0,true)

def repeatString(word: String, quantity: Int): Unit ={

  for(i<-1 to quantity)
    println(word)

}

repeatString("Hi",3)


/*
Use a StringBuffer method by using "*" operator which allows multiple outputs of a String
 */

def rectangleString(word: String, quantity: Int): Unit = {

  for(i<-1 to quantity)
    println(word * quantity)

}

rectangleString("H",4)

def fizzBuzzPrint(s1: String, s2: String, number: Int): Unit ={

// Print all iteration counts
  // If iteration count is divisible by 3 and 5 output concatenation of s1+s2
    // If iteration count is divisible by 3 output s1
     // If iteration count is divisible by 5 output s2


  for(i<-1 to number) {

    if (i % 3 == 0 && i % 5 == 0)
      println(s1.concat(s2))
    else if (i % 3 == 0)
      println(s1)
    else if (i % 5 == 0)
      println(s2)
    else
      println(i)
  }

}

fizzBuzzPrint("Fizz","Buzz",15)

def recursiveStringRepeat(word: String, quantity: Int): Unit ={

  if(quantity == 0)
    println(" ")
  else {
    println(word)
    recursiveStringRepeat(word, quantity - 1)
  }
}

recursiveStringRepeat("Hi",3)

def rectangleStringRepeat(word: String, quantity: Int, columns: Int): Unit ={


  if(quantity == 0)
    println(" ")
  else {
    println(word * columns)
    rectangleStringRepeat(word, quantity - 1, columns)
  }
}

rectangleStringRepeat("H",4,4)

def recursiveFizzBuzz(s1: String, s2: String, number: Int, iter: Int): Unit = {

  // Print all iteration counts
  // If iteration count is divisible by 3 and 5 output concatenation of s1+s2
  // If iteration count is divisible by 3 output s1
  // If iteration count is divisible by 5 output s2

  if(iter == 0 || number == 0)
    println("")
  else if (iter % 3 == 0 && iter % 5 == 0) {
    println(s1.concat(s2))
    recursiveFizzBuzz(s1, s2, number - 1, iter - 1)
  }
  else if (iter % 3 == 0){
    println(s1)
    recursiveFizzBuzz(s1,s2,number - 1,iter - 1)
  }
  else if (iter % 5 == 0){
    println(s2)
    recursiveFizzBuzz(s1,s2,number - 1,iter - 1)
  }
  else {
    println(iter)
    recursiveFizzBuzz(s1, s2, number - 1, iter - 1)
  }
}

recursiveFizzBuzz("Fizz","Buzz",15,15)

def matchingMaths(x: Int, y: Int, maths: String): Unit ={

  // Set the base case to the input String

  val mathsType = maths

  // Add all the cases, making sure to use the wildcard to catch any other inputs

  mathsType match {

    case "Add" => println(x+y)
    case "Multiply" => println(x*y)
    case _ => println("Cannot compute")
  }

}

matchingMaths(2,3,"Add")
matchingMaths(2,3,"Multiply")
matchingMaths(2,3,"Divide")

def advancedMatchingMaths(x: Int, y: Int, maths: String): Unit = {

  /*
  If x is zero, print y,
  if y is zero, print x,
  if x and y is zero, print zero,
  else, run through previous conditions from previous exercise
   */

  val mathsType = maths

  mathsType match {

    case "Add" => println(x+y)
    case "Multiply" => println(x*y)
    case _ => println("Cannot compute")
    case check:Any if(x==0)
    => println(y)
    case check:Any if(y==0)
    => println(x)
    case check:Any if(x==0 && y==0)
    => println(0)


  }

}

advancedMatchingMaths(0,3,"")
advancedMatchingMaths(2,0,"")
advancedMatchingMaths(2,3,"Multiply")
advancedMatchingMaths(2,3,"Add")
advancedMatchingMaths(0,0,"")
advancedMatchingMaths(0,3,"Add")
advancedMatchingMaths(0,3,"Divide")

/*

Needs to take one argument in the form of an array/tuple and return the two arguments in inverted order.
constructor pattern.

 */


def patternSwap(x: Any): Any = x match {

    /*
    Create new objects(Array/List/Tuple) with new ordering
     */

  case Array(a,b) => println(Array(b,a))
  case List(a,b) => println(List(b,a))
  case Tuple2(a,b) => println(Tuple2(b,a))
  case _ => "Invalid Input"

  }

var list = List(1,2)
var arr = Array(1,2)
var tup1 = Tuple2(1,2)

patternSwap(list)
patternSwap(arr)
patternSwap(tup1)

def functional(): Unit = {

  java.util.TimeZone.getAvailableIDs()

}




def blackJack(firstNumber: Int, secondNumber: Int): Unit = {

  /*

  Check if a OR b > 21, output 0
  Check if a > b, output a
  Check if b > a, output b

   */

  if(firstNumber > 21 || secondNumber > 21)
    println(0)
  else if(firstNumber > secondNumber)
    println(firstNumber)
  else if(secondNumber > firstNumber)
    println(secondNumber)

}

blackJack(18,21)
blackJack(20,18)
blackJack(22,22)

def uniqueSum(integerOne: Int, integerTwo: Int, integerThree: Int): Unit = {

  /*
  Return the sum of all unique integers (i.e. Duplicates are not added to the sum
   */

  var sum = 0

  if(integerOne == integerTwo && integerOne == integerThree){
    println(sum)
  }
  else if(integerOne == integerTwo) {
    sum += integerThree
    println(sum)
  }
  else if(integerOne == integerThree) {
    sum += integerTwo
    println(sum)
  }
  else if(integerTwo == integerThree) {
    sum += integerOne
    println(sum)
  }
  else {
    sum = integerOne + integerTwo + integerThree
    println(sum)

  }
}

uniqueSum(1,2,3)
uniqueSum(3,3,3)
uniqueSum(1,1,2)


def isTooHot(temperature: Int, isSummer: Boolean): Unit ={

  /*
  60 >= limits non summer <= 90
  60 >= limits summer <= 100
   */

  if(isSummer == false) {
    if (temperature >= 60 && temperature <= 90)
      println(true)
    else
      println(false)
  }
  else {
    if (temperature >= 60 && temperature <= 100)
      println(true)
    else
     println(false)

  }

}

isTooHot(80,false)
isTooHot(100,false)
isTooHot(100,true)