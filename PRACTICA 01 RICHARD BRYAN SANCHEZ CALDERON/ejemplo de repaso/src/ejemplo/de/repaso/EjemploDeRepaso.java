
package ejemplo.de.repaso;

import javax.swing.*;
public class EjemploDeRepaso {
    private static int n_estud = 0;
    private static String[] lista_nomb;
    private static int[] lista_edad;
 

    public static void main(String[] args) {

        
        boolean fallo = registro_num();
        if(!fallo){
            lista_nomb= new String[n_estud];
            lista_edad = new int [n_estud];
            int registro_estud=0;
            
            do{
                fallo=registro_nomb(registro_estud);
                if(!fallo){
                    fallo=registro_edad(registro_estud);
                    if(!fallo){
                        registro_estud++;
                    }
                }
            }while (registro_estud<n_estud && !fallo);
            
            if (!fallo){
                String mensaje = "";
                mensaje += lista_estud();
                mensaje += lista_edad_mayor_menor();
                mensaje_result(mensaje);
                
            }else{
                mensaje_cancelar();
            }
        }else{
            mensaje_cancelar();
        }
        
    }
    private static boolean registro_num(){
        boolean exit = false;
        boolean comprobacion = false;
        do{
            String n_estudTmp=JOptionPane.showInputDialog("ingrese el numero de estudiantes:");
            if (n_estudTmp==null){
                exit=true;
                
            }else if(n_estudTmp.equals("")){
                JOptionPane.showMessageDialog(null, "ningresa solo un nombre!");
            }else if (!EsEntero(n_estudTmp)){
                n_estud=Integer.parseInt(n_estudTmp);
                if(n_estud>0){
                    comprobacion=true;
                }else{
                    mensaje_mayoracero();
                }
            }else{
                mensaje_datosentero();
            }
        }while(!comprobacion && !exit);
        return exit;
    }
    
        private static boolean registro_nomb(int registro_estud) {
        boolean comprobacion = false;
        boolean exit = false;
        do {
            String nombreEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del Estudiante  [" + (registro_estud + 1) + "]:");
            if (nombreEstudiante == null) {
                exit = true;
            } else if (nombreEstudiante.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa solo un nombre!");
            } else if (!EsEntero(nombreEstudiante)) {
                if (nombreEstudiante.matches("[A-Za-z]*")) {
                    lista_nomb[registro_estud] = nombreEstudiante;
                    comprobacion = true;
                } else {
                    mensaje_nombreinvalido();
                }
            } else {
                mensaje_datosletras();
            }

        } while (!comprobacion && !exit);
        return exit;
    }
    
    private static boolean registro_edad(int registro_estud){
        boolean comprobacion = false;
        boolean exit = false;
        do {
            String edad_estudTmp = JOptionPane.showInputDialog("Ingrese la edad del Estudiantes [" + (registro_estud + 1) + "]:");
            int edad_estud;
            if (edad_estudTmp == null) {
                exit = true;
            } else if (edad_estudTmp.equals("")) {
                JOptionPane.showMessageDialog(null, "Ingresa la edad!");
            } else if (EsEntero(edad_estudTmp)) {
                edad_estud = Integer.parseInt(edad_estudTmp);
                if (edad_estud > 0) {
                    lista_edad[registro_estud] = edad_estud;
                    comprobacion = true;
                } else {
                    mensaje_mayoracero();
                }
            } else {
                mensaje_datosentero();
            }
        } while (!comprobacion && !exit);
        return exit;
    }
    
    private static String lista_estud() {
        String mensaje = "\n-- Listado de Estudiantes --\n";
        for (int x = 0; x < lista_nomb.length; x++) {
            mensaje += "Estudiante [" + (x + 1) + "]: " + lista_nomb[x] + " - " + lista_edad[x] + " años\n";
        }
        return mensaje;
    }
    
    private static String lista_edad_mayor_menor() {
        String mensaje = "";
        int menor = 99999;
        int mayor = 0;
        int suma_edad = 0;
        double promedio;

        for (int edad_estud : lista_edad) {
            if (edad_estud > mayor) {
                mayor = edad_estud;
            }
            if (edad_estud < menor) {
                menor = edad_estud;
            }
            suma_edad += edad_estud;
        }
        promedio = (double) suma_edad / lista_edad.length;
        mensaje += "----------------------------\n";
        mensaje += "La edad mayor es: " + mayor + " años\n";
        mensaje += "La edad menor es: " + menor + " años\n";
        mensaje += "La suma total es: " + suma_edad + "\n";
        mensaje += "El promedio es: " + String.format("%.2f", promedio) + "\n";
        mensaje += "----------------------------\n";
        mensaje += Lista_multiplosdesiete();
        return mensaje;
    }
    
    private static String Lista_multiplosdesiete() {
        String mensaje = "";
        String mensajeTmp = "";
        int multiplo = 1;
        for (int x = 0; x < lista_edad.length; x++) {
            if (EsMultiploSiete(lista_edad[x])) {
                mensajeTmp += "[" + (multiplo) + "].  " + lista_edad[x] + "\n";
                multiplo++;
            }
        }
        if (mensajeTmp.equals("")) {
            mensaje += "No hay multiplos de 7\n";
        } else {
            mensaje += "-- Multiplos de 7 --\n" + mensajeTmp;
        }
        return mensaje;

    }

    private static boolean EsMultiploSiete(int numero) {
        boolean multiplo = false;
        if (numero > 0) {
            multiplo = (numero % 7 == 0);
        }
        return multiplo;
    }

    private static boolean EsEntero(String dato) {
        boolean verificacion = true;
        try {
            Integer.parseInt(dato);
        } catch (Exception e) {
            verificacion = false;
        }
        return verificacion;
    }
    
    private static void mensaje_result(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private static void mensaje_nombreinvalido() {
        JOptionPane.showMessageDialog(null, "Nombre no valido!");
    }

    private static void mensaje_datosentero() {
        JOptionPane.showMessageDialog(null, "Solo puede ingresar datos enteros!");
    }

    private static void mensaje_datosletras() {
        JOptionPane.showMessageDialog(null, "Solo puede ingresar letras");
    }

    private static void mensaje_mayoracero() {
        JOptionPane.showMessageDialog(null, "Ingresa un # mayor a 0");
    }

    private static void mensaje_cancelar() {
        JOptionPane.showMessageDialog(null, "Acabas de cancelar ...");
    }
}
