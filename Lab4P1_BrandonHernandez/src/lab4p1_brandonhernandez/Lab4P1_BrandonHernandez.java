/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_brandonhernandez;

import java.util.Scanner;

/**
 *
 * @author brhb2
 */
public class Lab4P1_BrandonHernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.println("== MENU ==");
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña mejorada");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion:");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    String c1;
                    System.out.println("Ingrese el primer conjunto:");
                    c1 = sc2.next();

                    String c2;
                    System.out.println("Ingrese el segundo conjunto:");
                    c2 = sc2.next();

                    int valor = c1.charAt(0);
                    boolean letras = false;
                    if (valor >= 65 && valor <= 90) {
                        letras = true;
                    }
                    boolean igual = false;
                    if (c1.charAt(1) == '=') {
                        igual = true;
                    }
                    boolean cor = false;
                    if (c1.charAt(2) == '{') {
                        cor = true;
                    }
                    boolean cor2 = false;
                    if (c1.charAt(3) == '}') {
                        cor2 = true;
                    }

                    if (letras = false) {
                        System.out.println("La letra debe ser mayuscula");
                    }
                    if (igual = false) {
                        System.out.println("Falta el igual");
                    }
                    if (cor = false) {
                        System.out.println("Falta un corchete");
                    }
                    if (cor2 = false) {
                        System.out.println("Falta un corchete");
                    }

                    boolean iguales = true;
                    if (c1.equalsIgnoreCase(c2)) {
                        System.out.println("Son iguales");
                    } else {
                        System.out.println("No son iguales");
                        iguales = false;
                    }

                    if (iguales == false) {

                        String union = "";
                        for (int i = 3; i < c1.length() - 1; i++) {
                            union += c1.charAt(i);
                        }
                        union += ",";

                        for (int i = 3; i < c2.length() - 1; i++) {
                            union += c2.charAt(i);
                        }
                        System.out.println("Union:{" + union + "}");

                        String inter = "";
                        for (int i = 1; i < c1.length(); i+= 2) {
                            inter += c1.charAt(i);
                            for (i = 2; c2.length();i+=2) {

                            }
                        }

                    }

                    break;

                case 2:
                    String pass;
                    System.out.println("Ingrese la contraseña:");
                    pass = sc2.next();
                    int num;
                    System.out.println("Ingrese un numero:");
                    num = sc.nextInt();

                    boolean letra = false;
                    for (int i = 1; i < pass.length(); i++) {
                        int x = pass.charAt(i);

                        if (x >= 97 && x <= 122) {
                            letra = true;
                            break;
                        }
                    }

                    boolean numero = false;
                    for (int i = 1; i < pass.length(); i++) {
                        int x = pass.charAt(i);

                        if (x >= 48 && x <= 57) {
                            numero = true;
                            break;
                        }
                    }

                    boolean segura = false;

                    if (letra == false) {
                        System.out.println("No es segura porque no tiene al menos una letra");
                    }
                    if (numero == false) {
                        System.out.println("No es segura porque no tiene al menos un numero");
                    }
                    if (pass.length() < 8) {
                        System.out.println("No es segura porque tiene menos de 8 caracteres");
                    } else {
                        System.out.println("La contraseña es segura");
                        segura = true;
                    }

                    String pass2 = "";

                    if (segura == true) {
                        int contador = 0;
                        for (int i = 0; i < pass.length(); i++) {
                            if (contador == 2) {
                                contador = 0;
                                pass2 += num;
                                num++;
                            }
                            char x = pass.charAt(i);
                            pass2 += x;
                            contador++;

                        }
                        if (contador == 2) {

                            pass2 += num;
                        }
                        System.out.println(pass2);
                    }

                    break;

                case 3:
                    menu = false;

                    break;

                default:
                    System.out.println("Opcion Invalida!!!!!");
            }

        }
    }

}
