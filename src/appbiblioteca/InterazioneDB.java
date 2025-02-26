ì
package appbiblioteca;

/**
 *
 * @author accpc
 */

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InterazioneDB implements CredenzialiDB {
    
    private final Connection con;
    private final Statement stm;
    
    public InterazioneDB() throws SQLException {
        
        DriverManager.registerDriver(new Driver());
        this.con = DriverManager.getConnection(  
                "jdbc:mysql://" + InterazioneDB.host 
                        + ":" + InterazioneDB.port 
                        + "/" + InterazioneDB.dataBase, 
                InterazioneDB.user, ""
        );
        this.stm = this.con.createStatement();
        
    }
    
    /*public void aggiungiLibro(String id, String isbn, String titolo, 
            String genere, String editore, 
            String annoP, String autori) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "insert into anagrafica_libro values ("
                + id + ", " 
                + isbn + ", " 
                + "'" + titolo + "', " 
                + "'" + genere + "', " 
                + "'" + editore + "', " 
                + annoP + ", '" + autori 
                + "', '')"
        );
        
        ps.execute();
    } */
    
    /*public void aggiungiUtente(String nome, String cognome, String codFiscale, 
            String lNascita, String lResidenza, 
            String classe) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "insert into anagrafica_utente values ("
                + "'" + nome + "', '" 
                + cognome + "', " 
                + "'" + codFiscale + "', " 
                + "'" + lNascita + "', " 
                + "'" + lResidenza + "', '" 
                + classe + "')"
        );
        
        ps.execute();
    }
    */
    /*public void prestitoLibro(String codFiscale, String id) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "UPDATE anagrafica_libro SET noleggiato = '" + codFiscale + "' WHERE id_inventario = '" + id + "'"
        );
        
        ps.execute();
    }*/
    
    /*public void restituzioneLibro(String id) throws SQLException {
        PreparedStatement ps = con.prepareStatement(
            "UPDATE anagrafica_libro SET noleggiato = '' WHERE id_inventario = '" + id + "'"
        );
        
        ps.execute();
    }*/ 
    
    // INSERT INTO ...
    public ResultSet comandoDML(String query) throws SQLException {
        return this.stm.executeQuery(query);
    }
    
    // UPDATE ... WHERE ...
    public Integer comandoQL(String query) throws SQLException {
        return this.stm.executeUpdate(query);
    }
    
    public void chiudiConnessione() throws SQLException {
        this.con.close();
    }
    
}
