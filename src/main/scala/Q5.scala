import scala.io.StdIn.readInt

object Q5 {
  def sum(n: Int): Int = n match {
    case 2 => 2
    case _ => n + sum(n - 2)
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    if(n < 0){
      System.err.println("Invalid input")
      System.exit(1)
    }
    else if(n==0 || n==1){
      println()
    }
    else{
      if(n%2==0){
        println(s"The addition of all even numbers less than $n = ${sum(n-2)}")
      }
      else {
        println(s"The addition of all even numbers less than given $n = ${sum(n-1)}")
      }
    }
  }
}
