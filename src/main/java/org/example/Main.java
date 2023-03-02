package org.example;

public class Main {
    public static void main(String[] args) {

        int fakultätsergebnis = fakuRechner(3);
        System.out.println(fakultätsergebnis);

        int ergebnis = fakuRechnerWhile(3);
        System.out.println(ergebnis);

    }
           public static int fakuRechner(int n) {
            int result = 1;
            for (int i = 1 ; i <= n; i++) {

                result = result * i ;
            }
            return result;
        }

    public static int fakuRechnerWhile(int n) {
        int result = 1;
        int i = 1;

        while (i <= n){

            result = result * i;
            i++;

        }
        return result;
    }


}