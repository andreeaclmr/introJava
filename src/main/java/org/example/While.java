package org.example;

public class While {
    public static void main(String[] args) {
        // imprimit numeros impares de 5 al 10
        int i = 5;
        while (i <= 10) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
                i++;
        }
    }
}