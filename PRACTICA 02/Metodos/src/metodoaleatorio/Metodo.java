package metodoaleatorio;

import javax.swing.JOptionPane;

public class Metodo {

    public static void main(String[] args) {

        //Numeros de datos : 1 000000 , 750 000 , 500000 , 250000,100000,50000,25000,1000
        int cantidad = 0;
        int seleccion = 0;

        do {
            do {
                try {
                    seleccion = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de datos: \n "
                            + "1.- 1000                     6.- 500000   \n"
                            + "2.- 25000                    7.- 750000   \n"
                            + "3.- 50000                    8.- 1000000  \n"
                            + "4.- 100000                   9.- Salir    \n"
                            + "5.- 250000                                \n "
                            + "Ingrese una opcion: "));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Solo numeros", "Excepcion !!!", JOptionPane.WARNING_MESSAGE);
                }
            } while (seleccion > 9);
        } while (seleccion <= 0);

        switch (seleccion) {
            case 1:
                cantidad = 1000;
                break;
            case 2:
                cantidad = 25000;
                break;
            case 3:
                cantidad = 50000;
                break;
            case 4:
                cantidad = 100000;
                break;
            case 5:
                cantidad = 250000;
                break;
            case 6:
                cantidad = 500000;
                break;
            case 7:
                cantidad = 750000;
                break;
            case 8:
                cantidad = 1000000;
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Gracias ...", "Saliendo ... ", JOptionPane.QUESTION_MESSAGE);
                System.exit(0);
                break;
            default:
        }

        int nCantidadDatos = cantidad;
        int nValorMinimo = 0;
        int nValorMaximo = 10000000;

        int[] oArreglo = new int[nCantidadDatos];

        Ordenamiento oClsOrdenamiento = new Ordenamiento();

        oArreglo = oClsOrdenamiento.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);

        //Ordenamiento por QuickSort
        long nIncioTiempo = System.currentTimeMillis();
        Ordenamiento.QuickSort(oArreglo, 0, oArreglo.length - 1);
        long nRetardo = System.currentTimeMillis() - nIncioTiempo;

        //Ordenamiento por Burbuja
        long nIncioTiempo2 = System.currentTimeMillis();
        Ordenamiento.Burbuja(oArreglo);
        long nRetardo2 = System.currentTimeMillis() - nIncioTiempo2;

        //Ordenamiento Shell
        long nInicioTiempo3 = System.currentTimeMillis();
        Ordenamiento.Shell(oArreglo);
        long nRetardo3 = System.currentTimeMillis() - nInicioTiempo3;

        //Ordenamiento Insercion
        long nInicioTiempo4 = System.currentTimeMillis();
        Ordenamiento.Insercion(oArreglo);
        long nRetardo4 = System.currentTimeMillis() - nInicioTiempo4;

        JOptionPane.showMessageDialog(null,
                "------------------------------------------------" + "\n"
                + "| Cantidad de Registros:      " + cantidad + " | " + "\n"
                + "------------------------------------------------" + "\n"
                + "| Metodos       " + " | " + "Tiempos                      |" + "\n"
                + "|-------------------------------------------------|" + "\n"
                + "| Quicksort           |   " + nRetardo + " milisegundos   |" + "\n"
                + "| Burbuja             |   " + nRetardo2 + " milisegundos   |" + "\n"
                + "| Shell               |   " + nRetardo3 + " milisegundos   |" + "\n"
                + "| Insercion           |   " + nRetardo4 + " milisegundos   |" + "\n"
                + "--------------------------------------------", "TABLA DE TIEMPOS ...", JOptionPane.INFORMATION_MESSAGE);

    }

}
