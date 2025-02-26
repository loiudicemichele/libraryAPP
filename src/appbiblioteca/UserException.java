/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca;

/**
 *
 * @author accpc
 */
public class UserException extends Exception{ 
     
    private String message; 
     
    public UserException( String message ){ 
         
        this.message = message; 
         
    } 
    
    @Override
    public String getMessage(){ 
         
        return this.message; 
         
    } 
     
}
