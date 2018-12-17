package Lista;

/**
 *
 * @author CJ
 */

public class Pila {

    char datos[];
    int tope;

    public Pila() {
        this.datos = new char[50];
        this.tope = -1;
    }

    public void Agregar(char dato) {
        if (tope < datos.length) {
            tope++;
            datos[tope] = dato;
        } else {
            System.out.println("Pila llena");
        }
    }

    public void Quitar() {
        if (tope >= 0) {
            datos[tope] = '\0';
            tope--;
        } else {
            System.out.println("Pila vacia");
        }
    }

    public char DatoTope() {
        if (tope >= 0) {
            return datos[tope];
        } else {
            System.out.println("Pila vacia");
        }
        return 0;
    }

    public boolean Vacio() {
        return tope == -1;
    }

}
