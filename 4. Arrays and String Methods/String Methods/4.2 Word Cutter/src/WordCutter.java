public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    public static String cutInHalf(String word1) {
        int half = word1.length() / 2;
        return word1.substring(0, half);
    }
}