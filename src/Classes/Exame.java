package Classes;


public class Exame {
    private int id;
    private int idCliente;
    private String Animal;
    private String nome;
    private String data;
    private String horario;
    private float valor;

    public Exame(){
        
    }

    public Exame(int cod, int codCliente, String Animal, String nome, String data, String horario, float valor){
        this.id = cod;
        this.Animal = Animal;
        this.idCliente = codCliente;
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getAnimal() {
        return Animal;
    }

    public void setAnimal(String Animal) {
        this.Animal = Animal;
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
