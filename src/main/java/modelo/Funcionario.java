/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private double cargaHorariaMensal;
    private int matricula;

    public Funcionario(){
        
    }

    public Funcionario(String nome, String cpf, double salario
        , double cargaHorariaMensal, int matricula){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHorariaMensal = cargaHorariaMensal;
        this.matricula = matricula;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;

    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getcargaHorariaMensal(){
        return this.cargaHorariaMensal;
    }

    public void setcargaHorariaMensal(double cargaHorariaMensal){
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public double calcularSalarioDoMes(int qtdHorasExtras){
        double valorHoraNormal = this.salario / 160;
        double valorHoraExtra = valorHoraNormal
                + (valorHoraNormal * 0.5);

        double totalHorasExtras = qtdHorasExtras * valorHoraExtra;
        double salarioTotal =  this.salario + totalHorasExtras;
        return salarioTotal;
    }    
    
    @Override
    public String toString(){
        return "Matrícula: " + matricula
                + "\nNome: " + nome 
                + "\nCPF: " + cpf
                + "\nSalário: " + salario
                + "\nC.H. Mensal: " + cargaHorariaMensal + "\n";                
    }
    
    public static void main(String[] args) {
        Funcionario f = new Funcionario("xxxxx", "888.888", 1000, 160, 1);
        JOptionPane.showMessageDialog(null, f);
    }
}