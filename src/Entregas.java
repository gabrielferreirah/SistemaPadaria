import javax.swing.JOptionPane;

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
                + "\nDistância: " + distanciaentrega[posicao]
                + "\nNome dos entregadores : " + entregadores[posicao]
                + "\nCombustível gasto : " + combustivel[posicao]
                + "\nDisponibilidade: " + disponibilidade[posicao]
                + "\nTempo media: " + tempomediaentregas[posicao]
                + "\nQuantidade de entregas: " + quantidadeentregas[posicao]
        
        
     );

}
    public void editar() {
        //TODO implementar edição das informacões
    }
        
    public void listar() {
        //TODO implementar listagem para o produto
    }
    
    public void apresentarMenuEntregas(){
    
        int menuEntregas = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar Entrega"
                + "\n2 - Buscar pelo nome: "
                + "\n3 - Buscar pelo ingredientes: "
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Sair" 
                ).trim());
        
        while (menuEntregas != 6) {
            switch (menuEntregas) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    buscarPeloNome();
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
            menuEntregas = Integer.parseInt(JOptionPane.showInputDialog(null,
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

 
 
 
