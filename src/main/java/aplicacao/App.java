/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import javax.swing.JOptionPane;
import modelo.Funcionario;

/**
 *
 * @author gdsant
 */
public class App {

    public static void main(String[] args) {
        String nome, cpf;
        double salario, cargaHorariaMensal;
        int matricula;
        
        Funcionario funcionarios[] = new Funcionario[2];

        for (int i = 0; i < 2; i++) {
            boolean dadosCorretos = false;
            while(!dadosCorretos) {
            try {
            nome = JOptionPane.showInputDialog(
                    "Informe nome do Funcionário " + (i + 1) + ":");
            cpf = JOptionPane.showInputDialog(
                    "Informe cpf do Funcionário " + (i + 1) + ":");
            salario = Double.parseDouble(JOptionPane.showInputDialog(
                    "Informe salário do Funcionário " + (i + 1) + ":"));
            cargaHorariaMensal = Double.parseDouble(JOptionPane
                    .showInputDialog("Informe carga horária mensal do"
                            + " Funcionário " + (i + 1) + ":"));
            matricula = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe a matrícula do Funcionário " + (i + 1) + ":"));
            dadosCorretos = true;
            funcionarios[i] = new Funcionario(nome, cpf,
                    salario, cargaHorariaMensal, matricula);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Uma ou mais entradas inválidas!")
        }
    }
        
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Alterar nome"
                    + "\n2 - Alterar salário"
                    + "\n3 - Calcular salário"
                    + "\n4 - Visualizar dados"
                    + "\n0 - Encerrar Sessão"));

            switch (opcao) {
                case 1:

                    matricula = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe a matrícula:"));

                    if (matricula == funcionarios[0].getMatricula()) {
                        nome = JOptionPane.showInputDialog("Novo nome:");
                        funcionarios[0].setNome(nome);
                    } else if (matricula == funcionarios[1].getMatricula()) {
                        nome = JOptionPane.showInputDialog("Novo nome:");
                        funcionarios[1].setNome(nome);
                    } else {
                        JOptionPane.showMessageDialog(null, "Matrícula "
                                + "incorreta");
                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:

                    JOptionPane.showMessageDialog(null,
                             funcionarios[0] + "\n"
                            + funcionarios[1]);

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Programa "
                            + "encerrado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
            }
        } while (opcao != 0);

    }
}
