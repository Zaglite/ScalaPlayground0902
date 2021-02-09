import scala.io.StdIn.readLine

object ForLoops extends App {
  //more commonly used in Scala
  //used when we know the number of cycles/ loops /interrations
  for (i <- 0 to 5) {
    //turns out
    println("Alice talked for time", i)
  }

  for (i <- 0 until 5) {
    println("this time Bob talked", i)
  }

  val myNumbers = Seq(2,3,5,10,15,88,-55, 3,14 , "Valdis")
  for (n <- myNumbers) {
    println("My number is", n)
  }

  val myName = "Zanete"
  for (c <- myName) {
    println("Letter ", c)
  }

  val mySentence = readLine("Please enter any sentence")


}
