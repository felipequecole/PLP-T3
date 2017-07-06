import java.util.ArrayList;

/**
 * Created by felipequecole on 06/07/17.
 * Paradigmas de Linguagens de Programação - Trabalho 3
 */
public class AulasTeoricas {
    public static ArrayList<Sala> salas;

    public static void setSalas(ArrayList<Sala> salas) {
        AulasTeoricas.salas = salas;
    }

    public synchronized void reservar(String nome, int tamanho, boolean temProjetor){
        boolean ok = false;
        for (Sala sala : salas){
            if(!sala.reservado && sala.tamanho >= tamanho && sala.temProjetor == temProjetor){
                sala.reservado = true;
                sala.reserva = nome;
                ok = true;
                System.out.print("Sala id: " + sala.id + " reservada para: " + nome + "\n");
                notify();
                break;
            }
        }
        if (!ok) {
            try {
                System.out.println("Nenhuma sala disponível, você entrará na fila...");
                wait();
                reservar(nome, tamanho, temProjetor);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void liberar(String nome){
        for (Sala sala: salas){
            if(sala.reserva.equals(nome)){
                System.out.println("Sala reservada por: " + sala.reserva + " agora está liberada");
                sala.reservado = false;
            }
        }
        notify();
    }
}
