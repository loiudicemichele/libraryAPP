/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appbiblioteca;
// https://www.flaticon.com/free-icon/book_2232688?term=book&page=1&position=6&page=1&position=6&related_id=2232688&origin=tag#
import java.util.Objects;

/**
 *
 * @author accpc
 */
public class Isbn {
    
    // Codici ISBN
    // -) Prefisso
    // -) Lingua
    // -) Editore
    // -) Identificativo titolo
    // -) Numero di controllo
    private Integer prefisso;
    private Integer prefLingua;
    private Integer prefEditore;
    private Integer idTitolo;
    private Integer nCotnrollo;
    
    
    // Prefisso del codice 
    private static final Integer PREFISSO = 978;
    // Numero massimo di cifre
    private static final Integer CIFRE = 13;
    
    // Costruttore parametrico
    public Isbn(Integer prefisso, Integer prefLingua, 
            Integer prefEditore, Integer idTitolo, Integer nControllo) 
            throws IsbnNonValido {
        this.setPrefisso(prefisso);
        this.setPrefLingua(prefLingua);
        this.setPrefEditore(prefEditore);
        this.setIdTitolo(idTitolo);
        this.setNCotnrollo(nControllo);
    }
    
    // Costruttore di copia
    public Isbn(Isbn i) {
        this.prefisso = i.getPrefisso();
        this.prefLingua = i.getPrefLingua();
        this.prefEditore = i.getPrefEditore();
        this.idTitolo = i.getIdTitolo();
        this.nCotnrollo = i.getNCotnrollo();
    }
    
    // Cotruttore tramite stringa numerica
    public Isbn(String isbn) throws IsbnNonValido {
        Integer[] intIsbn = this.toIntegers(isbn);
        if(intIsbn == null 
                || isbn.length() != Isbn.CIFRE) 
            throw new IsbnNonValido(isbn, 
                    "Prefissi non validi o lunghezza errata");
        this.setPrefisso(intIsbn[0]);
        this.setPrefLingua(intIsbn[1]);
        this.setPrefEditore(intIsbn[2]);
        this.setIdTitolo(intIsbn[3]);
        this.setNCotnrollo(intIsbn[4]);
    }
    
    // Setter 
    private void setPrefisso(Integer prefisso) throws IsbnNonValido {
        if(!Objects.equals(prefisso, Isbn.PREFISSO)) 
            throw new IsbnNonValido("", "Prefisso non valido");
        this.prefisso = prefisso;
    }
     
    private void setPrefLingua(Integer prefLingua) {
        this.prefLingua = prefLingua;
    }

    private void setPrefEditore(Integer prefEditore) {
        this.prefEditore = prefEditore;
    }

    private void setIdTitolo(Integer idTitolo) {
        this.idTitolo = idTitolo;
    }

    private void setNCotnrollo(Integer nCotnrollo) {
        this.nCotnrollo = nCotnrollo;
    }

    // Getter
    public Integer getPrefisso() { return this.prefisso; }
    public Integer getPrefLingua() { return this.prefLingua; }
    public Integer getPrefEditore() { return this.prefEditore; }
    public Integer getIdTitolo() { return this.idTitolo; }
    public Integer getNCotnrollo() { return this.nCotnrollo; }
    
    @Override
    public String toString() {
        return "" + this.getPrefisso() 
                + this.getPrefLingua()
                + this.getPrefEditore()
                + this.getIdTitolo()
                + this.getNCotnrollo();
    }
    
    // Conversione da string ad array di interi di un ISBN
    private Integer[] toIntegers(String isbn) {
        Integer[] intIsbn = new Integer[5];
        try {
            intIsbn[0] = Integer.parseInt("" + isbn.charAt(0) 
                    + isbn.charAt(1) + isbn.charAt(2));
            intIsbn[1] = Integer.parseInt("" + isbn.charAt(3) + isbn.charAt(4));
            intIsbn[2] = Integer.parseInt("" + isbn.charAt(5) + isbn.charAt(6) 
                    + isbn.charAt(7) + isbn.charAt(8) + isbn.charAt(9));
            intIsbn[3] = Integer.parseInt("" + isbn.charAt(10) 
                    + isbn.charAt(11));
            intIsbn[4] = Integer.parseInt("" + isbn.charAt(12));
        } catch(NumberFormatException | StringIndexOutOfBoundsException ex) {
            return null;
        }
        return intIsbn;
    }
    
}
