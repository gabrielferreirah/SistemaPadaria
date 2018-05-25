
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

    private Cliente submenuClientes = new Cliente();
    private Produtos submenuProdutos = new Produtos();
    private Entregas submenuEntregas = new Entregas();
    private Funcionarios submenuFuncionaios = new Funcionarios();

    private int apresentarMenuPrincipal() {

        int menuPrincipal = JOptionPane.showOptionDialog(null,
                "MENU PRINCIPAL",
                "Padaria",
                0,
                0,
                null,
                new Object[]{
                    "Cliente", "Produtos", "Funcionários", "Entregas","Sair"
                }, "Cliente"
        );
        return menuPrincipal;
    }

    public void gerirMenu() {
        int menu = apresentarMenuPrincipal();
        while (menu != 4) {
            switch (menu) {
                case 0:
                    submenuClientes.apresentarMenuClientes();
                    break;
                case 1:
                    submenuProdutos.apresentarMenuProdutos();
                    break;
                case 2:
                    submenuFuncionaios.apresentarMenuFuncionarios();
                    break;
                case 3:
                    submenuEntregas.apresentarMenuEntregas();
                    break;
            }
            menu = apresentarMenuPrincipal();
        }
    }
}
