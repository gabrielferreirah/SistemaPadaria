
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
                "Digite o seu nome");
        valores[posicao] = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o valor do produto"));
        alergicos[posicao] = JOptionPane.showInputDialog(
                "Digite os componentes alergicos do produto");
        validadesDosProdutos[posicao] = JOptionPane.showInputDialog(
                "Digite a validade do produto");
        lotes[posicao] = JOptionPane.showInputDialog(
                "Digite o lote do produto");
        valoresCaloricos[posicao] = JOptionPane.showInputDialog(
                "Digite o valor calorico do produto");

    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Produto: " + nomes[posicao]
                + "\nValor: " + valores[posicao]
                + "\nValidade: " + validadesDosProdutos[posicao]
                + "\nLote: " + lotes[posicao]
                + "\nAlergicos: " + alergicos[posicao]
        );
    }

    public void cadastrarProdutos() {
        solicitarInformacao(atual);
        atual++;
    }

    public void editar() {
        //TODO implementar edição das informacões
    }

    public void buscarPeloIngrediente() {
        //TODO implementar busca por ingrediente específico
    }

    public void listar() {
        //TODO implementar listagem para o produto
    }

    public void apresentarMenuProdutos() {

        int menuProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar"
                + "\n2 - Buscar pelo nome: "
                + "\n3 - Buscar pelo Valor Calorico: "
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Sair"
        ).trim());

        while (menuProdutos != 6) {
            switch (menuProdutos) {
                case 1:
                    cadastrarProdutos();
                    break;
                case 2:
                    buscarPeloNome();
                    break;
                case 3:
                    buscarPeloValorCalorico();
                    break;
                case 4:
                    listar();
                    break;
                case 5:
                    editar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção Invalida, tente outra.");
            }
            menuProdutos = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1 - Cadastrar"
                    + "\n2 - Buscar pelo nome: "
                    + "\n3 - Buscar pelo Valor Calorico: "
                    + "\n4 - Listar"
                    + "\n5 - Editar"
                    + "\n6 - Sair"
            ).trim());
        }
    }
}
