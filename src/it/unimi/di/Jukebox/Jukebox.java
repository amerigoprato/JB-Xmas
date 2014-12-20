package it.unimi.di.Jukebox;
import java.util.Arrays;
import java.util.Random;

/**
 * Le istanze di questa classe rappresentano una collezione di album musicali, ordinati per autore.
 * @author Amerigo Prato 
 */
public class Jukebox{
    
    
    // ATTRIBUTI //
    
    /** L'insieme di album */
    private Album[] album;
    
    
    // COSTRUTTORI //
    
    /**
     * Costruisce un oggetto che rappresenta una collezione di Album, ordinata per Autore.
     * @param a La collezione di Album, ordinata per Autore.
     */
    public Jukebox (Album[] a){
        album=a;
        Arrays.sort(album);
    }
    
    
    // METODI //
    
    /**
     * Restituisce la collezione di Album.
     * @return La collezione di Album.
     */
    public Album[] getAlbum(){
        return album;
    }
    
    /**
     * Restituisce uno specifico Album, data la posizione nel Jukebox.
     * @param pos La posizione.
     * @return Uno specifico Album.
     */
    public Album getAlbum(int pos){
        return album[pos];
    }
    
    /**
     * Ordina gli Album per Autore.
     */
    public void ordinaPerAutore(){
        Arrays.sort(album);
    }
    
    /**
     * Ordina gli Album per titolo.
     */
    public void ordinaPerTitolo(){
        for(int t=1; t<album.length; t++){
            int pos=0;
            while((album[pos].getTitolo()).compareTo(album[t].getTitolo())<0 && pos<t)
                pos++;
            Album y=album[t];
            for (int j=t-1; j>=pos; j--)
                album[j+1]=album[j];
            album[pos]=y;
        }
    }
    
    /**
     * Ordina gli Album per anno di produzione.
     */
    public void ordinaPerAnno(){
        for(int t=1; t<album.length; t++){
            int pos=0;
            while(album[pos].getAnno()<album[t].getAnno() && pos<t)
                pos++;
            Album y=album[t];
            for (int j=t-1; j>=pos; j--)
                album[j+1]=album[j];
            album[pos]=y;
        }
    }
    
    /**
     * Ordina gli Album per genere.
     */
    public void ordinaPerGenere(){
        for(int t=1; t<album.length; t++){
            int pos=0;
            while((album[pos].getGenere()).compareTo(album[t].getGenere())<0 && pos<t)
                pos++;
            Album y=album[t];
            for (int j=t-1; j>=pos; j--)
                album[j+1]=album[j];
            album[pos]=y;
        }
    }
    
    /**
     * Ordina gli Album casualmente.
     */
    public void ordinaCasuale(){
        Random rdn=new Random();		
		for (int i=0; i<album.length; i++) {
		    int posCas=rdn.nextInt(album.length);
		    Album temp=album[i];
		    album[i]=album[posCas];
		    album[posCas] = temp;
		}
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album nell'ordine attuale.
     * @return una stringa che imita la riproduzione degli album nell'ordine attuale.
     */
    public String riproduci(){
        StringBuilder sb=new StringBuilder();
        for(int k=0; k<album.length; k++){
            sb.append(album[k]);
        }
        return sb.toString();
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album per Autore.
     * @return una stringa che imita la riproduzione degli album per Autore.
     */
    public String riproduciPerAutore(){
        this.ordinaPerAutore();
        return this.riproduci();
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album per titolo.
     * @return una stringa che imita la riproduzione degli album per titolo.
     */
    public String riproduciPerTitolo(){
        this.ordinaPerTitolo();
        String s=this.riproduci();
        this.ordinaPerAutore();
        return s;
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album per anno di produzione.
     * @return una stringa che imita la riproduzione degli album per anno di produzione.
     */
    public String riproduciPerAnno(){
        this.ordinaPerAnno();
        String s=this.riproduci();
        this.ordinaPerAutore();
        return s;
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album per genere.
     * @return una stringa che imita la riproduzione degli album per genere.
     */
    public String riproduciPerGenere(){
        this.ordinaPerGenere();
        String s=this.riproduci();
        this.ordinaPerAutore();
        return s;
    }
    
    /**
     * Restituisce una stringa che imita la riproduzione degli album in ordine casuale.
     * @return una stringa che imita la riproduzione degli album in ordine casuale.
     */
    public String riproduciCasuale(){
        this.ordinaCasuale();
        String s=this.riproduci();
        this.ordinaPerAutore();
        return s;
    }
}
