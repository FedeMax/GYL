package ej11enadelante;

public class punto21 {

    public static void main(String[] args) {

        int mgrande[][] = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] mchica = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int i = 0;
        int ichica = 0;
        int j = 0;
        int jchica = 0;
        int contador = 0;

        do {
            //System.out.print(mgrande[i][j]+" ");
            if (mgrande[i][j] == mchica[ichica][jchica]) {
                j++;
                jchica++;
                if(jchica==3){
                    ichica++;
                    jchica=0;
                    System.out.println("La matriz chica aparece en Fila "+i+ " columna "+ (j-3));
                    System.out.println("La matriz chica aparece en Fila "+i+ " columna "+ (j-2));
                    System.out.println("La matriz chica aparece en Fila "+i+ " columna "+ (j-1));
                    i++;j=0;
                    
                }
            } else {
                j++;
                if (j > 9 ) {
                    i++;
                    j = 0;
                    jchica=0;
                   // System.out.println("");
                }
            }
        } while (i < 10 && ichica<3);

    }
}
