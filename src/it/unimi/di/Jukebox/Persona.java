package it.unimi.di.Jukebox;

/**
 * Le istanze di questa classe rappresentano persone fisiche.
 * @author Amerigo Prato
 */
public class Persona extends Autore{
    
    
    // ATTRIBUTI //
    
    /**
     * Il nome completo della Persona.
     */
    private String nome;
    
    
    // COSTRUTTORI //
    
    /**
     * Costruisce un oggetto che rappresenta una persona fisica, dato il nome.
     * @param n Il nome.
     */
    public Persona(String n){
        nome=n;
    }
    
    
    // METODI //
    
    /**
     * Restituisce il nome della Persona.
     */
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
