
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
    
    
    String[] nomesClientes = new String[100];
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
}
 