object ImmutableVsMutable
{
    def main(args: Array[String])
    {
        // val is immutable
        val x = 7 + 3
        val y = x + 1
        val z = x / 2

        // var is mutable
        var modifiable = "original value"
        modifiable = "new value"
    }
}
