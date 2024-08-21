import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate localDate;


    public Mentoria() {

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "descricao='" + getDescricao() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                "localDate=" + localDate +
                '}';
    }
}
