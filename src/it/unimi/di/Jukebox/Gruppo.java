package it.unimi.di.Jukebox;

/**
 * Le istanze di questa classe rappresentano gruppi musicali.
 * @author Amerigo Prato
 */
public class Gruppo extends Autore{
    
    
    // ATTRIBUTI //
    
    /**
     * Il nome del Gruppo.
     */
    private String nome;
    
    
    // COSTRUTTORI //
    
    /**
     * Costruisce un oggetto che rappresenta un gruppo musicale, dato il nome.
     * @param n Il nome.
     */
    public Gruppo(String n){
        nome=n;
    }
    
    
    // METODI //
    
    /**
     * Restituisce il nome del Gruppo.
     */
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
