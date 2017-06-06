
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

    case check:Int if(check==0) => println(y)
    case "secondZero" => println(x)
    case "bothZero" => println(0)
    case "Add" => println(x+y)
    case "Multiply" => println(x*y)
    case _ => println("Cannot compute")

  }

}

advancedMatchingMaths(0,3,"")
advancedMatchingMaths(2,0,"")
advancedMatchingMaths(2,3,"")
advancedMatchingMaths(2,3,"")
advancedMatchingMaths(2,3,"")
advancedMatchingMaths(2,3,"")

