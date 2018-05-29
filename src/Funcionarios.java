import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Rodrigo
 */
public class Funcionarios {
    
    String[] nomesFuncionarios = new String[100];
    String[] sobrenomesFuncionarios = new String[100];
    int[] idadesFuncionarios = new int[100];
    String[] cpfsFuncionarios = new String[100];
    int[] telefonesFuncionarios = new int[100];
    double[] salariosFuncionarios = new double[100];
    String[] cargoPertenceFuncionarios = new String[100];
    String[] horarioDeTrabalhoFuncionarios = new String[100];
    
    int atual = 0;
    
    public void cadastrarFuncionario() {
        solicitarInformacoes(atual);
        atual++;
        
    } 
    
    public void solicitarInformacoes(int atual) {
        nomesFuncionarios[atual] = JOptionPane.showInputDialog("Informe o nome do funcionário");
        sobrenomesFuncionarios[atual] = JOptionPane.showInputDialog("Informe o sobrenome do funcionário");
        idadesFuncionarios[atual] = Integer.parseInt(JOptionPane.showInputDialog
            ("Informe a idade do funcionário"));
        cpfsFuncionarios[atual] = JOptionPane.showInputDialog("Informe o CPF do funcionário");
        telefonesFuncionarios[atual] = Integer.parseInt(JOptionPane.showInputDialog
            ("Informe o telefone do funcionário"));
        salariosFuncionarios[atual] = Double.parseDouble(JOptionPane.showInputDialog
            ("Informe o salário do funcionário")
                .replace("R", "").replace("$", "").replace(",", "."));
        cargoPertenceFuncionarios[atual] = JOptionPane.showInputDialog("Informe o cargo do funcionário");
        horarioDeTrabalhoFuncionarios[atual] = JOptionPane.showInputDialog
            ("Informe o horário de trabalho do funcionário");
        
    }
    
    public void listarFuncionarios() {
        String texto = "";
        for (int i = 0; i < atual; i++) {
            texto += nomesFuncionarios[i] + " " + sobrenomesFuncionarios[i] + "   " + cpfsFuncionarios[i] + "\n";
        }
        if (texto.equals("")) {
            texto += "Não há nenhum funcionário informado.";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public void buscarPeloNomeDoFuncionario() {
        String busca = JOptionPane.showInputDialog("Digite o primeiro nome para a busca");

        for (int i = 0; i < atual; i++) {
            if (nomesFuncionarios[i].contains(busca)) {
                apresentarInformacao(i);
            }
        }
    }
    
    public void buscarPeloCPFFuncionario() {
        String cpfBuscado = JOptionPane.showInputDialog("Digite o CPF que deseja buscar");

        for (int i = 0; i < atual; i++) {
            if (cpfsFuncionarios[i].equals(cpfBuscado)) {
                apresentarInformacao(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "CPF não encontrado");
    }
    
    public void editar(){
        String busca = JOptionPane.showInputDialog("Digite o nome para editar");
        for (int i = 0; i < atual; i++) {
            if (nomesFuncionarios[i].equals(busca)) {
                solicitarInformacoes(i);
                return;
            }

        }
    }
    
    public void apresentarInformacao(int posicao) {
        JOptionPane.showMessageDialog(null,
                "Nome: " + nomesFuncionarios[posicao] + " " + sobrenomesFuncionarios[posicao]
                + "\nIdade: " + idadesFuncionarios[posicao]
                + "\nCPF: " + cpfsFuncionarios[posicao]
                + "\nTelefone: " + telefonesFuncionarios[posicao]
                + "\nSalário: " + salariosFuncionarios[posicao]
                + "\nCargo: " + cargoPertenceFuncionarios[posicao]
                + "\nHorário de trabalho: " + horarioDeTrabalhoFuncionarios[posicao]
                
        );
    }
    
    public void apresentarMenuFuncionarios() {
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
                    cadastrarFuncionario();
                    break;
                case 2:
                    buscarPeloNomeDoFuncionario();
                    break;
                case 3:
                    buscarPeloCPFFuncionario();
                    break;
                case 4:
                    listarFuncionarios();
                    break;
                case 5:
                    editar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
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
