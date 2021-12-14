package primer3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("FIKT");
        lista.add("FINKI");
        lista.add("PMF");

        System.out.println("Listata sodrzi: " + lista.size() + " elementi.");
        System.out.println("Elementite na listata se: " + lista);
    }
}
