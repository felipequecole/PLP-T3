import java.util.ArrayList;

/**
 * Created by felipequecole on 06/07/17.
 * Paradigmas de Linguagens de Programação - Trabalho 3
 */
public class AulasTeoricas {
    Sala[] salas = new Sala[5];

    AulasTeoricas(){
        boolean proj = true;
        for (int i = 0; i < 5; i++){
            salas[i] = new Sala(10*i+10, proj);
            proj = !proj;
        }
    }

    public Sala procuraSalaLivre(int tamanho, boolean temProjetor){
        for (Sala sala: this.salas){
            if(!sala.isReservado() && sala.getTamanho() >= tamanho && sala.isTemProjetor() == temProjetor){
                return sala;
            }
        }
        return null;
    }

    public synchronized Sala reservar(String nome, int tamanho, boolean temProjetor) throws InterruptedException{
        Sala sala;
        while ((sala = procuraSalaLivre(tamanho, temProjetor)) == null){
            wait();
        }
        sala.setReservado(true);
        sala.setReserva(nome);
        notify();
        return sala;
    }

    public synchronized void liberar(Sala sala) throws InterruptedException{
        sala.setReservado(false);
        sala.setReserva("");
        notify();
    }
}
