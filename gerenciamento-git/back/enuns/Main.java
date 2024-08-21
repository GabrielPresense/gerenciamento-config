package halmeida.enums;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Joao", Cargo.DBA);
		
		Funcionario funcionario = new Funcionario("Felipe", Cargo.PROGRAMADOR);

        Double novoSalario = funcionario.salarioComReajuste();

        System.out.println(novoSalario);
    }
}
