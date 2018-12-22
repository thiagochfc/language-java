package application;

import entities.Caixa;
import entities.Deposito;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Deposito deposito = new Deposito();
        Integer opcao = 0;
        String dono;
        String corredor;
        Integer posicao;
        Double peso;
        
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
                        + "\n1 - Adicionar Caixa"
                        + "\n2 - Remover Caixa"
                        + "\n3 - Procurar Caixa"
                        + "\n4 - Mudar Caixa"
                        + "\n5 - Lista mais Pesada"
                        + "\n6 - Sair"
                        + "\n\n"));
                
                switch(opcao) {
                    case 1:
                        dono = JOptionPane.showInputDialog("Digite o dono: \n");
                        corredor = JOptionPane.showInputDialog("Digite o corredor: \n");
                        posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: \n"));
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: \n"));
                        deposito.adicionarCaixa(new Caixa(dono, corredor, posicao, peso));
                    break;
                    case 2:
                        dono = JOptionPane.showInputDialog("Digite o dono: \n");
                        deposito.removerCaixa(dono);
                    break;
                    case 3:
                        dono = JOptionPane.showInputDialog("Digite o dono: \n");
                        JOptionPane.showMessageDialog(null, deposito.encontrarPorDono(dono));
                    break;
                    case 4:
                        dono = JOptionPane.showInputDialog("Digite o dono: \n");
                        corredor = JOptionPane.showInputDialog("Digite o corredor: \n");
                        posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição: \n"));
                        deposito.mudarCorredorPosicaoPorDono(dono, corredor, posicao);
                    break;
                    case 5:
                        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: \n"));
                        deposito.caixaPesaMaisQue(peso);
                    break;
                    case 6:
                        System.exit(0);
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida."
                         + "\n\nError: Não tem essa opção no menu.\n\n");
                    break;                    
                }
            } catch(NumberFormatException nfe) {
                if(opcao == 0)
                    JOptionPane.showMessageDialog(null, "Opção inválida."
                        + "\n\nError: Campo vázio, tem que ser digitado com as opções do menu.\n\n");
                else 
                    JOptionPane.showMessageDialog(null, "Opção inválida."
                        + "\n\nError: Esse campo só aceita valor do tipo numérico.\n\n");
            }
        } while(opcao != 6);
        
    }
    
}
