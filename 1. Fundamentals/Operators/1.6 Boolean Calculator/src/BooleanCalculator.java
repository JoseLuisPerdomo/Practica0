public class BooleanCalculator
{
   public static void main(String[] args)
   {
      int a = 3, b = -4, c = 1;
      boolean t = true, f = false;
       boolean option1 = (a >= b);
       boolean option2 = -b / a == c;
       boolean option3 = (t || !f) == (2 * c <= c);
       boolean option4 = (!t == f) != (b + c / a > a - b * c);

       System.out.print(option1 + " " + option2 + " " + option3 + " " + option4);
   }
}