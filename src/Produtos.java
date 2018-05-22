
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
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
    
    public void buscarPeloNome(){
        //TODO implementar a busca pelo nome
    }
    
    public void buscarPeloValorCalorico(){
        //TODO implementar a busca pelo valor calorico
    }
    
    public void solicitarInformacao(int posicao){
        nomes[posicao] = JOptionPane.showInputDialog("Digite o seu nome");
        valores[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        
    }
    
    public void apresentarInformacao(){
        //TODO apresentar as informações
    }
    
    public void apresentarReceita() {
        //TODO apresentar a receita
    }
}
