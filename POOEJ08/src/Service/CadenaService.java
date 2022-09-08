/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    String frases;
    int largof;
    Scanner leer = new Scanner(System.in);
    Cadena a1 = new Cadena();

    public void perdir() {
        System.out.println("Ingrese una frase con o sin espacios en blanco");
        frases = leer.nextLine();
        a1.setFrase(frases);
        largof = frases.length();
        a1.setLargoFrase(largof);
    }

    public void mosrarVocales() {
        int vocales = 0;
        for (int i = 0; i < largof; i++) {
            if (frases.substring(i, i + 1).equals("a") || frases.substring(i, i + 1).equals("e") || frases.substring(i, i + 1).equals("i") || frases.substring(i, i + 1).equals("o") || frases.substring(i, i + 1).equals("u")) {
                vocales++;
            }
        }
        System.out.println("Hay " + vocales + " vocales");
        System.out.println("");
    }

    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = largof; i > 0; i--) {
            fraseInvertida += frases.substring(i - 1, i);

        }
        System.out.println("La frase al reves es " + fraseInvertida);
        System.out.println("");
    }

    public void vecesRepetido() {
        System.out.println("Ingrese el caracter a buscar en la frase");
        System.out.println("Se mostrara cuantas veces se repite");
        int repetir = 0;
        String repetido = leer.next();
        for (int i = 0; i < largof; i++) {
            if (frases.substring(i, i + 1).equals(repetido)) {
                repetir++;
            }
        }
        System.out.println("El caracter se repite " + repetir + " ves/ces");
        System.out.println("");
    }

    public void compararLongitud() {
        System.out.println("Ingrese una frase para comparar el largo");
        leer.nextLine();
        String frase2 = leer.nextLine();
        if (frase2.length() > frases.length()) {
            System.out.println("La nueva frase es mas larga");
        } else {
            System.out.println("La frase original es mas larga");
        }
        System.out.println("");
    }

    public void unirFrase() {
        String faunir;
        String frasenueva;
        System.out.println("Ingrese la frase que quiera unir a la original");
        //leer.nextLine();
        faunir = leer.nextLine();
        frasenueva = frases.concat(" " + faunir);
        frases = frasenueva;
        a1.setFrase(frasenueva);
        a1.setLargoFrase(frasenueva.length());
        largof = a1.getLargoFrase();
        System.out.println("");
    }

    public void reemplazar() {
        String cambiar;
        String cambiar2 = "";
        System.out.println("Ingrese una letra con la que quiera reemplazar a la letra a");
        cambiar = leer.next();
        for (int i = 0; i < largof; i++) {
            if (frases.substring(i, i + 1).equals("a")) {
                cambiar2 += cambiar;
                continue;
            }
            cambiar2 += frases.substring(i, i + 1);

        }
        System.out.println(cambiar2);
    }

    public boolean contiene() {
        String buscar;
        boolean si=true;
        System.out.println("Ingrese una letra que quiere que se verifique si lo contiene la frase");
        buscar = leer.next();
        if (frases.contains(buscar)) {
            System.out.println(si);
            return si;
        } else {
            si=false;
            System.out.println(si);
            return si;
        }
    }
}
