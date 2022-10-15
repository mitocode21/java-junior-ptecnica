package com.mitocode;

import java.time.LocalDate;
import java.util.*;

public class App {

    //invertir una cadena
    private void m1InvertString(String text) {
        /*String[] array = text.split("");
        StringBuilder newText = new StringBuilder();

        for(int i = array.length; i > 0; i--){
            newText.append(array[i - 1]);
        }
        System.out.println(newText);*/
        //Desde Java 5
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    private void m2IsCapicua(int number) {
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();

        if (numberText.equals(reverseNumber)) {
            System.out.println("Is capicua");
        } else {
            System.out.println("Not capicua");
        }
    }

    //mitocode
    //m=1, i=1, t=1, o=2, c=1, d=1, e=1
    private void m3CountCharacterTimes(String text) {
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    private void m4RepeatedCharacters(String text) {
        int i, lenght, counter[] = new int[256];

        lenght = text.length();

        for (i = 0; i < lenght; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
            counter[text.charAt(i)]++;
        }

        for (i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char) i + ": " + counter[i]);
            }
        }
    }

    public void m5IsMultipleOf2(int number) {
        if (number % 2 == 0) {
            System.out.println("Is multiple");
        } else {
            System.out.println("No is multiple");
        }
    }

    public void m6IsLeapYear(int year) {
        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }

    public void m7RamdomOrderString(String text) {
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public void m8GetOnlyNotDuplicatesList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    public void m9CheckIfVowelIsPresent(String text) {
        /*String[] array = text.split("");
        boolean isPresent = false;
        for(String s : array){
            if(s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")){
                isPresent = true;
                break;
            }
        }
        System.out.println(isPresent);*/
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);

        boolean rpta = Arrays.asList(text.split("")).stream().anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println(rpta);
    }

    private boolean m10Palindrome(String text) {
        boolean result = true;
        int length = text.length();

        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        App app = new App();
        //app.m1InvertString("mitocode");
        //app.m2IsCapicua(5215);
        //app.m3CountCharacterTimes("mitocode");
        //app.m4RepeatedCharacters("mitocode");
        //app.m5IsMultipleOf2(11);
        //app.m6IsLeapYear(2024);
        //app.m7RamdomOrderString("mitocode");
        //app.m8GetOnlyNotDuplicatesList(Arrays.asList(1,2,3,4,5,5,1,2,9));
        //app.m9CheckIfVowelIsPresent("mitocode");
        System.out.println(app.m10Palindrome("oro"));

    }
}
