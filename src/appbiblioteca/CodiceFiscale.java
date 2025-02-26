package gestionebiblioteca;


public class CodiceFiscale{

        // Toglie gli spazi vuoti da una stringa che si presume
        // rappresenti un numero di codice fiscale,
        // ne converte le minuscole in maiuscole, infine verifica
        // che sia corretto. Prendiamo come riferimento la regole di
        // composizione di un codice fiscale descritte alla URL
        // ma le implementiamo con qualche semplificazione, ad esempio
        // senza preoccuparci delle 'X' di riempimento per le triple
        // che codificano cognome e nome e senza preoccuparci che il
        // carattere di controllo sia accurato.
        // By Loiudice Michele & Maragno Emanuele
        
    public static String minMaj( String min ){
    
        // Toglie gli spazi vuoti da una String che rappresenta
        // un (presunto) codice fiscale e ne trasforma le minuscole
        // in maiuscole.

        if ( min == null ) return null ;
                
        String maj = "" ; char ch ;
        
        for( int i = 0 ; i < min.length() ; i++ )

            if ( ( ch = min.charAt( i ) ) != ' ' &&  ch != '\t' )

                if ( ch >= 'a' && ch <= 'z' )

                    maj = maj + (char)( ch - 'a' + 'A' ) ;
                    
                else
                    maj = maj + ch ;
                    
        return maj;
    }
    
    public static boolean codiceFiscale( String cf ) throws codiceFiscaleException {
    
        // Implementazione provvisoria di un riconoscitore di codici fiscali:
        // esempi corretti sono: MDOGNE51B25G702P e FRTPLA46M41G224S
        // ma se nel primo di questi due mettessimo '0' al posto di 'O'
        // oppure sostituissimo "GEN" a "GNE", allora diventerebbe scorretto.

        if ( cf == null ) throw new codiceFiscaleException("Cifre insufficienti");
        if ( cf.length() < 16 ) throw new codiceFiscaleException("Cifre insufficienti");
    
        return cf.length() == 16
        
            && cognome( cf.substring( 0, 3 ) )
        
            && nome( cf.substring( 3, 6 ) )
            
            && data_nascita_e_sesso( cf.substring( 6, 11 ) )
            
            && comune_o_stato_nascita( cf.substring( 11, 15 ) )
            
            && char_ctrl( cf.charAt( 15 ), cf )
        ;
        
    }
    
    public static boolean nome( String nom ) throws codiceFiscaleException{

// accerta che 'cog' sia costituito
// da consonanti seguite da vocali
    
        return cognome( nom ) ;   
    }
    
    public static boolean cognome( String cog ) throws codiceFiscaleException{

// accerta che 'cog' sia costituito
// da consonanti seguite da vocali

// Esercizio: sistemare in modo che tenga conto anche di eventuali
// 'X' di riempimento finali

        boolean conson = true ; // mi aspetto una consoante
                
        for( int i = 0 ; i < cog.length( ); i = i + 1 ){
        
            char ch = cog.charAt( i ) ;
        
            if ( conson && ! consonante( ch ) )
            
               conson = false; // d'ora in poi mi aspetto una vocale
               
            if ( ! conson && ! vocale( ch ) ) throw new codiceFiscaleException(cog);   
        }
            
        return true ;        
    }
    
    public static boolean lettera( char ch ) throws codiceFiscaleException{
    
        if( ch >= 'A' && ch <= 'Z') return true;
        else throw new codiceFiscaleException(""+ch); 
        
    }

    public static boolean vocale( char ch ){
    
        return "AEIOU".indexOf( ch ) != -1 ;
    }

    public static boolean consonante( char ch ) throws codiceFiscaleException{
    
        return lettera( ch ) && ! vocale( ch ) ;
    }
    
    public static boolean data_nascita_e_sesso( String data_gen ) throws codiceFiscaleException{
    
        int gio ; // giorno del mese combinato con il genere ( 'femmina' +40 )
    
        if ( cifre( data_gen.substring( 0, 2 ) )
        
            && "ABCDEHLMPRST".indexOf( data_gen.charAt( 2 ) ) != -1 // mese
            
            && cifre( data_gen.substring( 3 ) )
            
            && ((gio = Integer.parseInt( data_gen.substring( 3, 5 ) )) <= 31 && gio > 0 
            
              ||  gio <= 71 && gio > 40   ) ) return true;
        else throw new codiceFiscaleException(data_gen);
        
    }
    
    public static boolean cifre( String cc ) throws codiceFiscaleException{ // riconosce una sequenza di sole cifre
    
        for( int i = 0 ; i < cc.length( ); i = i + 1 ){
        
            char ch = cc.charAt( i ) ;
        
            if ( ch < '0' || ch > '9' ) throw new codiceFiscaleException(cc);
        }
            
        return true ;
    }

    public static boolean comune_o_stato_nascita( String comune ) throws codiceFiscaleException{ // codice Belfiore
    
        if( lettera( comune.charAt( 0 ) ) && cifre( comune.substring( 1 ) )) return true;
        else throw new codiceFiscaleException(comune);
        
    }

    public static boolean char_ctrl( char let , String  codice ) throws codiceFiscaleException{
    
    // Esercizio: Completare la verifica che il carattere di controllo sia
    // conforme alle regole del codice fiscale.
    
        return lettera( let ) ;
    
    }
}