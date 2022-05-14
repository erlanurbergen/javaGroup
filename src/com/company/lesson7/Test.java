package com.company.lesson7;

public class Test {
    public static void main(String[] args) {
        String vowels = "eyuioa";
        String text = "almaty love city together";
        String[] s = text.trim().split(" ");
        System.out.println(s.length);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (text.charAt(i) == vowels.charAt(j))
                    count++;
            }
        }
        System.out.println(count);
    }
}
