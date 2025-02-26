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
public class IsbnNonValido extends Exception {
    
    private Integer prefisso;
    private Integer prefLingua;
    private Integer prefEditore;
    private Integer idTitolo;
    private Integer nCotnrollo;
    private String message;
    
    // Costruttore parametrico
    public IsbnNonValido(Integer prefisso, Integer prefLingua, 
            Integer prefEditore, Integer idTitolo, 
            Integer nControllo, String message) {
        this.setPrefisso(prefisso);
        this.setPrefLingua(prefLingua);
        this.setPrefEditore(prefEditore);
        this.setIdTitolo(idTitolo);
        this.setNCotnrollo(nControllo);
        this.setMessage(message);
    }

    // Cotruttore tramite stringa numerica
    public IsbnNonValido(String isbn, String message) {
        Integer[] intIsbn = this.toIntegers(isbn);
        this.setPrefisso(intIsbn[0]);
        this.setPrefLingua(intIsbn[1]);
        this.setPrefEditore(intIsbn[2]);
        this.setIdTitolo(intIsbn[3]);
        this.setNCotnrollo(intIsbn[4]);
        this.setMessage(message);
    }
    
    // Setter
    public void setPrefisso(Integer prefisso) {
        this.prefisso = prefisso;
    }

    public void setPrefLingua(Integer prefLingua) {
        this.prefLingua = prefLingua;
    }

    public void setPrefEditore(Integer prefEditore) {
        this.prefEditore = prefEditore;
    }

    public void setIdTitolo(Integer idTitolo) {
        this.idTitolo = idTitolo;
    }

    public void setNCotnrollo(Integer nCotnrollo) {
        this.nCotnrollo = nCotnrollo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    // Getter
    public Integer getPrefisso() { return this.prefisso; }
    public Integer getPrefLingua() { return this.prefLingua; }
    public Integer getPrefEditore() { return this.prefEditore; }
    public Integer getIdTitolo() { return this.idTitolo; }
    public Integer getNCotnrollo() { return this.nCotnrollo; }
    
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
            return intIsbn;
        }
        return intIsbn;
    }
    
    @Override
    // Messaggio di errore
    public String getMessage() { return "Errore ISBN: " + this.message; }
}
