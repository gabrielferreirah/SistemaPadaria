
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
    String[] validadesDosProdutos = new String[100];
    double[] lucros = new double[100];
    String[] valoresCaloricos = new String[100];
    String[] alergicos = new String[100];
    String[] lotes = new String[100];
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
        //TODO implementar busca por ingrediente específico
    }
    
    public void listar() {
        //TODO implementar listagem para o produto
    }
    
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
