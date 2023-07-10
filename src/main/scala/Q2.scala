import scala.io.StdIn.readInt

object Q2 {
  def gcd(x: Int, y: Int): Int = y match {
    case 0 => x
    case y if y > x => gcd(y, x)
    case _ => gcd(y, x % y)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if p == x => true
    case x if gcd(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def primeSeq(n: Int, current: Int = 2): Unit = {
    if (current < n) {
      if (prime(current)) {
        print(s"$current ")
      }
      primeSeq(n, current + 1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    primeSeq(n)
  }
}
