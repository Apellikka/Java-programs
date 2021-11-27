
public class CDLevy implements Talletettava {

    private String artisti;
    private String levynNimi;
    private int julkaisuvuosi;
    private double paino;

    public CDLevy(String artisti, String levynNimi, int julkaisuvuosi) {
        this.artisti = artisti;
        this.levynNimi = levynNimi;
        this.julkaisuvuosi = julkaisuvuosi;
        this.paino = 0.1;
    }

    public double paino() {
        return this.paino;
    }
    
    public String toString() {
        return this.artisti + ": " + this.levynNimi + " (" + this.julkaisuvuosi + ")";
    }

}
