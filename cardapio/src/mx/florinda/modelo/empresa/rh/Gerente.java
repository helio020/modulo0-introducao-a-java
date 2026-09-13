package mx.florinda.modelo.empresa.rh;

import mx.florinda.modelo.empresa.Funcionario;

public class Gerente extends Funcionario {
    protected Gerente(double salario) {
        super(salario);
    }

    public double getBonus(double salario) {
        return salario + salario*0.15;
    }

}
