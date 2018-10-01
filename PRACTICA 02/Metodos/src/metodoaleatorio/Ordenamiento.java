package metodoaleatorio;

public class Ordenamiento {
    //QuickShort
    //Burbuja
    //Insercion
    //Shell

    public int[] DevuelveArreglo(int nValores, int nMinimo, int nMaximo) {
        int[] numeros = new int[nValores];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = DevuelveNumerosAleatorio(nMinimo, nMaximo);
        }
        return numeros;
    }

    private int DevuelveNumerosAleatorio(int nMinimo, int nMaximo) {
        int nValorDevuelto = 0;
        nValorDevuelto = (int) (Math.random() * (nMaximo - nMinimo));
        return nValorDevuelto;
    }

    public static void QuickSort(int[] vector, int izquierda, int derecha) {
        int pivote, i, auxintercambio, j;
        pivote = vector[izquierda];
        i = izquierda;
        j = derecha;
        auxintercambio = 0;

        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxintercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxintercambio;
            }
        }

        vector[izquierda] = vector[j];
        vector[j] = pivote;

        if (izquierda < j - 1) {
            QuickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            QuickSort(vector, j + 1, derecha);
        }
    }

    public static void Burbuja(int vector[]) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = temp;
                }
            }
        }
    }

    public static void Shell(int vector[]) {
        int salto, aux, i;
        boolean cambios;
        for (salto = vector.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) { 
                cambios = false;
                for (i = salto; i < vector.length; i++) { 
                    if (vector[i - salto] > vector[i]) { 
                        aux = vector[i]; 
                        vector[i] = vector[i - salto];
                        vector[i - salto] = aux;
                        cambios = true; 
                    }
                }
            }
        }
    }

    public static void Insercion(int vector[]) {
         int i, j;
        int aux;
        for (i = 1; i < vector.length; i++){ 
            aux = vector[i]; 
            j = i - 1; 
            while ((j >= 0) && (aux < vector[j])){                                            
               vector[j + 1] = vector[j];      
                j--;                  
            }
            vector[j + 1] = aux;
        }
    }
}
