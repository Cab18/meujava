public class SetGet {

    private String nome;
    private String tele;
    private String email;

    // METODOS SETTERS//
    public void setNome(String nm) {
        this.nome = nm;
    }

    public void setTele(String tl) {
        this.tele = tl;
    }

    public void setEmail(String me) {
        this.email = me;
    }
    // Metodos Getters

    public String getNome() {
        return nome;
    }

    public String getTele() {
        return tele;
    }

    public String getEmail() {
        return email;
    }
}
