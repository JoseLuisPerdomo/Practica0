public class HundredthPrime
{
   public static void main(String[] args)
   {
      int first = 3;
      int counter = 1;

      while (counter != 100) {
         for (int divisor = 2; divisor < first; ++divisor) {
            if (first % divisor == 0) {
               continue;
            } else {
               counter++;
            }
            first++;
         }
      }
      System.out.print(first + " is the hundredth prime number.");
   }
}