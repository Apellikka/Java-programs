
public class Kirja implements Talletettava {

    private String nimi;
    private String kirjoittaja;
    private double paino;

    public Kirja(String kirjoittaja, String nimi, double paino) {
        this.nimi = nimi;
        this.kirjoittaja = kirjoittaja;
        this.paino = paino;
    }

    public double paino() {
        return this.paino;
    }
    
    public String toString() {
        return this.kirjoittaja + ": " + this.nimi;
    }
}
