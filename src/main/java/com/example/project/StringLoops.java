package com.example.project;

public class StringLoops {

    public StringLoops() {
    }

    // WARM UP
    // using a for loop remove all 'a' characters from input string
    public String removeA(String str) {
        StringBuilder removeA = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                removeA.append(str.charAt(i));
            }
        }
        return removeA.toString();
    }

    // WARM UP
    // using a while loop remove all 'a' characters from input string
    public String removeA2(String str) {
        StringBuilder removeA2 = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != 'a') {
                removeA2.append(str.charAt(i));
            }
            i++;
        }
        return removeA2.toString();
    }

    // WARM UP
    // Reverse a string by counting down from the end to the start
    public String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // WARM UP
    // Reverse a string by counting up from the start to the end
    public String reverseString2(String str) {
        StringBuilder reverseString2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            reverseString2.append(str.charAt(i));
        }
        return reverseString2.reverse().toString();
    }

    // using a for loop
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar) {
        StringBuilder replaceCharacterV1 = new StringBuilder();
        for (int i = 0; i < origStr.length(); i++) {
            if (origStr.charAt(i) == searchChar.charAt(0)) {
                replaceCharacterV1.append(replaceChar);
            } else {
                replaceCharacterV1.append(origStr.charAt(i));
            }
        }
        return replaceCharacterV1.toString();
    }

    // using a while loop
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
        StringBuilder replaceCharacterV2 = new StringBuilder();
        int i = 0;
        while (i < origStr.length()) {
            if (origStr.charAt(i) == searchChar.charAt(0)) {
                replaceCharacterV2.append(replaceChar);
            } else {
                replaceCharacterV2.append(origStr.charAt(i));
            }
            i++;
        }
        return replaceCharacterV2.toString();
    }

    public int countString(String searchString, String origString) {
        int count = 0;
        for (int i = 0; i < origString.length(); i++) {
            try {
                if (origString.substring(i, searchString.length() + i).equals(searchString)) {
                    count++;
                }
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public String removeString(String searchString, String origString) {
        String str = origString;
        for (int i = 0; i < origString.length(); i++) {
            str = str.replace(searchString, "");
        }
        return str;
    }

    public void commaSeparated(int fromNum, int toNum) { // the tests will compare your printed output (not a returned
                                                         // string)
        System.out.println();
    }

    public boolean isPalindrome(String myString) {
        return false;
    }

    public void multiPrint(String toPrint, int num) { // the tests will compare your printed output (not a returned
                                                      // string)
        System.out.println();
    }
}
