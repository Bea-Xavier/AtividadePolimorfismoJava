public class Gerente extends Funcionario{
    private double salarioBase;
    private int bonusFixo;

    public Gerente (double salarioBase, int bonusFixo) {
        this.salarioBase = salarioBase;
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonusFixo;
    }
}
