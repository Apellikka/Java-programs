
public class Main {

    public static void main(String[] args) {
        Laatikko laatikko = new Laatikko(10);
        Laatikko laatikko2 = new Laatikko(10);

        laatikko.lisaa(new Kirja("Fedor Dostojevski", "Rikos ja Rangaistus", 2));
        laatikko.lisaa(new Kirja("Robert Martin", "Clean Code", 1));
        laatikko.lisaa(new Kirja("Kent Beck", "Test Driven Development", 1));

        laatikko2.lisaa(new CDLevy("Pink Floyd", "Dark Side of the Moon", 1973));
        laatikko2.lisaa(new CDLevy("Wigwam", "Nuclear Nightclub", 1975));
        laatikko2.lisaa(new CDLevy("Rendezvous Park", "Closer to Being Here", 2012));
        
        laatikko.lisaa(laatikko2);

        System.out.println(laatikko);
    }

}
