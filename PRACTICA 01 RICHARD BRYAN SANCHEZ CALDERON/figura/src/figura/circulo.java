/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Cecomp
 */
public class circulo {
    //propiedades
    private int radio;
    //metodo estatico que no cambia en el tiempo
    public static double PI=3.141516; 
    
    //metodos
    public void set_Radio(int value){
        this.radio = value;
        
    }
    public int get_Radio(){
        return this.radio;
    }    
        
}
