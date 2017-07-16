import java.util.Random;

/**
 * Created by felipequecole on 06/07/17.
 */
public class ReservaThread extends Thread {
    private AulasTeoricas AT;
    private String nome;
    private int nroReservas;

    ReservaThread(String nome, int tentativas, AulasTeoricas AT){
        this.nome = nome;
        this.nroReservas = tentativas;
        this.AT = AT;
    }
    @Override
    public void run() {
        Sala sala;
        for(int i = 0; i < nroReservas; i++){
            boolean proj = true;
            try{
                sala = AT.reservar(this.nome, 5*i+5, proj);
                System.out.println(this.nome + " reservando sala: " + sala.getId());
                proj = !proj;
                int sono = (int) (Math.random() * 1000);
                sleep(sono);
                AT.liberar(sala);
                System.out.println("Sala " + sala.getId() + " sendo liberada por "+ this.nome);
            } catch (InterruptedException e) {}
        }
    }
}
