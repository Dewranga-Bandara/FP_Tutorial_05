import scala.io.StdIn.readInt

object Q3 {
  def sum(n: Int): Int = {
    if (n==1) 1
    else n + sum(n-1)
  }
  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    if(n <= 0){
      System.err.println("Please enter a positive number")
      System.exit(1)
    }
    println(s"Sum is: ${sum(n)}")
  }
}
