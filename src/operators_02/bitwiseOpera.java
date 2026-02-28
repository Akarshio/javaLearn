import static  java.lang.IO.*;

public static void main(String[] args){

    // bitwise operator use for bit manipulation on 0 & 1

    // & (and)  , |(or) , ^ (xor), ~ (not) , << (shift left)  , >> (shift right) , >>> (shift right with zero fill)
    // &=  , |= , ^= , >>= , <<= , >>>= (shift right with zero fill  equal)

  int a = 2;
  int b = 3;
  int c = a & b;
  int d = a | b;
  int e = a ^ b;
  int f = ~a;

  println( " And --> " + c + ", Or -->  " + d + ", Xor -->  " + e + ", Not -->  " +f );

  byte n = 1; // byte and short mein left right shift karne time byte --> int mein --> byte mein
   n = (byte)(n << 1);
  println(n);


}