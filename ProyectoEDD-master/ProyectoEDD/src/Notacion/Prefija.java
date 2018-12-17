package Notacion;

import Metodos.Metodos;
import Lista.Pila;

/**
 *
 * @author CJ
 */

public class Prefija extends Metodos {
    
    public static void main(String[] args) {
        raizInfija("(A+B)/(C-D)"); // Test
    }
    
    //Metodo para la conversion de una expresion Infija a Prefija
    public static void raizInfija(String expresion){
        Pila pila = new Pila();
        Pila expPre = new Pila();
        char[] ExpInf = expInf(expresion);
        
        for(int x = ExpInf.length -1 ; x >= 0 ; x--) {
            char simbolo = ExpInf[x];
            if(simbolo == ')') {
               pila.Agregar(simbolo);
            } else if (simbolo == '(') {
                while (pila.DatoTope() != ')') {
                    expPre.Agregar(pila.DatoTope());
                    pila.Quitar();
                }
                pila.Quitar();
            } else if(EsOperando(simbolo)) {
                expPre.Agregar(simbolo);
            } else {
                while (!pila.Vacio() && Precedencia(simbolo) <= Precedencia(pila.DatoTope())) {
                    expPre.Agregar(pila.DatoTope());
                    pila.Quitar();
                }
                pila.Agregar(simbolo);
            }
        }
        
        while(!pila.Vacio()) {
            expPre.Agregar(pila.DatoTope());
            pila.Quitar();
        }
        
        System.out.println(DatosPila(expPre));
    }
    
}
