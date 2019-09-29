object Print
{
    def main(args: Array[String])
    {
        printf("The bool is %b \n", true)
        printf("The char is %c \n", 'F')
        printf("The string is %s \n", "F sharp or \"F#\" ")
        printf("The int is %d \n", -3)  // %i gives an exception
        printf("Number = %d \n", 42)
        printf("The float is %f \n", 42.0)
        printf("The HEX is %X \n", 42)
        printf("The float is %e \n", 0.0000042)
    }
}
