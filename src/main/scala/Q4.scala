import scala.io.StdIn.{readInt, readLine}

object Q4 {
  def isOdd(n: Int): Boolean = !isEven(n)

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    print("Press 'e' for check if it is even or Press 'o' for check if it is odd: ")
    val s: String = readLine()
    if(s=="e"){
      println(isEven(n))
    }
    else if (s=="o"){
      println(isOdd(n))
    }
    else{
      println("Please enter the valid character")
    }
  }
}
