/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDobleCircular;
import listas.*;
/**
 *
 * @author isidro
 */
public class ListaDobleCircular extends ListaSimple{
    //Mostrar
    public String mostrar(){
        if(listaVacia()) return "";
        String cad = "";
        
        for(NodoSimple TMP = INI; TMP!=null; TMP = TMP.sig){
            cad += TMP.valor+"-->";
        }
        return cad;
    }
}
