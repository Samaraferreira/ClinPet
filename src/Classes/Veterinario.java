package Classes;

public class Veterinario {
    private String nome;
    private String email;
    private String cpf;
    private String crmv;
    private String especialidade;
    
    public Veterinario(String crmv, String nome, String email, String cpf,  String especialidade){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.crmv = crmv;
        this.especialidade = especialidade;
    }

    public Veterinario() {
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

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}


