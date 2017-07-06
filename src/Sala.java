/**
 * Created by felipequecole on 06/07/17.
 */
public class Sala {
    private static int ultimoID = 0;
    public int id;
    public int tamanho;
    public boolean temProjetor;
    public String reserva;
    public boolean reservado;
    Sala(int tamanho, boolean temProjetor){
        this.id = ++ultimoID;
        this.tamanho = tamanho;
        this.temProjetor = temProjetor;
        this.reservado = false;
        this.reserva = "";
    }
}
