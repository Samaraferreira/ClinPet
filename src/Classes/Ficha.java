package classes;
import java.util.Date;

public class Ficha {
    private int id;
    private int idCliente;
    private int idAnimal;
    private String crv;
    private Date data;
    private String horario;
    private float valor;

    public Ficha(){

    }

    public Ficha(int cod, int idAnimal, int codCliente, String crv, Date data, String horario, float valor){
        this.id = cod;
        this.idAnimal = idAnimal;
        this.idCliente = codCliente;
        this.crv = crv;
        this.data = data;
        this.horario = horario;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCrv() {
        return crv;
    }

    public void setCrv(String crv) {
        this.crv = crv;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

