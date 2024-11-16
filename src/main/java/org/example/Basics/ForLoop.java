package org.example.Basics;

public class ForLoop {
    public static void main(String[] args) {
        // imprimir por consola los numeros pares de 5 a 10 usando un for


        for (byte i = 5; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            // los números impares de 1-10 con un While
            int num = 1;

            while (i <= 10) {
                System.out.println(num + " ");
                num *= 2;
            }
        }
    }
}
