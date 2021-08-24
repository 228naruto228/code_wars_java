package mypackage;

import java.util.ArrayList;

public class ReverseWords {
    public static void main(String[] args) {
        String original = "The quick brown fox jumps over the lazy dog.";
        String[] arrayOriginal = original.split(" ");
        ArrayList<String> newArrayOriginal = new ArrayList<>();;
        String temp = "";
        for (String word: arrayOriginal) {
            for (int i = word.length(); i > 0; i--){
                temp = temp + word.charAt(i - 1);
            }
            newArrayOriginal.add(temp);
            temp = "";
        }
        for (int j = 0; j < newArrayOriginal.size(); j++){
            System.out.println(newArrayOriginal.get(j));
        }
    }
}
