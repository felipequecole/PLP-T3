import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by felipequecole on 06/07/17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Sala> tempSalas = new ArrayList<>();
        tempSalas.add(new Sala(15, true));
        tempSalas.add(new Sala(25, false));
        tempSalas.add(new Sala(35, true));
        tempSalas.add(new Sala(45, false));
        AulasTeoricas.setSalas(tempSalas);
        AulasTeoricas AT = new AulasTeoricas();
        ReservaThread l1 = new ReservaThread("Wanderley", 2, AT);
        ReservaThread l2 = new ReservaThread("Helena", 3, AT);
        ReservaThread l3 = new ReservaThread("Homem", 4, AT);
        l1.start();
        l2.join();
        l3.join();
    }
}
