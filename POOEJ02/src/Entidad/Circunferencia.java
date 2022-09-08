/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
package Entidad;
 */
package Entidad;

import java.util.Scanner;

public class Circunferencia {

    private double radio;
    Scanner leer = new Scanner(System.in);

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double crearCincurferencia() {
        System.out.println("Ingrese el radio ");
        radio = leer.nextDouble();
        return radio;
    }

    public double area() {
        double circuloarea = radio * 3.14;
        return circuloarea;
    }
    
    public double perimetro(){
        double circuloperimetro = 2*3.14*radio;
        return circuloperimetro;
    }
}
