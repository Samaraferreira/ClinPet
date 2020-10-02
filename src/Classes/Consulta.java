package Classes;

public class Consulta {
    private int id;
    private int idCliente;
    private String nomeVet;
    private String nomePet;
    private String data;
    private String horario;
    private float valor;

    public Consulta(){

    }

    public Consulta(int cod, int codCliente, String nome, String Animal, String data, String horario, float valor){
        this.id = cod;
        this.idCliente = codCliente;
        this.nomeVet = nome;
        this.nomePet = Animal;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getNomeVet() {
        return nomeVet;
    }

    public void setNomeVet(String nomeVet) {
        this.nomeVet = nomeVet;
    }

    
    public String getData() {
        return data;
    }

    public void setData(String data) {
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


