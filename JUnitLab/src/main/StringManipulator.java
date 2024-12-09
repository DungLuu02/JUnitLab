package main;

import java.util.regex.Pattern;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {

        String b = "";
        char ch;

        for (int i = 0; i < input.length(); i++) {

            ch = input.charAt(i);

            b = ch + b;
        }

        return b;

    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        String c = reverse(input);
        return c.equals(input);
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {

        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        char[] charArray = input.toCharArray();
        String result = "";

        for (int i = 0; i < charArray.length; i++) {

            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }

        return result;
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        // Your code here
        return input.toUpperCase();
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        // Your code here
        return input.toLowerCase();
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        char[] charArray = input.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isLetter(charArray[i])) {

                if (foundSpace) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }

            else {
                foundSpace = true;
            }
        }

        input = String.valueOf(charArray);
        return input;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        input = input.toLowerCase();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e'
                    || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o'
                    || input.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        // Your code here
        return sentence.split(" ").length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        // Your code here
        return input.indexOf(substring);
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(sentence);
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
}
