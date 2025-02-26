/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionebiblioteca;

/**
 *
 * @author accpc
 */
public class codiceFiscaleException extends Exception{
    
    private String message;
    
    public codiceFiscaleException( String message ){
        
        this.message = message;
        
    }
    
    @Override
    public String getMessage(){
        
        return "Errore cifra: " + this.message;
        
    }
}
    
