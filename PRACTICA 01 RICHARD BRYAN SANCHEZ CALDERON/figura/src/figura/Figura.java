
package figura;
import java.io.*;


public class Figura implements figuraInterface{
        /*cuando una clase impementa una interfaz esta obligada a cumplir todos
        los contratos de la interfaz*/
   
    public static void main(String[] args) {
        int a=0;
        int b[]=new int[5];
        double area=0;
        //tipo de datos nombre_variable=paabra reservada(new) tipo de dato (alcance)
        Figura ofigura = new Figura();
        circulo ocirculo = new circulo();
        ocirculo.set_Radio(5);
        
        area=ofigura.Calculoarea(ocirculo);
        System.out.println("El area es: "+area);
                
        
    }

    
    public double Calculoarea(Object obj) {
        double area=0;
       // System.out.println(obj.getClass().getSimpleName());
       switch (obj.getClass().getSimpleName()){
           case "circulo":
               /*convierte el objeto obj recibido por parametro en
               la clase instanciada circulo*/
               circulo ocirculo = (circulo) obj;
               area=circulo.PI*Math.pow(ocirculo.get_Radio(), 2);
               break;
            case "Triangulo":
                triangulo triangulo = (triangulo) obj;
                area = triangulo.getBase() * triangulo.getAltura() / 2;
                break;
            case "Rectangulo":
                rectangulo rectangulo = (rectangulo) obj;
                area = rectangulo.getBase() * rectangulo.getAltura();
                break;
           default:
               
       }
       
       return area;
        
 
    }
    
}
