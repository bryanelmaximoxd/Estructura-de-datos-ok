package Notacion;
import Metodos.Metodos;
import Lista.Pila;
import java.util.Scanner;



public class PostFija extends Metodos {
    
    public static String Temp;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese espresion:");
        Temp = leer.nextLine();
        raizInfija(Temp); // Test
        
    }
    
    //Metodo para la conversion de una expresion Infija a PostFija
    public static void raizInfija(String expresion) {
        Pila pila = new Pila();
        Pila expPos = new Pila();
        char[] ExpInf = expInf(expresion);
        
        for(char simbolo : ExpInf) {
            if(simbolo == '(') {
                pila.Agregar(simbolo);
            } else if(simbolo == ')') {
                while (pila.DatoTope() != '(') {
                    expPos.Agregar(pila.DatoTope());
                    pila.Quitar();
                }
                pila.Quitar();
            } else if(EsOperando(simbolo)) {
                expPos.Agregar(simbolo);
            } else {
                while(!pila.Vacio() && Precedencia(simbolo) <= Precedencia(pila.DatoTope())) {
                    expPos.Agregar(pila.DatoTope());
                    pila.Quitar();
                }
                pila.Agregar(simbolo);
            }
        }
        
        while(!pila.Vacio()) {
            expPos.Agregar(pila.DatoTope());
            pila.Quitar();
        }
        
        System.out.println(DatosPilaInvertido(expPos));
        
        
    }
    
    

    
    
    
    
    
    
    
}
