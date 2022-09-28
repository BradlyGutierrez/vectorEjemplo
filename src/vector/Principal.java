/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector;
import java.util.Vector;
/**
 *
 * @author bradl
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
         // TODO code application logic here
         
            //Formas de crear un vector 
    //Vector vector1 = new Vector();//Se crea un vector vacio 
    //Vector vector2 = new Vector(20);//Asginar tamaño a un vector
    //Vector vector3 = new Vector(vector2); //Crear un vector a partir de otro vector
    
    //Los vectores pueden tener tipos: 
    Vector <String> vector4 = new Vector();
    /*
    //Los vectores poseen métodos para:
        //Agregar elementos:
        vector4.addElement("HOla");
        vector4.addElement("mundo");
        
        //También se puede agregar un elemento en una posicion determinada
        //vector2.insertElementAt(2, 1);
        
        //ACCEDER A UN VECTOR
        System.out.println(vector4.get(0));//Devuelve un elemento marcandole un index 
        System.out.println(vector4.size());//Cantidad de elementos que tenemos
        System.out.println(vector4.elementAt(2)); //Devuelve el elemento en la posicion 2
        
        //Eliminar 
        vector4.removeElementAt(0); //ELimina un dato en la posición indicada
        vector4.removeElement("AJ"); //Elimina el elemento
        vector4.removeAll(vector4); //ELimina todo el vector
        
        //Operaciones
        System.out.println(vector4.contains("AJ"));//verifica si un vector contiene un objeto
        System.out.println(vector4.indexOf("mundo"));//Devuelve el indice del dato
        */
        vector4.addElement("Andre");
        vector4.addElement("Harry");
        vector4.addElement("Eliseo");
        vector4.addElement("Bradly");
        
        for(int i = 0; i < vector4.size(); i++){
            System.out.println(vector4.get(i));
        }
        
        
        vector4.removeAll(vector4);
        for(int i = 0; i < vector4.size(); i++){
            System.out.println(vector4.get(i));
        }
       
    }
    
   
}
