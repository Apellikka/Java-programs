
public class Ohjelma {

    public static void main(String[] args) {
        // Testaa Taikanelio-luokkaasi täällä

        Taikaneliotehdas tt = new Taikaneliotehdas();
        Taikanelio nelio = tt.luoTaikanelio(5);
        
        System.out.println(nelio.onTaikanelio());
        System.out.println(nelio.rivienSummat());
        System.out.println(nelio.sarakkeidenSummat());
        System.out.println(nelio.lavistajienSummat());
        
    }
}
