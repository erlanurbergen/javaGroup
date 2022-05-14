package com.company.lesson6;

public class Main2 {
    public static void main(String[] args) {
        // stack
        // main() -> print() ->
        // Оперативная память -> jvm -> 2 places -> 1.stack -> 2.heap

//        long result = 1;
//        for (int i = 10000; i >= 1; i--) {
//            result *= i;
//        }
//        System.out.println(result-1000000);

//        System.out.println(getFactorial(1000000));

//        System.out.println(getFibonacci(8));
//        for (int i = 0; i <= 8; i++) {
//            System.out.print(getFibonacci(i) + " ");
//        }
        // erbolat armagedon avadakedavra lamusicasuena
        String arr[] = {"erbolat" , "armagedon", "avadakedavra", "lamusicasuena"};
        String[] arrayStrings = getArrayStrings(arr);
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i] != null)
                System.out.println(arrayStrings[i]);
        }

    }

    private static String[] getArrayStrings(String[] words) {
        String arr[] = new String[words.length];
        String vowels = "eyuioa";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = 0; k < vowels.length(); k++) {
                    if (words[i].charAt(j) == vowels.charAt(k)){
                        count++;
                    }
                }
            }
            if (count > 4)
                arr[i] = words[i];

            count = 0;
        }

        return arr;
    }

    private static void print(int count){
        if (count == 0)
            return;
        print(count - 1);
    }

    private static int getFactorial(int n) {
        if (n == 1)
            return 1;
        return n * getFactorial(n - 1);
    }

    private static int getFibonacci(int a){
      // 0 1 1 2 3 5 8 13 21 34 55 89
      if (a == 0)
          return 0;
      if (a == 1)
          return 1;
      return getFibonacci(a - 1) + getFibonacci(a - 2);
    }


    // 5! = 5 * 4 * 3 * 2 = 120
    // main()
    // 120
    // 24
    // 6


}
