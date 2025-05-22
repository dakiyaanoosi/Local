package Basics;
class StringFormat
{
    public static void main(String[] args) 
    {
        //INTEGERS
        System.out.printf("%d:%d\n",1,2); //OUTPUT 1:2
        System.out.printf("%02d:%02d\n",1,2); //OUTPUT 01:02
        System.out.printf("%03d:%03d\n",1,2); //OUTPUT 001:002

        System.out.printf("%d/%d\n",1,2); //OUTPUT 1/2

        System.out.printf("%05d\n",1); //OUTPUT 00001

        //STRINGS
        System.out.printf("%s\n","ShriRam"); //OUTPUT "ShriRam"
        System.out.printf("%-10s\n","ShriRam"); //OUTPUT "ShriRam" (left aligned)
        System.out.printf("%10s\n","ShriRam"); //OUTPUT "ShriRam" (right aligned)
        System.out.printf("%-10s %10s\n","ShriRam","ShriRam"); //OUTPUT "ShriRam           ShriRam"
        System.out.printf("%-10s|%10s\n","ShriRam","ShriRam"); //OUTPUT "ShriRam     |     ShriRam"

        //STRING + INTEGERS
        //CREATING A TABLE
        System.out.printf("%-10s %10s\n","Product","Quantity");
        System.out.printf("%-10s %10d\n","Apple",5);
        System.out.printf("%-10s %10d\n","Orange",6);

        //FLOATING POINT NUMBERS
        System.out.printf("%f\n",34.11002); //OUTPUT 34.11002
        System.out.printf("%.0f\n",34.11002); //OUTPUT 34
        System.out.printf("%.1f\n",34.11002); //OUTPUT 34.1
        System.out.printf("%.2f\n",34.11002); //OUTPUT 34.11
        System.out.printf("%.3f\n",34.11002); //OUTPUT 34.110
        System.out.printf("%.7f\n",34.11002); //OUTPUT 34.1100200

        //CHARACTERS
        System.out.printf("%c\n",65); //OUTPUT : A (Converts ascii value to character)
        //Storing ascii value,uicode or hexValue in char datatype stores the equivalent character !!

        for (int i = 65; i <= 69; i++) 
        {
            System.out.printf("%c ", i);  // Prints A to E
        }
    }
}