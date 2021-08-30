package mypackage;

public class ExponentiationFive
{
    public static void main(String[] args)
    {
        int number = 125;

        /*
        I don't know, what i am doing.
        It's very bad answer, for this task

        String numberString = Integer.toString(number);
        char[] arrayCharacter = numberString.toCharArray();

        for (char character: arrayCharacter) {
            System.out.println(character);
        }
        */


        // I think, that it's normal algorithm for this task
        int initialNumber = (number - 5) / 10;
        int result = initialNumber * (initialNumber+1) * 100 + 25;
        System.out.println(result);
    }
}
