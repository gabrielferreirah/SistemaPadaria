
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel de Oliveira Ferreira e Carlos Augusto Borges
 */
public class SistemaClientes {

    Cliente registroClientes = new Cliente();

    public void apresentarMenuClientes() {
        int menuClientes = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar"
                + "\n2 - Buscar pelo nome"
                + "\n3 - Buscar pelo CPF"
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Sair"
        ).trim());

        while (menuClientes != 6) {
            switch (menuClientes) {
                case 1:
                    registroClientes.cadastrarCliente();
                    break;
                case 2:
                    registroClientes.buscarPeloCPFCliente();
                    break;
                case 3:
                    registroClientes.buscarPeloNomeCliente();
                    break;
                case 4:
                    registroClientes.listar();
                    break;
                case 5:
                    registroClientes.editar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
            menuClientes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar"
                    + "\n2 - Buscar pelo nome"
                    + "\n3 - Buscar pelo CPF"
                    + "\n4 - Listar"
                    + "\n5 - Editar"
                    + "\n6 - Sair"
            ).trim());
        }
    }
}
