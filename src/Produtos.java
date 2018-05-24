
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
    String[] ingredientes = new String[100];
    String[] receitas = new String[100];
    double[] valores = new double[100];
    String[] validadeDoProduto = new String[100];
    double[] lucro = new double[100];
    String[] valorCalorico = new String[100];
    String[] alergicos = new String[100];
    int atual = 0;

    public void buscarPeloNome() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloValorCalorico() {
        //TODO implementar a busca pelo valor calorico
    }

    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog("Digite o seu nome");
        valores[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        alergicos[posicao] = JOptionPane.showInputDialog("Digite os componentes alergicos do produto");
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Produto: " + nomes[posicao]
                + "Valor: " + valores[posicao]
                + "Validade: " + validadeDoProduto[posicao]
        );
    }

    public void apresentarReceita() {
        //TODO apresentar a receita
    }

    public void cadastrarProdutos() {
        //TODO implenetar cadastro de produtos   
    }

    public void editar() {
        //TODO implementar edição das informacões
    }
    
    public void buscarPeloIngrediente() {
        
    }
    
    public void listar() {
        
    }
}
