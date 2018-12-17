package Metodos;

import Lista.Pila;

/**
 *
 * @author CJ
 */

public class Metodos {
    
    protected static char[] expInf(String expresion) {
        int n = expresion.length();
        char[] expreInf = new char[n];
        for (int x = 0; x < n; x++) {
            expreInf[x] = expresion.charAt(x);
        }
        return expreInf;
    }

    protected static boolean EsOperando(char simbolo) {
        boolean r = false;
        String operando = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (int x = 0; x < operando.length(); x++) {
            if (simbolo == operando.charAt(x)) {
                r = true;
                break;
            }
        }
        return r;
    }

    protected static String DatosPilaInvertido(Pila a) {
        String rTmp = "";
        String r = "";
        while (!a.Vacio()) {
            rTmp += String.valueOf(a.DatoTope());
            a.Quitar();
        }
        for (int x = rTmp.length() - 1; x >= 0; x--) {
            r += String.valueOf(rTmp.charAt(x));
        }
        return r;
    }
    protected static String DatosPila(Pila a) {
        String rTmp = "";
        while (!a.Vacio()) {
            rTmp += String.valueOf(a.DatoTope());
            a.Quitar();
        }

        return rTmp;
    }

    protected static int Precedencia(char operador) {
        int r = 0;
        switch (operador) {
            case '^':
                r = 3;
                break;
            case '*':
                r = 2;
                break;
            case '/':
                r = 2;
                break;
            case '+':
                r = 1;
                break;

            case '-':
                r = 1;
                break;
        }
        return r;
    }

}
