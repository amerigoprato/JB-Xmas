package it.unimi.di.Jukebox;

/**
 * Le istanze di questa classe rappresentano autori di Album musicali.
 * @author Amerigo Prato
 */
public abstract class Autore implements Comparable<Autore>{
    
    
    // METODI //
    
    /**
     * Confronta questo Autore con l'Autore specificato come argomento e restituisce un intero negativo, zero, o un intero positivo 
     * a seconda che l'Autore che esegue il metodo sia lessicograficamente minore, uguale o maggiore di quello specificato come argomento.
     * @param a L'Autore da confrontare con quello che esegue il metodo.
     * @return un intero negativo, zero, o un intero positivo a seconda che l'Autore che esegue il metodo sia lessicograficamente minore, uguale o maggiore di quello specificato come argomento.
     */
    public int compareTo(Autore a){
        return (this.toString()).compareTo(a.toString());
    }
}
