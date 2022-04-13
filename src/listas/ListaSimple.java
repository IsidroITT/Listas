package listas;

/**
 *
 * @author isidro
 *
 * Lista simple tiene 1 solo puntero (SIG) su metodo de trabajo es PEPS
 *
 * 2 variables de administracion: -INI = Primer nodo (borrar) -FIN = Ultimo nodo
 * (insertar)
 */
public class ListaSimple {

    NodoSimple INI, FIN;

    public ListaSimple() {
        INI = null;
        FIN = null;
    }//constructor
    
    //Metodos de estado
    private boolean listaVacia() {
        return INI == null && FIN == null;
    }
    private boolean ultimoNodo() {
        return INI == FIN;
    }

    //Operaciones de alteracion
    public boolean insertar(char valor) {
        NodoSimple NUEVO = new NodoSimple(valor);
        //Lista "llena"
        if (NUEVO == null) return false; //Cuando no hay memoria para hacer la insercion NUEVO pasa directo a ser null
        
        //Enlace
        //2 situaciones: 1) vacia  2) existe almenos 1 nodo en la lista
        //Caso 1: Lista vacia
        if (INI == null && FIN == null) {
            INI = FIN = NUEVO;
            return true;
        }
        //Caso 2: 
        FIN.sig = NUEVO;//Enlazamos el ultimo nodo con el nuevo
        FIN = NUEVO;//cambiamos a FIN al nuevo nodo, que tras el enlace, se comvierte en el ULTIMO
        return true;
    }
    public boolean eliminar() {
        if (listaVacia()) return false;
        NodoSimple TMP = INI;
        if (ultimoNodo()) {
            INI = FIN = null; //Se generan condiciones iniciales
            TMP = null;
            return true;
        }//hay 2 o mas nodos
        INI = INI.sig;
        TMP.sig = null;
        TMP = null;
        return true;
    }
    
    //Mostrar
    public String mostrar(){
        if(listaVacia()) return "";
        String cad = "";
        
        for(NodoSimple TMP = INI; TMP!=null; TMP = TMP.sig){
            cad += TMP.valor+"-->";
        }
        return cad;
    }
    
    //Codigo de modificar
    public boolean modificarNodo(char nodoModificar, char valorNuevo){
        NodoSimple TMP = buscarNodo(nodoModificar) ;
        if(TMP == null) return false;
        TMP.valor= valorNuevo;
        return true;
    }
    
    private NodoSimple buscarNodo(char busca){
        for(NodoSimple TMP = INI; TMP!=null; TMP = TMP.sig){
            if(TMP.valor == busca)
                return TMP;
        }
        return null;
    }
}//class
