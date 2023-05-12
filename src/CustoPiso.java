
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class CustoPiso {
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoporArea;
    private double custoTotalcomodo;

    public CustoPiso() {
        this(0.0,0.0,0.0,0.0);
    }
    
    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoporArea, double custoTotalcomodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoporArea = precoporArea;
        this.custoTotalcomodo = custoTotalcomodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoporArea() {
        return precoporArea;
    }

    public void setPrecoporArea(double precoporArea) {
        this.precoporArea = precoporArea;
    }

    public double getCustoTotalcomodo() {
        return custoTotalcomodo;
    }

    public void setCustoTotalcomodo(double custoTotalcomodo) {
        this.custoTotalcomodo = custoTotalcomodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do cômodo: ")));
        
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do cômodo: ")));
        
        setPrecoporArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço por área: ")));
    }
    
    public void calcularPrecoArea(){
       this.setCustoTotalcomodo(this.getComprimentoComodo() * this.getLarguraComodo() * this.getPrecoporArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Custo total para assentar o piso: " + this.getCustoTotalcomodo() + "\n Comprimento do cômodo: " + this.getComprimentoComodo() + "\n Largura do Cômodo: " + this.getLarguraComodo() + "\n Preço por área: " + this.getPrecoporArea());
    }
    
}
