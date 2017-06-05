
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

print(returnString())


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

println(addTwoIntegers(2,3))

def conditionalMaths(x: Int, y: Int, check: Boolean): Unit ={

  if(check == true)
   println(x+y)
  else
    println(x*y)

}

println(conditionalMaths(2,3,true))
println(conditionalMaths(2,3,false))

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

println(conditionalMaths2(2,3,true))
println(conditionalMaths2(2,0,false))
println(conditionalMaths2(0,0,true))

def repeatString(word: String, quantity: Int): Unit ={

  var number = quantity

  while(number > 0)
    println(word)
    number -= 1

}

println(repeatString("Hi",3))

