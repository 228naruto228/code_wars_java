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
        ArrayList<Integer> archivStr = new ArrayList<>();

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

        for (String word: listStr)
        {
            for (int i = 0; i < newInputStr.size(); i++)
            {
                if (word.equals(newInputStr.get(i)))
                {
                    archivStr.add(i+1);
                }
            }
        }

        System.out.println(archivStr);
    }
}
