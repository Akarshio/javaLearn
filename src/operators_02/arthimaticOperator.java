import static java.lang.IO.*;

void main() {
  // + , - , * , / , % , += , -=, /= , %=

  int a = 10;
  int b = 20;

  println(" Addition --> " +(a+b) + ", multiply --> "+(a*b) + ", subtraction --> "+(a-b) +
          ", divide --> "+(b / a) + ", modulo --> "+( b % a) );

  // assignment operator
  a += 4;
  a -= 5;
  a /= 5;
  a %= 2;
  a *= 3;

  println(a);

  // i++ , i--

  int i = 6;
  i++; // i--
  println(i);

}





