/*
 * Realizar una lista doble circular con  
 */
package listaDobleCircular;
import listaDoble.NodoDoble;
/**
 *
 * @author isidro
 */
public class ListaDobleCircular{
    NodoDoble INI, FIN;
    
    public ListaDobleCircular(){
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
   public boolean insertarINI(char dato){
      NodoDoble NUEVO = new NodoDoble(dato);
      if(NUEVO == null) return false; //Lista "llena"
      if(listaVacia()) {
        INI=FIN=NUEVO;
        INI.ant = FIN;
        FIN.sig = INI;
        return true;}
      INI.ant = NUEVO;
      NUEVO.sig = INI;
      INI =NUEVO;
      INI.ant = FIN;
      FIN.sig = INI;
      return true;
   }
   
   public boolean insertarFIN(char dato){
      NodoDoble NUEVO = new NodoDoble(dato);
      if(NUEVO == null) return false; //Lista "llena"
      if(listaVacia()) {
        INI=FIN=NUEVO;
        INI.ant = FIN;
        FIN.sig = INI;
        return true;}
      FIN.sig = NUEVO;
      NUEVO.ant = FIN;
      FIN = NUEVO;
      INI.ant = FIN;
      FIN.sig = INI;
      return true;
   }
   //Eliminar
   public boolean eliminarINI(){
        if (listaVacia()) return false;
        if (ultimoNodo()) {
            INI = FIN = null;
            return true;
        }//hay 2 o mas nodos
        INI.ant = null;
        INI = INI.sig;
        INI.ant.sig = null;
        INI.ant = FIN;
        FIN.sig = INI;
        return true;
   } 

   public boolean eliminarFIN(){
       if (listaVacia()) return false;
        NodoDoble TMP = FIN;
        if (ultimoNodo()) {
            INI = FIN = null; //Se generan condiciones iniciales
            TMP = null;
            return true;
        }//hay 2 o mas nodos
        FIN.sig = null;
        FIN = FIN.ant;
        FIN.sig.ant = null;
        FIN.sig = INI;
        INI.ant = FIN;
        return true;
   }
   //Modificar
   public boolean modificar(char buscaNodo, char valorMod){
       if(listaVacia()) return false;
       
       NodoDoble MOD= busca(buscaNodo);
       if(MOD == null) return false;
       MOD.dato = valorMod;
       return true;
   }
   
   private NodoDoble busca(char busca){
       NodoDoble TMP = INI;
       if(TMP.dato == busca) return TMP;
       do{
           TMP = TMP.sig;
           if(TMP.dato == busca) return TMP;
       }while(TMP.sig != INI);
       return null;
   }
   //Mostrar
   public String mostrar(){
       if(listaVacia()) return "";
       String cad = "";
       NodoDoble TMP = INI;
       cad += TMP.dato+"<-->";
       do{
           TMP = TMP.sig;
           cad += TMP.dato+"<-->";
       }while(TMP != FIN);
       return cad;
   }
}
