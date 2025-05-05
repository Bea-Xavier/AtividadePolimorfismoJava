public class Empresa {
    public static void main(String[] args) {
        Funcionario v = new Vendedor(2000, 500);
        Funcionario f = new Freelancer(20, 150);

        
        System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(v));
        System.out.println("Salário do Freelancer: " + obterSalarioDoFuncionario(f));
        System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(new Gerente(10000, 1000)));

    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal();
    }
}
