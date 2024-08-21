public abstract class Conteudo {
    protected static final double XP_PADRAO = 10;

    private String descricao;
    private String titulo;

    public Conteudo() {
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Conteudo{" +
                "descricao='" + descricao + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
