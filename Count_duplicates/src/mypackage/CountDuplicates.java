package mypackage;

import java.util.ArrayList;

public class CountDuplicates {
    public static void main(String[] args) {
        String text = "aabBcde";
        String text_test = text.toLowerCase();
        char[] arrayCharacter = text_test.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < arrayCharacter.length; i++)
        {
            if (list.contains(arrayCharacter[i]))
            {
                continue;
            }
            else
            {
                list.add(arrayCharacter[i]);
            }
        }
        System.out.println(list);


    }
}
