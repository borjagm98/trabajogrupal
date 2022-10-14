package sesion_grupal;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class sesion_grupal {

    public static void main(String[] args) {

        System.out.print("\n \uD83D\uDD3A \033[34m GENERADOR DE EMOTES \uD83D\uDD3B \n\n" +
                "\033[0m1. Comida/bebida \n" +
                "2. Deportes \n" +
                "3. Profesiones \n \033[0m");

        int opcion_menu = 0;
        Scanner sc0 = new Scanner(System.in);
        System.out.print("\n \u2728 Elige una opción del menú: ");
        opcion_menu = sc0.nextInt();

        if (opcion_menu == 1){

            System.out.println("\n \033[35m Has elegido comida/bebida \n \033[0m");

            int total = 0;
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\n \u2728 ¿Cuántos emotes quieres generar? [Máximo 10]:  ");
            total = sc1.nextInt();

            if (total > 10){
                System.out.println("No se pueden generar más de 10 emotes");
            }else{
                String[] lista_comida_bebida = {"\uD83C\uDF4F", "\uD83C\uDF4E", "\uD83C\uDF50","\uD83C\uDF4B", "\uD83C\uDF47", "\uD83C\uDF4D", "\uD83E\uDD51", "\uD83E\uDED1", "\uD83E\uDD50", "\uD83C\uDF59", "\uD83C\uDF69", "\uD83E\uDED4", "\uD83C\uDF70", "\uD83E\uDD67", "\uD83C\uDF54"};

                int i = 0;

                while (i < total){
                    int aleatorio1 = new Random().nextInt(lista_comida_bebida.length);
                    System.out.println(lista_comida_bebida[aleatorio1]);
                    i++;
                }
            }

        }else if (opcion_menu == 2){

            System.out.println("\n \033[36m Has elegido deportes \n \033[0m");

            int total = 0;
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\n \u2728 ¿Cuántos emotes quieres generar? [Máximo 10]:  ");
            total = sc1.nextInt();

            if (total > 10){
                System.out.println("No se pueden generar más de 10 emotes");
            }else{
                int i = 0;

                String[] lista_deportes = {"⚽", "\uD83C\uDFC0", "\uD83C\uDFC8", "⚾", "\uD83E\uDD4E", "\uD83C\uDFBE", "\uD83C\uDFC9", "\uD83C\uDFD3", "\uD83C\uDFD1", "⛳", "\uD83C\uDFF9", "\uD83E\uDD4B", "⛹", "\uD83E\uDD38", "\uD83E\uDD3C\u200D♂"};

                while (i < total){
                    int aleatorio1 = new Random().nextInt(lista_deportes.length);
                    System.out.println(lista_deportes[aleatorio1]);
                    i++;
                }
            }

        }else if (opcion_menu == 3){

            System.out.println("\n \033[32m Has elegido profesiones \n \033[0m");

            int total = 0;
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\n \u2728 ¿Cuántos emotes quieres generar? [Máximo 10]:  ");
            total = sc1.nextInt();

            if (total > 10){
                System.out.println("No se pueden generar más de 10 emotes");
            }else{
                int i = 0;

                String[] lista_profesiones = {"\uD83D\uDC6E\u200D♀", "\uD83D\uDC6E", "\uD83D\uDC69\u200D\uD83D\uDE92", "\uD83D\uDC77", "\uD83E\uDDD1\u200D\uD83D\uDD27", "\uD83D\uDC69\u200D\uD83C\uDF3E", "\uD83E\uDDD1\u200D\uD83C\uDF73", "\uD83D\uDC69\u200D\uD83C\uDF73", "\uD83D\uDC69\u200D\uD83C\uDFA4", "\uD83E\uDDD1\u200D⚖", "\uD83D\uDC69\u200D\uD83C\uDFEB", "\uD83E\uDDD1\u200D\uD83C\uDFEB", "\uD83E\uDDD1\u200D\uD83D\uDCBC", "\uD83D\uDC68\u200D\uD83D\uDCBB", "\uD83E\uDDD1\u200D\uD83D\uDD2C"};

                while (i < total){
                    int aleatorio1 = new Random().nextInt(lista_profesiones.length);
                    System.out.println(lista_profesiones[aleatorio1]);
                    i++;
                }
            }

        }else{
            System.out.println("\n ❌ \033[31m Has introducido una opción no válida ❌");
        }
    }
}