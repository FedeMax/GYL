//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    private ArrayList<Alumno> lista;
    private Scanner leer;

    public AlumnoService() {
        this.lista = new ArrayList<>();
        this.leer = new Scanner(System.in);
    }

    public void crearLista() {
        ArrayList<Integer> notas = new ArrayList<>();
        int continuar = 2;
        System.out.println("Ingrese los datos del Alumno");
        System.out.println("Alumno: ");
        String nombre = leer.next();
        System.out.println("Ingrese las tres notas");
        for (int i = 0; i < 3; i++) {
            notas.add(leer.nextInt());
        }
        lista.add(new Alumno(nombre,notas));

        System.out.println("Desea ingresar otro alumno");
        System.out.println("1)si \n 2)no");
        continuar = leer.nextInt();
        while (continuar==1) {
            crearLista();
        }
    }
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.

    public void notaFinal(String nombre) {

        Iterator<Alumno> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El promedio del alumno es :"+promedio(nombre));
                
            } else {
                System.out.println("Algo salio mal");
            }
        }
    }
    
    public void mostrarlista(){
        for (Alumno alumno : lista) {
            System.out.println("Alumno N° : "+alumno);
        }
    }

    public int promedio(String nombre) {
       int sumador=0;
       int notas=0 ;
        for (Alumno alumno : lista) {
        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
            for (int i = 0; i < 3; i++) {
                sumador+=alumno.getNotas().get(i);
            }
            notas = sumador/3;
        }
        }
            return notas;
    }
}
