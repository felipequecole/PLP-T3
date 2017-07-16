/**
 * Created by felipequecole on 06/07/17.
 */
public class Sala {
    private static int ultimoID = 0;
    private int id;
    private int tamanho;
    private boolean temProjetor;
    private String reserva;
    private boolean reservado;
    Sala(int tamanho, boolean temProjetor) {
        this.id = ++ultimoID;
        this.tamanho = tamanho;
        this.temProjetor = temProjetor;
        this.reservado = false;
        this.reserva = "";
    }

    public static int getUltimoID() {
        return ultimoID;
    }

    public int getId() {
        return id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isTemProjetor() {
        return temProjetor;
    }

    public String getReserva() {
        return reserva;
    }

    public boolean isReservado() {
        return reservado;
    }

    public static void setUltimoID(int ultimoID) {
        Sala.ultimoID = ultimoID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setTemProjetor(boolean temProjetor) {
        this.temProjetor = temProjetor;
    }

    public void setReserva(String reserva) {
        this.reserva = reserva;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
}
