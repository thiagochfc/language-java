package application;

import entities.BlocoDeNota;
import javax.swing.JOptionPane;

public class appNota {
    
    public static void main(String[] args) {
         BlocoDeNota listNotas = new BlocoDeNota();
         Integer opcao = 0;
         String nota;
         
         do {
             try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n"
                        + "\n1 - Adicionar nota"
                        + "\n2 - Remover nota"
                        + "\n3 - Alterar nota"
                        + "\n4 - Listar nota"
                        + "\n5 - Sair"
                        + "\n\n"));

                switch(opcao) {
                    case 1:
                        nota = JOptionPane.showInputDialog("Digite a nota: \n");
                        listNotas.adicionarNota(nota);
                    break;
                    case 2:
                        nota = JOptionPane.showInputDialog("Digite a nota: \n");
                        listNotas.removerNota(nota);
                    break;
                    case 3:
                        nota = JOptionPane.showInputDialog("Digite a nota: \n");
                        String newNota = JOptionPane.showInputDialog("Digite a nova nota: \n");
                        listNotas.alterarNota(nota, newNota);
                    break;
                    case 4:
                        JOptionPane.showMessageDialog(null, listNotas.listarNota());
                    break;
                    case 5:
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
         } while(opcao != 5);
         
    }
    
}
