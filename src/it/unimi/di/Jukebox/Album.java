package it.unimi.di.Jukebox;

/**
 * Le istanze di questa classe rappresentano album di brani musicali.
 * @author Amerigo Prato
 */
public class Album implements Comparable<Album>{
    
    
    // ATTRIBUTI //

    /** I brani */
    private String[] brani;
    
    /** L'autore. */
    private Autore autore;
    
    /** Il titolo */
    private String titolo;
    
    /** L'anno di produzione */
    private int anno;
    
    /** Il genere */
    private String genere;
    
    
    // COSTRUTTORI //
    
    /**
     * Costruisce un oggetto che rappresenta un album, dati i brani, l'autore, il titolo, l'anno di produzione e il genere.
     * @param b I brani.
     * @param a L'autore.
     * @param t Il titolo.
     * @param d L'anno di produzione.
     * @param g Il genere.
     */
    public Album (String[] b, Autore a, String t, int d, String g){
        brani=b;
        autore=a;
        titolo=t;
        anno=d;
        genere=g;
    }
    
    
    // METODI //
    
    /**
     * Restituisce l'insieme dei brani.
     * @return L'insieme dei brani.
     */
    public String[] getBrani(){
        return brani;
    }
    
    /**
     * Restituisce l'autore.
     * @return L'autore.
     */
    public Autore getAutore(){
        return autore;
    }
    
    /**
     * Restituisce il titolo.
     * @return Il titolo.
     */
    public String getTitolo(){
        return titolo;
    }
    
    /**
     * Restituisce l'anno di produzione.
     * @return L'anno di produzione.
     */
    public int getAnno(){
        return anno;
    }
    
    /**
     * Restituisce il genere.
     * @return Il genere.
     */
    public String getGenere(){
        return genere;
    }
    
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for (int k=0; k<brani.length; k++){
            sb.append((k+1)+"- "+brani[k].toString()+'\n');
        }
        return titolo+" - "+autore.toString()+'\n'+""+genere+" ("+anno+")"+'\n'+sb.toString();
    }
    
    /**
     * Confronta due album per autore.
     * @param a L'album da confrontare con quello che esegue il metodo.
     * @return un intero negativo, zero, o un intero positivo a seconda che l'Autore dell'Album che esegue il metodo 
     * sia lessicograficamente minore, uguale o maggiore di quello dell'Album specificato come argomento.
     */
    public int compareTo(Album a){
        return (this.getAutore()).compareTo(a.getAutore());
    }
}
