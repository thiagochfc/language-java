package application;

import entities.BancoDeClientes;
import entities.Cliente;
import javax.swing.JOptionPane;

public class CadastroApp {
    
    public static void main(String[] args) {
        
        BancoDeClientes bancoClientes = new BancoDeClientes();
        Integer opcao = 0;
        String nome;
        String fone;
        
        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
                        + "\n1 - Inserir Cliente"
                        + "\n2 - Remover Cliente"
                        + "\n3 - Alterar Cliente"
                        + "\n4 - Dados de Cliente"
                        + "\n5 - Dados dos Clientes"
                        + "\n6 - Sair"
                        + "\n\n"));
                
                switch(opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o nome: \n");
                        fone = JOptionPane.showInputDialog("Digite o telefone: \n\n"
                                + "Exemplo: 9999-8888"
                                + "\n");
                        bancoClientes.inserirCliente(new Cliente(bancoClientes.incrementar(), nome, fone));
                    break;
                    case 2:
                        nome = JOptionPane.showInputDialog("Digite o nome: \n\n");
                        bancoClientes.removerCliente(nome);
                    break;
                    case 3:
                        Integer id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID: \n"));
                        nome = JOptionPane.showInputDialog("Digite o novo nome: \n");
                        fone = JOptionPane.showInputDialog("Digite o telefone: \n\n"
                                + "Exemplo: 9999-8888"
                                + "\n");
                        bancoClientes.alterarCliente(id, nome, fone);
                    break;
                    case 4:
                        nome = JOptionPane.showInputDialog("Digite o novo nome: \n");
                        JOptionPane.showMessageDialog(null, bancoClientes.listarUmCliente(nome));
                    break;
                    case 5:
                        JOptionPane.showMessageDialog(null, bancoClientes.listarClientes());
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
        }while(opcao != 6);
        
    }
    
}
