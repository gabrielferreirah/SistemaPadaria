import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel de Oliveira Ferreira, Carlos Augusto Borges e Lucas Rodrigo 
 */
public class Produtos {

    String[] nomes = new String[100];
    double[] valores = new double[100];
    String[] validadesDosProdutos = new String[100];
    double[] lucros = new double[100];
    String[] valoresCaloricos = new String[100];
    String[] alergicos = new String[100];
    String[] lotes = new String[100];
    int atual = 0;

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog(
                "Digite o nome parcial para a busca").trim();

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloValorCalorico() {
        String busca = JOptionPane.showInputDialog(
                "Digite o valor calorico do produto")
                .trim();
        for (int i = 0; i < atual; i++) {
            if (valoresCaloricos[i].contains(busca)) {
                apresentarInformacao(i);
            }

        }
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog(
                "Digite o nome do produto");
        valores[posicao] = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor do produto"));
        alergicos[posicao] = JOptionPane.showInputDialog(
                "Digite os componentes alergicos do produto");
        validadesDosProdutos[posicao] = JOptionPane.showInputDialog(
                "Digite a validade do produto");
        lotes[posicao] = JOptionPane.showInputDialog(
                "Digite o lote do produto");
        valoresCaloricos[posicao] = JOptionPane.showInputDialog(
                "Digite o valor calórico do produto");

    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Produto: " + nomes[posicao]
                + "\nValor: " + valores[posicao]
                + "\nValidade: " + validadesDosProdutos[posicao]
                + "\nLote: " + lotes[posicao]
                + "\nAlérgicos: " + alergicos[posicao]
        );
    }

    public void cadastrarProdutos() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
      
    }
    

    public void listar() {
    String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomes[i] + "  " + validadesDosProdutos[i] + "   "  + valores[i] + "   " + lucros[i] + 
                    valoresCaloricos[i] + "   " +  alergicos[i] + "   " + lotes[i] + "\n";
        }
        if (texto.equals("")) {
            texto += "Não há nenhum produto encontrado. ";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    

    

    private int apresentarMenuProdutos() {
        int menuProdutos = JOptionPane.showOptionDialog(null,
                "MENU DE PRODUTOS",
                "Padaria",
                0,
                0,
                null,
                new Object[]{
                    "Cadastrar", "Buscar pelo nome", "Buscar pelo Valor Calórico", "Listar", "Editar",
                        "Voltar"
                }, "Voltar"
        );
        return menuProdutos;
    }
    
    public void gerirMenu() {
        int menu = apresentarMenuProdutos();
        while (menu != 5) {
            switch (menu) {
                case 0:
                    cadastrarProdutos();
                    break;
                case 1:
                    buscarPeloNome();
                    break;
                case 2:
                    buscarPeloValorCalorico();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    editar();
                    break;
            }
            menu = apresentarMenuProdutos();
        }
    }
}
