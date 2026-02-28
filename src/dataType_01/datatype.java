

public static void main ( String[] args){
   // integer
    byte b = 10;
    short s = 20;
    int i = 4000;
    long l = 40000;

    IO.println(" byte -->" +b +  " short --> " + s+ " int --> " + i+ " long --> " +l );

    // binary , octal , hexadecimal

    int z = 0b101;
    int w = 0110;
    int t = 0xA;

    IO.println( " binary --> " + z+ " octal --> " +w+ " hexadecimal --> " +t);

    // real no

    float f = 10.345f;
    double d = 1000.33444;

    IO.println( String.format("float  --> %.2f" , f)); // println use the use String.formate()
    System.out.printf("float --> %.2f%n" ,f); // printf mein f ka mtlb formate inside this not need to concatenate
    IO.println(d); // java double value ke liye na ki float.

    // character

    char o = 'c';
    System.out.println(" character -->  " + o );

    // boolean

    boolean name = true;
    IO.println("Name: " +name);


}