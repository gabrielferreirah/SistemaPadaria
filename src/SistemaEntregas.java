/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos Carlos Augusto Borges e Gabriel de Oliveira Ferreira.
 */
public class SistemaEntregas {
    
public void apresentarMenuEntregas){
    
       Entregas registroEntregas = new Entregas();
    
     Sistema sistema = new Sistema();

        int menuProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar"
                + "\n2 - Buscar pelo nome: "
                + "\n3 - Buscar por entregas : "
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Voltar ao Menu Principal"
                + "\n7 - Sair" 
                ).trim());
        
        while (menuProdutos != 7) {
            switch (menuProdutos) {
                case 1:
                    registroEntregas.cadastrarProdutos();
                    break;
                case 2:
                    registroEntregas.buscarPeloIngrediente();
                    break;
                case 3:
                     registroEntregas.buscarPeloNome();
                    break;
                case 4:
                     registroEntregas.listar();
                    break;
                case 5:
                     registroEntregas.editar();
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

