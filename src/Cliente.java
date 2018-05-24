
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 *
 * @author Gabriel de Oliveira Ferreira e Carlos Augusto Borges.
 */
public class Cliente {

    String[] nomesClientes = new String[100];
    String[] sobrenomesClientes = new String[100];
    int[] idadesClientes = new int[100];
    String[] cpfsClientes = new String[100];
    String[] telefonesClientes = new String[100];
    String[] ruas = new String[100];
    String[] bairros = new String[100];
    String[] ceps = new String[100];
    int[] pedidosPorMes = new int[100];
    String[] cartaoFidelidade = new String[100];

    int atual = 0;

    public void cadastrarCliente() {
        solicitarInformacao(atual);
        atual++;
    }
    
    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomesClientes[i] + " " + sobrenomesClientes[i] + "   " + cpfsClientes[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void buscarPeloNomeCliente() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomesClientes[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }

    public void buscarPeloCPFCliente() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o CPF que deseja buscar");

        for (int i = 0; i < atual; i++) {
            if (cpfsClientes[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }
    
    public void editar(){
        String busca = JOptionPane.showInputDialog("Digite o nome  para editar");
        for (int i = 0; i < atual; i++) {
            if (nomesClientes[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }

        }
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomesClientes[posicao] + " " + sobrenomesClientes[posicao]
                + "\nIdade: " + idadesClientes[posicao]
                + "\nCpf: " + cpfsClientes[posicao]
                + "\nTelefone: " + telefonesClientes[posicao]
                + "\nCEP: " + ceps[posicao]
                + "\nBairro: " + bairros[posicao]
                + "\nRua: " + ruas[posicao]
                + "\nCartao Fidelidade: " + cartaoFidelidade[posicao]
                + "\nQuantidade de pedidos nesse mês" + pedidosPorMes[posicao]
        );
    }

    public void solicitarInformacao(int posicao) {
        nomesClientes[posicao] = JOptionPane.showInputDialog("Digite o seu nome").trim();
        sobrenomesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " " + "Digite o seu sobrenome").trim();
        idadesClientes[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite sua idade"));
        cpfsClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite o seu CPF").trim()
                .replace(".", "").replace("-", "");
        telefonesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite o seu telefone").trim();
        ceps[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite o seu CEP").trim()
                .replace(".", "").replace("-", "");
        bairros[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite o nome seu bairro").trim();
        ruas[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + " "  + "Digite o nome da sua rua").trim();
    }
    
    public void apresentarMenuClientes() {
        int menuClientes = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar"
                + "\n2 - Buscar pelo nome"
                + "\n3 - Buscar pelo CPF"
                + "\n4 - Listar"
                + "\n5 - Editar"
                + "\n6 - Sair"
        ).trim());

        while (menuClientes != 6) {
            switch (menuClientes) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    buscarPeloCPFCliente();
                    break;
                case 3:
                    buscarPeloNomeCliente();
                    break;
                case 4:
                    listar();
                    break;
                case 5:
                    editar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
            }
            menuClientes = Integer.parseInt(JOptionPane.showInputDialog(null,
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
