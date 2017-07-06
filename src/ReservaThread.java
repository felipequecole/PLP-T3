/**
 * Created by felipequecole on 06/07/17.
 */
public class ReservaThread extends Thread {
    AulasTeoricas AT;
    String nome;
    int nroReservas;

    ReservaThread(String nome, int tentativas, AulasTeoricas AT){
        this.nome = nome;
        this.nroReservas = tentativas;
        this.AT = AT;
    }
    @Override
    public void run() {
//        int contador = 0;
//        boolean projetor = true;
//        while(contador < nroReservas){
//            AT.reservar(this.nome, (contador+1)*10, projetor);
//            projetor = !projetor;
//            try {
//                Thread.sleep(1000);
//                AT.liberar(this.nome);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            contador++;
//        }
        while (true) {
            System.out.println(nome + " rodando");
        }
    }
}
