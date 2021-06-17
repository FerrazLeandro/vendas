package classes;

public class Vendedor extends Pessoa{
    public double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao * 0.05;
    }
}
