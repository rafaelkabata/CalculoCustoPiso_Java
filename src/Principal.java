
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CustoPiso custo = new CustoPiso();
        
         int op;
        double a, b;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n 1 - Inserir Valores" + "\n 2 - Calcular preço por área" + "\n 3 - Mostrar Valores" + "\n 0 - Sair"));
            
            switch(op){
                case 1:
                    custo.inserirValores();
                break;
                case 2:
                    custo.calcularPrecoArea();
                break; 
                case 3:
                    custo.mostrarValores();
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Você decidiu sair.");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
            }
            
        }while(op != 0);
        
    }
    
}
