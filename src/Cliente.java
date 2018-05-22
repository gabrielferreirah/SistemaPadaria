
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 *
 *
 * @author Alunos Carlos Augusto Borges e Gabriel de Oliveira Ferreira.
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
        solicitarInformacaoCliente(atual);
        atual++;
    }

    public void buscarPeloNomeCliente() {
        String busca = JOptionPane.showInputDialog("Digite o nome parcial para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomesClientes[i].contains(busca)) {
                apresentarInformacaoCliente(i);
            }
        }
    }

    public void buscarPeloCPFCliente() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o CPF que deseja buscar");

        for (int i = 0; i < atual; i++) {
            if (cpfsClientes[i].equals(cpfBuscado)) {
                apresentarInformacaoCliente(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }

    public void apresentarInformacaoCliente(int posicao) {
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

    public void solicitarInformacaoCliente(int posicao) {
        nomesClientes[posicao] = JOptionPane.showInputDialog("Digite o seu nome").trim();
        sobrenomesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite o seu sobrenome").trim();
        idadesClientes[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite sua idade"));
        cpfsClientes[posicao] = JOptionPane.
                showInputDialog(nomesClientes[posicao] + "Digite o seu CPF").trim()
                .replace(".", "").replace("-", "");
        telefonesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite o seu telefone").trim();
        ceps[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite o seu CEP").trim()
                .replace(".", "").replace("-", "");
        bairros[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite o nome seu bairro").trim();
        ruas[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + "Digite o nome da sua rua").trim();
    }
}
