package mypackage;

public class VowelCount
{
    public static void main(String[] args)
    {
        String str = "abracadabra";
        int vowelsCount = 0;
        Character[] arrayVowel = new Character[]{'a', 'e', 'i', 'o', 'u'};

        for (Character letter: arrayVowel)
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == letter)
                {
                    vowelsCount++;
                }
            }
        }
        System.out.println(vowelsCount);
    }
}
