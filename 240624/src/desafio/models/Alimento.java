package desafio.models;

public class Alimento {
    // Atributos
    private String nomeAlimento;
    private String tipoAlimento;
    private int calorias;

    // Construtor

    public Alimento(String nomeAlimento, String tipoAlimento, int calorias) {
        this.nomeAlimento = nomeAlimento;
        this.tipoAlimento = tipoAlimento;
        this.calorias = calorias;
    }


    // Get e Set

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    // To String

    @Override
    public String toString() {
        return "Alimento{" +
                "nomeAlimento='" + nomeAlimento + '\'' +
                ", tipoAlimento='" + tipoAlimento + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
