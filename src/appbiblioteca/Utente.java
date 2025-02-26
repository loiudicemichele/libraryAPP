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
public class Utente {
    
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String lNascita; //Luogo di nascita
    private String lResidenza;
    private String classe; //Classe|Sezione|Indirizzo
        
    public Utente(String Nome, String Cognome, String codiceFiscale, 
            String lNascita, String lResidenza, String classe) {
        
        this.setNome(Nome);
        this.setCognome(Cognome);
        this.setCodiceFiscale(codiceFiscale);
        this.setlNascita(lNascita);
        this.setlResidenza(lResidenza);
        this.setClasse(classe);
        
    }

    public Utente(Utente l) {
        
        this.nome = l.getNome();
        this.codiceFiscale = l.getCodiceFiscale();
        this.cognome = l.getCognome();
        this.lNascita = l.getlNascita();
        this.lResidenza = l.getlResidenza();
        this.classe = l.getClasse();
        
    }
    
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public void setCognome(String Cognome) {
        this.cognome = Cognome;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public void setlNascita(String lNascita) {
        this.lNascita = lNascita;
    }

    public void setlResidenza(String lResidenza) {
        this.lResidenza = lResidenza;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    public String getlNascita() {
        return this.lNascita;
    }

    public String getlResidenza() {
        return this.lResidenza;
    }

    public String getClasse() {
        return this.classe;
    }
    
    public String getQueryInsert() {
        
        return "insert into anagrafica_utente values ("
                + "'" + this.getNome() + "', '" 
                + this.getCognome() + "', " 
                + "'" + this.getCodiceFiscale() + "', " 
                + "'" + this.getlNascita() + "', " 
                + "'" + this.getlResidenza() + "', '" 
                + this.getClasse() + "')";
        
    }
    
    public String getQueryDelete() {
       
        return "DELETE FROM `anagrafica_utente` WHERE `codice_fiscale` = '" 
                + this.getCodiceFiscale()+"'";
        
    }
    
}

