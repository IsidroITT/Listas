/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaCircular;
import listas.NodoSimple;

/**
 *
 * @author isidro
 */
public class ListaCircular {
   NodoSimple INI, FIN;
   
   public ListaCircular(){
       INI = FIN = null;
   }
   //Metodos de estado
   private boolean listaVacia(){
       return INI == null && FIN == null;
   }
   
   private boolean ultimoNodo(){
       return INI == FIN;
   }
   //Insertar
   public boolean insertar(char dato){
       NodoSimple NUEVO = new NodoSimple(dato);
       if (NUEVO == null) return false; //Lista "llena"
       if(listaVacia()){ //Primer nodo
           INI = FIN = NUEVO;
           FIN.sig = INI;
           return true;
       }
       FIN.sig = NUEVO;
       FIN = NUEVO;
       FIN.sig = INI;
       return true;
   }
   //Eliminar
   public boolean eliminar(){
       if(listaVacia()) return false;
       if(ultimoNodo()){
           FIN.sig = null; //Desenlazamos
           INI = FIN = null;
       }
       NodoSimple TMP = INI;
       INI = TMP.sig;
       TMP.sig = null;
       FIN.sig = INI;
       return true;
   }    
   //Modificar
   public boolean modificar(char buscaNodo, char valorMod){
       if(listaVacia()) return false;
       
       NodoSimple MOD= busca(buscaNodo);
       if(MOD == null) return false;
       MOD.valor = valorMod;
       return true;
   }
   
   private NodoSimple busca(char busca){
       NodoSimple TMP = INI;
       do{
           if(TMP.valor == busca) return TMP;
           TMP = TMP.sig;
       }while(TMP != FIN);
       return null;
   }
   //Mostrar
   public String mostrar(){
       if(listaVacia()) return "";
       String cad = "";
       NodoSimple TMP = INI;
       do{
           cad += TMP.valor+"-->";
           TMP = TMP.sig;
       }while(TMP != INI);
       return cad;
   }   
}
