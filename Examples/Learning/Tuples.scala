object Tuples
{
    def main(args: Array[String])
    {
        def average(a: Double, b: Double): Double =
        {
            (a + b) / 2.0
        }

        def swap[A,B](p: (A,B)): (B,A) = (p._2, p._1)
        def swap2[A, B](p: (A, B)): (B, A) = p.swap
        def swap3[A,B](a:A, b:B): (B, A) = (b,a)

        println(average(10.0, 20.0))
        println(swap("Web", 2.0))
        println(swap (20, 30))

    }
}
