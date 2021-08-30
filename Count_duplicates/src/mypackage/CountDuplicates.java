package mypackage;

import java.util.ArrayList;

public class CountDuplicates {
    public static void main(String[] args) {
        String text = "aabBcde";
        String text_test = text.toLowerCase();
        char[] arrayCharacter = text_test.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        int countCharacter = 0;
        ArrayList<Character> resultList = new ArrayList<>();
        ArrayList<Integer> countResultList = new ArrayList<>();

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

        //Считаем количество символов
        for (char letter: list)
        {
            for (int j = 0; j < arrayCharacter.length; j++)
            {
                if (letter == arrayCharacter[j])
                {
                    countCharacter++;
                }
            }

            if (countCharacter >= 2)
            {
                resultList.add(letter);
                countResultList.add(countCharacter);
                countCharacter = 0;
            }
            else
            {
                countCharacter = 0;
            }
        }

        for (int i = 0; i < resultList.size(); i++)
        {
            System.out.println("Символ '" + resultList.get(i) + "' повторяется количество раз: " + countResultList.get(i));
        }

    }
}
