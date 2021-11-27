
import java.util.HashMap;
import java.util.ArrayList;

public class Ajoneuvorekisteri {

    private HashMap<Rekisterinumero, String> omistajat;

    public Ajoneuvorekisteri() {
        this.omistajat = new HashMap<>();
    }

    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if (!omistajat.containsKey(rekkari)) {
            omistajat.put(rekkari, omistaja);
            return true;
        }
        return false;
    }

    public String hae(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            return omistajat.get(rekkari);
        }
        return null;
    }

    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)) {
            omistajat.remove(rekkari);
            return true;
        }
        return false;
    }

    public void tulostaRekisterinumerot() {
        for (Rekisterinumero nro : omistajat.keySet()) {
            System.out.println(nro);
        }
    }

    public void tulostaOmistajat() {
        ArrayList nimet = new ArrayList<>();
        for (String nimi : omistajat.values()) {
            if (nimet.contains(nimi)) {
                continue;
            }
            System.out.println(nimi);
            nimet.add(nimi);
        }
    }
}
