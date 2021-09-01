package mypackage;

import java.util.ArrayList;
import java.util.Locale;

public class GreatArchiver
{
    public static void main(String[] args)
    {
        String inputStr = "To be or not to be";
        inputStr = inputStr.toLowerCase();
        String[] listStr = inputStr.split(" ");
        ArrayList<String> newInputStr = new ArrayList<>();
        for (String word: listStr)
        {
            if (newInputStr.contains(word))
            {
                continue;
            }
            else
            {
                newInputStr.add(word);
            }
        }
        System.out.println(newInputStr);


    }
}
