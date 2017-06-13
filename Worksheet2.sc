def matchingMaths(x: Int, y: Int, maths: String) = maths match {

  case "Add" => println(x + y)
  case "Multiply" => println(x * y)
  case _ => println("Cannot compute")

}

matchingMaths(2,3,"Add")
matchingMaths(2,3,"Multiply")
matchingMaths(2,3,"Divide")

def advancedMatchingMaths(x: Int, y: Int, maths: String) = maths match {


  /*
  If x is zero, print y,
  if y is zero, print x,
  if x and y is zero, print zero,
  else, run through previous conditions from previous exercise
   */

    case "Add" if(x==0 && y==0)=> println(0)
    case "Add" if(x==0)=> println(y)
    case "Add" if(y==0)=> println(x)
    case "Add" => println(x+y)
    case "Multiply" if(x==0 || y==0) => println(0)
    case "Multiply" => println(x*y)
    case _ => println("Cannot compute")

}

advancedMatchingMaths(0,3,"")
advancedMatchingMaths(2,0,"")
advancedMatchingMaths(2,0,"Multiply")
advancedMatchingMaths(2,3,"Add")
advancedMatchingMaths(0,0,"")
advancedMatchingMaths(2,0,"Add")
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


// Want to return a data set in the form of an array from the provided library source.

// First obtain and convert library source into an array

java.util.TimeZone.getAvailableIDs()

val countryList = java.util.TimeZone.getAvailableIDs().map(x=>x.split("/")).filter(y=>y.size>1).map(x=>x(1)).grouped(50).foreach(x=>println(x.head))


/*

java.util.TimeZone.getAvailableIDs().map(x=>x.split("/"))

This line gets the data from the Java api. It maps it and then performs a split function on it for every
occurrence of "/". Map function takes a collection (availableIDS in this case) and updates it's contents
with whatever argument you tell it to use (split function in this case). Map syntax in this case of 'x' is
any identifier that can be used over and over again as long as the function is closed off.

.filter(y=>y.size>1)

This partition applies a filter on the object immediately preceding it. In this case the argument
states that anything that is larger than a size of 1 will be kept in the collection and everything
else will be removed from the collection.

.map(x=>x(1)).grouped(50).foreach(x=>println(x.head)

This partition is mapping the collection again but this time it is grouping the output from the
collection to a limit of 50 elements. From this collection we will be outputting the first element
from the collection as the collection contains 2 elements at every entry.

 */


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