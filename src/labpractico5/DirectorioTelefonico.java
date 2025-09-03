/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labpractico5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author patri
 */
public class DirectorioTelefonico {
    
    public  TreeMap<Long,Cliente> directorio;

    public DirectorioTelefonico() {
        this.directorio=new TreeMap();
    }
    
    public void agregarContacto(Long numero , Cliente cliente){
        
        directorio.put(numero, cliente);
    }
    public Cliente buscarContacto(Long numero){
        
     if(directorio.containsKey(numero)){
         return directorio.get(numero);
     } 
     return null;
}
    public Set buscarTelefono(String apellido){
        Set<Long> listaNumeros = new HashSet();
        for(Map.Entry<Long,Cliente>  aux : directorio.entrySet()){
            Cliente clienteActual= aux.getValue();
            if(apellido.equalsIgnoreCase(clienteActual.getApellido())){
                listaNumeros.add(aux.getKey());
            }
            
        }
      return listaNumeros;
    }
}