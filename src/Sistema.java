
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Oliveira Ferreira e Carlos Augusto Borges
 */
public class Sistema {

    private Cliente submenuClientes = new Cliente();
    private Produtos submenuProdutos = new Produtos();
    private Funcionarios submenuFuncionaios = new Funcionarios();

    private int apresentarMenuPrincipal() {

        int menuPrincipal = JOptionPane.showOptionDialog(null,
                "MENU PRINCIPAL",
                "Padaria",
                0,
                0,
                null,
                new Object[]{
                    "Cliente", "Produtos", "Funcionários","Sair"
                }, "Cliente"
        );
        return menuPrincipal;
    }

    public void gerirMenu() {
        int menu = apresentarMenuPrincipal();
        while (menu != 3) {
            switch (menu) {
                case 0:
                    submenuClientes.apresentarMenuClientes();
                    break;
                case 1:
                    submenuProdutos.gerirMenu();
                    break;
                case 2:
                    submenuFuncionaios.apresentarMenuFuncionarios();
                    break;
            }
            menu = apresentarMenuPrincipal();
        }
    }
}
