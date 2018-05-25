
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Oliveira Ferreira e Carlos Augusto Borges
 */
public class Sistema {

    Cliente submenuClientes = new Cliente();
    Produtos submenuProdutos = new Produtos();
    Entregas submenuEntregas = new Entregas();
    
    public void apresentarMenuPrincipal() {

        int menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cliente"
                + "\n2 - Produtos"
                + "\n3 - Funcionário"
                + "\n4 - Entregas"
                + "\n5 - Sair"
        ));

        while (menuPrincipal != 5) {
            switch (menuPrincipal) {
                case 1:
                    submenuClientes.apresentarMenuClientes();
                    break;
                case 2:
                    submenuProdutos.apresentarMenuProdutos();
                    break;
                case 3:
                    //implementar a entrada do menu dos funcionarios
                    break;
                case 4:
                    submenuEntregas.apresentarMenuEntregas();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
            menuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cliente"
                + "\n2 - Produtos"
                + "\n3 - Funcionário"
                + "\n4 - Entregas"
                + "\n5 - Sair"
                    ));
        }
    }
}
