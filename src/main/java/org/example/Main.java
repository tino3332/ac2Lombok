package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   PRUEBA DE LOMBOK - PATRÓN BUILDER      ");
        System.out.println("==========================================");

        // 2. Crear instancias de Usuario utilizando el patrón Builder[cite: 22]
        Usuario usuario1 = Usuario.builder()
                .id(1L)
                .nombre("Agustín")
                .email("agustin@example.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("Lucía")
                .email("lucia@example.com")
                .build();

        // 3. Imprimir los datos por consola[cite: 22]
        System.out.println("Usuario 1: " + usuario1);
        System.out.println("Usuario 2: " + usuario2);

        System.out.println("==========================================");
    }
}