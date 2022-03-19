package easy;

import javax.swing.JOptionPane;

public class Exercicio08 {

   // Exercício 8 - Faça um algoritmo para ler um valor de salário, 
    //calcular e exibir o valor do salário bruto, valor do salário líquido e o valor do imposto de renda.

    // Base de cálculo                 Alíquota            Dedução
    // de 0,00 até 1.903,98            isento              0
    // de 1.903,99 até 2.826,65        7,50%               142,8
    // de 2.826,66 até 3.751,05        15,00%              354,8
    // de 3.751,06 até 4.664,68        22,50%              636,13
    // a partir de 4.664,68            27,50%              869,36

    public void calculoSalarioLiquidoEImposto() {

            double salarioLiquido, valorImpostoRenda;

            double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: "));
        if (salarioBruto >= 0.00 && salarioBruto <= 1903.98) {
            System.out.printf(" Seu Salario Bruto é R$  %.2f %n", salarioBruto);
            System.out.printf(" Seu Salario liquido é R$  %.2f %n", salarioBruto);
            System.out.printf(" Valor do imposto de Renda é R$ %.2f %n ", 0.00);
        } else
            ;
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            System.out.printf(" Seu Salario Bruto é R$  %.2f %n", salarioBruto);
            valorImpostoRenda = (salarioBruto * 0.0075) - 142.80;
            System.out.printf("Valor do imposto de Renda é R$  %.2f %n", valorImpostoRenda);
            salarioLiquido = salarioBruto - valorImpostoRenda;
            System.out.printf(" Seu Salario liquido é R$  %.2f %n", salarioLiquido);
        } else
            ;
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            System.out.printf(" Seu Salario Bruto é R$  %.2f %n", salarioBruto);
            valorImpostoRenda = (salarioBruto * 0.15) - 354.80;
            System.out.printf("Valor do imposto de Renda é R$  %.2f %n", valorImpostoRenda);
            salarioLiquido = salarioBruto - valorImpostoRenda;
            System.out.printf("Seu Salario liquido é R$ %2.f %n", salarioLiquido);
        } else
            ;
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            System.out.printf(" Seu Salario Bruto é R$  %.2f %n", salarioBruto);
            valorImpostoRenda = (salarioBruto * 0.22) - 636.13;
            System.out.printf("Valor do imposto de Renda é R$ %.2f %n", valorImpostoRenda);
            salarioLiquido = salarioBruto - valorImpostoRenda;
            System.out.printf("Seu Salario Liquido é R$ %2.f %n", salarioLiquido);
        } else
            ;
        if (salarioBruto >= 4664.68) {
            System.out.printf("Seu salario Bruto é R$ %2.f %n", salarioBruto);
            valorImpostoRenda = (salarioBruto * 0.275) - 869.36;
            System.out.printf("Valor do imposto de Renda é R$ %.2f %n", valorImpostoRenda);
            salarioLiquido = salarioBruto - valorImpostoRenda;
            System.out.printf("Seu salarios liquido é R$ %2.f %n", salarioLiquido);

        } else
            ;

    }

}
