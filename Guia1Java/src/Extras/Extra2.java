/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package Extras;

public class Extra2 {

    public static void main(String[] args) {

        int A = 0;
        int B = 1;
        int C = 2;
        int D = 3;
        int Aux;
        System.out.println("A vale = "+A+" B vale = "+B+" C vale = "+C+" D vale = "+D);
        System.out.println("Cambiamos valores y ahora...");
        Aux=B;
        B=C;
        C=A;
        A=D;
        D=Aux;
        System.out.println("A vale = "+A+" B vale = "+B+" C vale = "+C+" D vale = "+D);
    }
}
