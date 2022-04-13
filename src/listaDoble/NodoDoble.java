/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaDoble;

/**
 *
 * @author isidro
 */
public class NodoDoble {
    char dato;
    NodoDoble sig;
    NodoDoble ant;
    
    public NodoDoble(char valor){
        dato = valor;
        sig = null;
        ant = null;
    } 
}
