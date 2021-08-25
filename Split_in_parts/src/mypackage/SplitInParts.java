package mypackage;

import java.util.ArrayList;

public class SplitInParts
{
    public static void main(String[] args)
    {
        ArrayList<String> resultList = new ArrayList<>();
        String s = "supercalifragilisticexpialidocious";
        int partLength = 3;
        String temp = "";

        for (int i = 0; i < s.length(); i++)
        {
            if ((i+1) % partLength == 0)
            {
                temp += s.charAt(i);
                resultList.add(temp);
                temp="";
            }
            else
            {
                temp += s.charAt(i);
            }
        }

        if (resultList.size() * partLength < s.length())
        {
            for (int i = resultList.size() * partLength; i < s.length(); i++)
            {
                temp += s.charAt(i);
                resultList.add(temp);
            }
        }

        String joined = String.join(" ", resultList);
        System.out.println(joined);


    }
}
