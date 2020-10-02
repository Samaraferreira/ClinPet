package classes;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String cpf;
    private Endereco end;
    
    public Pessoa (){
        
    }

    public Pessoa(int id, String nome, String tel, String email, String cpf, Endereco end) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.end = end;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

