import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by felipequecole on 06/07/17.
 */
public class Main {
    public static void main(String[] args) {
        AulasTeoricas AT = new AulasTeoricas();
        ReservaThread[] thread = new ReservaThread[6];
        //Valor entre 2 e 4, este valor determina quantas vezes cada carro, é um valor gerado aleatoriamente
        Random random = new Random();
        int tentativas = random.nextInt(3) + 2 ;
        System.out.println(tentativas);
        thread[0] = new ReservaThread("Heloisa", tentativas, AT);
        tentativas = random.nextInt(3)+2;
        thread[1] = new ReservaThread("Wanderley", tentativas, AT);
        tentativas = random.nextInt(3)+2;
        thread[2] = new ReservaThread("Estevam", tentativas, AT);
        tentativas = random.nextInt(3)+2;
        thread[3] = new ReservaThread("Helena", tentativas, AT);
        tentativas = random.nextInt(3)+2;
        thread[4] = new ReservaThread("Gilberto", tentativas, AT);
        tentativas = random.nextInt(3)+2;
        thread[5] = new ReservaThread("Marilde", tentativas, AT);
        for (int i = 0; i < 6; i++){
            thread[i].start();
        }
    }
}
