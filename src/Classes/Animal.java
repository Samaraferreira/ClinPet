package Classes;

public class Animal {
    private int id;
    private int idCliente;
    private String nome;
    private String tipo;
    private String raca;
    private float peso;
    private String sexo;
    private int idade;
    
    
    public Animal (){
        
    }
    
    
    public Animal(int id, int idCliente, String nome, String tipo, String raca,  float peso, String sexo, int idade) {
        this.id = id;
        this.idCliente = idCliente;
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Animal(String nome, String tipo, String raca, String sexo, float peso, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.peso = peso;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdcliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }  

}