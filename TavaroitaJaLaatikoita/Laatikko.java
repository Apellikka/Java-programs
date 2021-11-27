
import java.util.ArrayList;

public class Laatikko implements Talletettava {

    private ArrayList<Talletettava> laatikko;
    private double maksimiPaino;

    public Laatikko(double maksimiPaino) {
        this.maksimiPaino = maksimiPaino;
        this.laatikko = new ArrayList<>();
    }

    public void lisaa(Talletettava talletettava) {
        if (paino() + talletettava.paino() <= maksimiPaino) {
            this.laatikko.add(talletettava);
        }
    }

    public String toString() {
        return "Laatikko: " + this.laatikko.size() + " esinettä, paino yhteensä " + paino() + " kiloa";
    }

    public double paino() {
        double paino = 0;
        for (Talletettava tavara : laatikko) {
            paino += tavara.paino();
        }
        return paino;
    }
}
