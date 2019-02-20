/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocontraseña;
import java.util.Random;
/**
 *
 * @author Usuario DAM 1
 */
public class Password {
    private Integer longitud=8;
    private String contraseña;

    @Override
    public String toString() {
        return contraseña;
    }

    
    
    public Password() {
    }
    
    public Password(Integer longitud, String contraseña){
        this.longitud=longitud;
        this.contraseña=contraseña;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    private void generarContraseña(){
        String mayusculas = "ABCDEFGHIJKMLNOPQRSTUVXYZ";
        String minusculas = mayusculas.toLowerCase();
        String numeros = "0123456789";
        
        Integer numMayusculas = (int) (Math.random()*(this.longitud-2))+1;
        Integer numMinusculas = (int) (Math.random()*(this.longitud-numMayusculas-1))+1;
        Integer numNumeros = this.longitud - numMayusculas - numMinusculas;
        
        for (int i=0; i<numMayusculas; i++){
            int pos = (int)(Math.random()*mayusculas.length());
            this.contraseña=this.contraseña + mayusculas.charAt(pos);
        }
        
        for(int i=0; i<numMinusculas; i++){
        int posmin = (int) (Math.random()*minusculas.length());
        this.contraseña=this.contraseña+ minusculas.charAt(posmin);
        }
        
        for(int i=0; i<numNumeros; i++){
            int posnum = (int)(Math.random()*numeros.length());
            this.contraseña=this.contraseña+numeros.charAt(posnum);
        }
        
    }
    
    private void esFuerte(){
        
    }
    
    
    
    
}
