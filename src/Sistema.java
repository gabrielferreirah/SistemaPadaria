/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Oliveira Ferreira
 */
public class Sistema {

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
                    //implementar a entrada do menu dos clientes
                    break;
                case 2:
                    //implementar a entrada do menu dos produtos
                    break;
                case 3:
                    //implementar a entrada do menu dos funcionarios
                    break;
                case 4:
                    //implementar a entrada do menu de entregas
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