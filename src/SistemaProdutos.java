
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
public class SistemaProdutos {
    
    /**
     *
     */
    public void apresentarMenuProdutos(){
    
        Produtos registroProdutos = new Produtos();
    
     Sistema sistema = new Sistema();

        int menuProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar"
                + "\n2 - Buscar pelo nome: "
                + "\n3 - Buscar pelo ingredientes: "
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Voltar ao Menu Principal"
                + "\n7 - Sair" 
                ).trim());
        
        while (menuProdutos != 7) {
            switch (menuProdutos) {
                case 1:
                    registroProdutos.cadastrarProdutos();
                    break;
                case 2:
                    registroProdutos.buscarPeloIngrediente();
                    break;
                case 3:
                     registroProdutos.buscarPeloNome();
                    break;
                case 4:
                     registroProdutos.listar();
                    break;
                case 5:
                     registroProdutos.editar();
                    break;
                case 6:
                    sistema.apresentarMenuPrincipal();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida, tente outra.");
            }
            menuProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
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
