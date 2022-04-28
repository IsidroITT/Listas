/*
 * Realizar una lista doblemente enlazada, con las funciones de 
 * Insertar INI -L-
 * Insertar FIN -L-
 * Eliminar INI -L-
 * Eliminar FIN -L-
 * Modificar    -L-
 * Mostrar      -L-
 */
package listaDoble;

/**
 *
 * @author isidro
 */
public class ListaDoble {
  NodoDoble INI, FIN; 

  public ListaDoble (){
      INI = FIN = null;
  }//Constructor

  //Metodos de estado
  public boolean listaVacia(){
      return INI == null && FIN == null;
  }

  public boolean ultimoNodo(){
      return INI == FIN;
  }
  //Insertar
  public boolean insertarINI(char dato){
      NodoDoble NUEVO = new NodoDoble(dato);
      if(NUEVO == null) return false; //Lista "llena"
      if(listaVacia()) {
        INI=FIN=NUEVO;
        return true;}
      INI.ant = NUEVO;
      NUEVO.sig = INI;
      INI =NUEVO;
      return true;
  }

  public boolean insertarFIN(char dato){
      NodoDoble NUEVO = new NodoDoble(dato);
      if(NUEVO == null) return false; //Lista "llena"
      if(listaVacia()) {
        INI=FIN=NUEVO;
        return true;}
      FIN.sig = NUEVO;
      NUEVO.ant = FIN;
      FIN = NUEVO;
      return true;
  }
  
  public boolean insertarPosN(int pos, char dato){
      NodoDoble NUEVO = new NodoDoble(dato);
      NodoDoble TMP = buscaPos(pos);
      if(NUEVO == null || TMP == null) return false;
      if(ultimoNodo()){
          INI.ant = NUEVO;
          NUEVO.sig = INI;
          INI = NUEVO;
          return true;
      }
      NUEVO.sig = TMP;
      NUEVO.ant = TMP.ant;
      TMP.ant = NUEVO;
       NUEVO.ant.sig = NUEVO;
      return true;
  }
  
  private NodoDoble buscaPos(int pos){
      int numNodos = 1;
      for(NodoDoble TMP = INI; TMP != null; TMP = TMP.sig){
          if(numNodos==pos) return TMP;
          numNodos++;
      }
      return null;
  }
  //Eliminar
  public boolean eliminarINI(){
      if (listaVacia()) return false;
        NodoDoble TMP = INI;
        if (ultimoNodo()) {
            INI = FIN = null; //Se generan condiciones iniciales
            TMP = null;
            return true;
        }//hay 2 o mas nodos
        INI = TMP.sig;
        TMP.sig = null;
        INI.ant = null;
        TMP = null;
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
        FIN = TMP.ant;
        TMP.ant = null;
        FIN.sig = null;
        TMP = null;
        return true;
  }

   //Mostrar
    public String mostrarINIaFIN(){
        if(listaVacia()) return "";
        String cad = "";
        
        for(NodoDoble TMP = INI; TMP!=null; TMP = TMP.sig){
            cad += TMP.dato+"<-->";
        }
        return cad;
    }
    
    public String mostrarFINaINI(){
        if(listaVacia()) return "";
        String cad = "";
        
        for(NodoDoble TMP = FIN; TMP!=null; TMP = TMP.ant){
            cad += TMP.dato+"<-->";
        }
        return cad;
    }
    
    //Codigo de modificar
    public boolean modificarNodo(char nodoModificar, char valorNuevo){
        NodoDoble TMP = buscarNodo(nodoModificar) ;
        if(TMP == null) return false;
        TMP.dato= valorNuevo;
        return true;
    }
    
    private NodoDoble buscarNodo(char busca){
        for(NodoDoble TMP = INI; TMP!=null; TMP = TMP.sig){
            if(TMP.dato == busca)
                return TMP;
        }
        return null;
    }
}
