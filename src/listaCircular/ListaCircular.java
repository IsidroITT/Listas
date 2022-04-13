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
   public boolean listaVacia(){
       return INI == null && FIN == null;
   }
   
   //Insertar
   
   //Eliminar
   
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
       }while(TMP != FIN);
       return cad;
   }   
}
