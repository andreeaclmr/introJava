package org.example;

public class Arrays {
    public static void main(String[] args) {
        // definir un array de 5 numeros (lleno)
        // un array de 5 nombres de ciudades (llenos)

        int[] numeros = {1, 2, 3, 4, 5};
        String[] nombres = {"Tokyo", "Beijing", "Paris", "Berlin", "London"};
        for (int numero: numeros) {
            System.out.println("numeros : " + numero);
        }
        for (String ciudad : nombres) {
            System.out.println("ciudad : " + nombres);
        }

    }
}
