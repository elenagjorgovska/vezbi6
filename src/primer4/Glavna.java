package primer4;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args){

        List<String> lista = new ArrayList<>();
        lista.add("Barcelona");
        lista.add("Chelsea");
        lista.add("Benfica");

        System.out.println("Listata sodrzi: " + lista.size() +  " elementi.");
        System.out.println("Se brise elementot " + lista.remove("Barcelona"));
    }
}
