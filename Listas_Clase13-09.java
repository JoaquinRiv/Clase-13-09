
package listas;

import java.util.ArrayList;
import java.util.Collections;


public class Listas {

    
    public static void main(String[] args) {
        //01 crear ArrayList con el tipo de dato que maneja
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("hola");
        cadenas.add("como");
        cadenas.add("estas");
        
        
        
        //02 para saber largo del Array
        //System.out.println(cadenas.size());
        //03 para mostrar elementos del Array
        //System.out.println(cadenas);
        //04 para eliminar elemento del Array
        //cadenas.remove(0);
        //05 para eliminar todos elementos de un Array
        //cadenas.clear();
        //System.out.println(cadenas);
        //06 traer elementos del Array
        //System.out.println(cadenas.get(0)+ " " + cadenas.get);
        //07 traer los elementos del Array
        //for (int i = 0; i < cadenas.size(); i++){
            //System.out.println(cadenas.get(i));
        //}
        
        //08 traer elementos del Array
        
//        for(String temp : cadenas){
//            System.out.println(temp);
//        }

        //09 ordenar alfabeticamente
//        Collections.sort(cadenas);
//        for (String temp : cadenas){
//            System.out.println(temp);
//        }
        //10 ordenar numeros mayor a menor
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(-2);
        
        System.out.println(numeros);
        Collections.sort(numeros);
        numeros.remove(0);
        System.out.println(numeros);
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
