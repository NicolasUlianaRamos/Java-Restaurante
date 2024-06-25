package desafio.models;

public class Cliente {
    // Atributos
    private Alimento prato;
    private Alimento bebida;
    private Alimento sobremesa;
    private int calorias;

    // Construtor


    public Cliente() {
        this.prato = new Alimento("", "", 0);
        this.bebida = new Alimento("", "", 0);
        this.sobremesa = new Alimento("", "", 0);
    }

    public int calculaCalorias() {
        this.calorias = (this.prato.getCalorias() + this.bebida.getCalorias() + this.sobremesa.getCalorias());
        return this.calorias;
    }


    // Get e Set


    public Alimento getPrato() {
        return prato;
    }

    public void setPrato(Alimento prato) {
        this.prato = prato;
    }

    public Alimento getBebida() {
        return bebida;
    }

    public void setBebida(Alimento bebida) {
        this.bebida = bebida;
    }

    public Alimento getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Alimento sobremesa) {
        this.sobremesa = sobremesa;
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
        return "Cliente{" +
                "prato=" + prato.getNomeAlimento() +
                ", bebida=" + bebida.getNomeAlimento() +
                ", sobremesa=" + sobremesa.getNomeAlimento() +
                ", calorias=" + calorias +
                '}';
    }
}
