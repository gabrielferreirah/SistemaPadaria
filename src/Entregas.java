
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos Carlos Augusto Borges e Gabriel de Olivera Ferreira.
 */
public class Entregas {
    
    
    String[] nomes = new String[100];
    Double[] distanciaentrega = new Double[100];
    int[] combustivel = new int[100];
    String[] entregadores = new String[100];
    int[] quantidadeentregas = new int[100];
    Double[] tempomediaentregas = new Double[100];
    String[] disponibilidade = new String[100];
    
    int atual = 0;
    
       public void buscarPeloNome() {
        
           String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");
    
           for (int i = 0; i < atual; i++) {
            if (nomes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void apresentarInformacao(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   
    public void solicitarInformacao(int posicao) {
        nomes[posicao] = JOptionPane.showInputDialog(
                "Digite o seu nome:  ");
       distanciaentrega[posicao] = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite a distância da entrega:  "));
        entregadores[posicao] = JOptionPane.showInputDialog(
                "Digite os nomes dos entregadores: ");
        combustivel[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a quantidade de combustível gasta: "));
        disponibilidade[posicao] = JOptionPane.showInputDialog(
                "disponibilidade dos entregadores: ");
        tempomediaentregas[posicao] = Double.parseDouble(JOptionPane.showInputDialog(
                                       "Digite o tempo de medio/entrega" ));
        quantidadeentregas[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                                "Quantidade de entregas: "));
    
    }

 public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Produto: " + nomes[posicao]
                + "\nValor: " + valores[posicao]
                + "\nValidade: " + validadesDosProdutos[posicao]
                + "\nLote: " + lotes[posicao]
                + "\nAlergicos: " + alergicos[posicao]

}
}
 
 
 
 
 