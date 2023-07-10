import scala.io.StdIn.readInt

object Q1 {
  def gcd(x:Int, y:Int): Int = y match {
    case 0 => x
    case y if y>x => gcd(y,x)
    case _ => gcd(y, x%y)
  }

  def prime(p: Int, n : Int = 2): Boolean = n match {
    case x if p==x => true
    case x if gcd(p,x)>1 => false
    case x => prime(p, x+1)
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val n: Int = readInt()
    if (prime(n)) {
      println(s"$n is a prime number")
    } else {
      println(s"$n is not a prime number")
    }
  }
}
