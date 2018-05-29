import javax.swing.JOptionPane;

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

    int atual = 0;

    public void cadastrarCliente() {
        solicitarInformacao(atual);
        atual++;
    }

    public void listar() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomesClientes[i] + " " + sobrenomesClientes[i] + "\nCPF: " + cpfsClientes[i] + "\n";
        }
        if (texto.equals("")) {
            texto += "Não há nenhum cliente informado.";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void buscarPeloNomeCliente() {
        String busca = JOptionPane.showInputDialog("Digite o primeiro nome para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomesClientes[i].contains(busca)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nome não encontrado!");
    }

    public void buscarPeloCPFCliente() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o CPF que deseja buscar").replace(".", "").replace("-", "");

        for (int i = 0; i < atual; i++) {
            if (cpfsClientes[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado!");
    }

    public void editar() {
        String busca = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i < atual; i++) {
            if (nomesClientes[i].equals(busca)) {
                solicitarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nenhum cliente encontrado!");
    }

    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomesClientes[posicao] + " " + sobrenomesClientes[posicao]
                + "\nIdade: " + idadesClientes[posicao]
                + "\nCPF: " + cpfsClientes[posicao]
                + "\nTelefone: " + telefonesClientes[posicao]
                + "\nCEP: " + ceps[posicao]
                + "\nBairro: " + bairros[posicao]
                + "\nRua: " + ruas[posicao]
        );
    }

    public void solicitarInformacao(int posicao) {
        nomesClientes[posicao] = JOptionPane.showInputDialog("Digite o seu nome").trim();
        sobrenomesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o seu sobrenome").trim();
        idadesClientes[posicao] = Integer.parseInt(JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite sua idade"));
        cpfsClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o seu CPF").trim()
                .replace(".", "").replace("-", "");
        telefonesClientes[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o seu telefone").trim();
        ceps[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o seu CEP").trim()
                .replace(".", "").replace("-", "");
        bairros[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o nome do seu bairro").trim();
        ruas[posicao] = JOptionPane.showInputDialog(
                nomesClientes[posicao] + ", " + "Digite o nome da sua rua").trim();
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
                    buscarPeloNomeCliente();
                    break;
                case 3:
                    buscarPeloCPFCliente();
                    break;
                case 4:
                    listar();
                    break;
                case 5:
                    editar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
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
