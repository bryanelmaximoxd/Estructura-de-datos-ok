package Preguntas;

public class Random {

    public int aleatorio = 0;
    private final String banco_pregunta[] = {
        "¿Cuántos métodos posee una cola?",
        "Es una estructura en donde los elementos son insertados y retirados del inicio",
        "Es un árbol en el que ningún nodo puede tener más de dos subárboles",
        "Es una estructura de datos que utiliza iteradores para buscar un elemento ordenado en la estructura",
        "Es un árbol binario lleno en la que todas las hojas están a la misma profundidad.",
        "Son secuencias de elementos almacenado en una lista encadenada",
        "La clase Stack posee",
        "Es la operación que se utiliza para insertar un dato en la pila",
        "Se conoce como estructura LIFO",
        "Se emplea el método para retirar un elemento que esta frente de la cola",
        "Es una estructura en donde los elementos son insertados y retirados del tope",
        "Se conoce como estructura FIFO"};

    String alternativas[][] = {{"4", "5", "6"},
    {"Colas", "Listas", "Pilas",},
    {"Arbol Binario", "Arbol General", "Bosque"},
    {"Colas", "Listas", "Arbol Binario"},
    {"Arbol Binario Lleno", "Árbol Binario Perfecto", "N.a."},
    {"Listas", "Pilas", "Colas"},
    {"Un constructor y 5 metodos", "Dos constructores y 3 metodos", "Un constructor y 2 metodos"},
    {"Top", "Push", "Insert"},
    {"Pilas", "Colas", "Listas"},
    {"Remover", "Push", "Pop"},
    {"Pilas", "Colas", "Listas"},
    {"Listas", "Colas", "Arbol"}};

    String respuestas[] = {"c", "a", "a", "b", "b", "a", "a", "b", "a", "c", "a", "b"};

    public String Aleatorio() {
        String A[] = new String[3];
        int B[] = new int[A.length];
        int dado;

        for (int i = 0; i < B.length; i++) {
            int estado = 0;
            if (i == 0) {
                dado = (int) (Math.random() * A.length);
                B[i] = dado;
            } else {
                int k = 0;
                do {
                    dado = (int) (Math.random() * A.length);
                    while (k < i) {
                        if (dado != B[k]) {
                            estado++;
                        }
                        k++;
                    }
                    if (estado == i) {
                        B[i] = dado;
                    } else {
                        estado = 0;
                        k = 0;
                    }
                } while (estado != i);
            }
            aleatorio = B[i];
//            System.out.println(banco_pregunta[aleatorio] );
            

        }
        return banco_pregunta[aleatorio];
    }

}
