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
import java.time.LocalDate;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Libro {
    //Titolo, isbn codice inventario, autore/i, editore, anno pubblicazione, genere, data inizio prestito e data consegna
    private String titolo;
    private String autore;
    private String editore;
    private Integer annoPubblicazione;
    private String genere;
    private Isbn isbn;
    
    public Libro(String titolo, String autore, String editore, 
            Integer annoPubblicazione, String genere, String isbn) 
            throws UserException, IsbnNonValido {
        
        this.setTitolo(titolo);
        this.setAutore(autore);
        this.setEditore(editore);
        this.setAnnoPubblicazione(annoPubblicazione);     
        this.setGenere(genere);
        this.setIsbn(isbn);
        
    }
    
    public Libro(Libro l) {
        
        this.autore = l.getAutore();
        this.editore = l.getEditore();
        this.titolo = l.getTitolo();
        this.genere = l.getGenere();
        this.annoPubblicazione = l.getAnnoPubblicazione();
        this.isbn = l.getIsbn();
        
    }
    
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }
    
    public void setGenere(String genere){
        this.genere = genere;
    }
    
    public void setAnnoPubblicazione(Integer anno) throws UserException {
        if (anno < 1970 || anno > LocalDate.now().getYear()) 
            throw new UserException("Anno non valido!");
        else this.annoPubblicazione = anno;
    }
    
    public void setIsbn(String isbn) throws IsbnNonValido {
        this.isbn = new Isbn(isbn);
    }

    public String getAutore() {
        return this.autore;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getEditore() {
        return this.editore;
    }

    public Isbn getIsbn() {
        return new Isbn(this.isbn);
    }

    public String getGenere() {
        return genere;
    }

    public Integer getAnnoPubblicazione() {
        return annoPubblicazione;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "autore:" + this.autore + ", titolo:" + this.titolo 
                + ", editore:" + this.editore + ", isbn:" + this.isbn + '}';
    }
    
    public String getQueryInsert() {
        return "INSERT INTO `anagrafica_libro` (`titolo`, `genere`, `autori`, `anno_publicazione`, `editore`, `isbn`) VALUES (" +
                "'" + 
                this.getTitolo() +"', '" + 
                this.getGenere()+"', '"+
                this.getAutore()+ "', '"+
                this.getAnnoPubblicazione()+"', '"+
                this.getEditore() +"', '"+
                this.getIsbn().toString()+"')";
    }
    
    public String getQueryDelete() {
        return "DELETE FROM `anagrafica_libro` WHERE `isbn` = '" 
                + this.getIsbn().toString()+"'";
    }
    
    public static Libro cercaLibro(Isbn s) 
            throws SQLException, UserException, IsbnNonValido {
        
        InterazioneDB iDB = new InterazioneDB();
        ResultSet a = iDB.comandoDML(
                "SELECT * FROM anagrafica_libro WHERE isbn = '" + s.toString() 
                        + "'"
        );        
        a.next();
        return new Libro (a.getString(1), 
                a.getString(2), 
                a.getString(3), 
                a.getInt(4), 
                a.getString(5), a.getString(6));
        
    }
    
}
