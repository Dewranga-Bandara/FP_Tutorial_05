import scala.io.StdIn.readInt

object Q6 {
  def fibonacci(n: Int): Int = {
    if (n <= 1)  n
    else fibonacci(n - 1) + fibonacci(n - 2)

  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(s"${fibonacci(i)} ")
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    printFibonacci(n)
  }
}
