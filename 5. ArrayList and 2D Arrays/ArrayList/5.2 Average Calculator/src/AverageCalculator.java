import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double result = 0;
        for (Integer number : numbers) {
            result += number;
        }
        return (double) result / numbers.size();
    }
}