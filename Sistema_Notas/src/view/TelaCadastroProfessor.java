package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class TelaCadastroProfessor implements ActionListener {
    private JFrame frame;
    private JButton cadastrar;
    private JButton voltar;
    public TelaCadastroProfessor() {
        frame = new JFrame();
        ImageIcon iconeWindow = new ImageIcon("assets/img/Universidade Ensino Superior Logo (1).png"); // Corrigido: "\\" para "/"
        //------Criação do Frame-------
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Prime Scholars Academy");
        frame.setSize(350, 750);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0x194A70));
        frame.setIconImage(iconeWindow.getImage());
        //------Criação da Label do Header-------
        JLabel labelHeader = new JLabel();
        ImageIcon iconeHeaderOriginal = new ImageIcon("assets/img/Universidade Ensino Superior Logo (1).png");
        Image iconeRedimensionado = iconeHeaderOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon iconeHeader = new ImageIcon(iconeRedimensionado);
        labelHeader.setBounds(0, 0, 350, 80);
        labelHeader.setIcon(iconeHeader);
        labelHeader.setText("Prime Scholars Academy");
        labelHeader.setFont(new Font("Comic Sans", Font.BOLD, 13));
        labelHeader.setForeground(new Color(0xBC994E));
        labelHeader.setOpaque(true);
        //--Botão de Voltar
        voltar = new JButton("Voltar");
        voltar.setBounds(260, 25, 70, 30);
        voltar.setFocusable(false);
        voltar.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        voltar.setBackground(new Color(0x0A273D));
        voltar.setForeground(Color.white);
        voltar.addActionListener(this);
        //--Label do texto "Cadastro do Professor"
        JLabel labelPerfil = new JLabel("Cadastro do Professor");
        labelPerfil.setBounds(64, 80, 200, 20);
        labelPerfil.setFont(new Font("Comic Sans", Font.BOLD, 18));
        labelPerfil.setForeground(new Color(0xBC994E));
        labelPerfil.setOpaque(true);
        //--Label para fazer a divisória da sessão
        JLabel labelLinha = new JLabel();
        labelLinha.setBounds(10, 105, 310, 3);
        labelLinha.setForeground(new Color(0xBC994E));
        labelLinha.setBackground(new Color(0x0A273D));
        labelLinha.setOpaque(true);
        //--Caixas de texto e labels para o cadastro
        criarCamposDeCadastro();
        
        // Adicionando elementos ao frame
        frame.add(voltar);
        frame.add(labelHeader);
        frame.add(labelPerfil);
        frame.add(labelLinha);
        frame.setVisible(true);
    }
    private void criarCamposDeCadastro() {
        String[][] campos = {
            {"Nome do Professor: ", "10, 145, 310, 30"},
            {"Matricula do Professor: ", "10, 210, 310, 30"},
            {"Formação do Professor: ", "10, 275, 310, 30"},
            {"Endereço do Professor: ", "10, 340, 310, 30"},
            {"Número de Contato: ", "10, 405, 310, 30"},
        };
        for (String[] campo : campos) {
            JLabel labelTitulo = new JLabel(campo[0]);
            labelTitulo.setFont(new Font("Comic Sans", Font.BOLD, 17));
            labelTitulo.setForeground(new Color(0xBC994E));
            labelTitulo.setBounds(Integer.parseInt(campo[1].split(",")[0]), Integer.parseInt(campo[1].split(",")[1]), 200, 30);
            frame.add(labelTitulo);
            JTextField caixa = new JTextField();
            caixa.setBounds(Integer.parseInt(campo[1].split(",")[0]), Integer.parseInt(campo[1].split(",")[1]) + 25, 310, 30);
            caixa.setFont(new Font("Comic Sans", Font.PLAIN, 17));
            frame.add(caixa);
        }
        //--ComboBox para a disciplina ministrada
        JLabel tituloComboBox = new JLabel("Disciplina Ministrada: ");
        tituloComboBox.setFont(new Font("Comic Sans", Font.BOLD, 17));
        tituloComboBox.setForeground(new Color(0xBC994E));
        tituloComboBox.setBounds(20, 445, 180, 30);
        frame.add(tituloComboBox);
        String[] disciplina = {
            "Matemática", "Biologia", "Física", "Química", "História", "Geografia",
            "Artes", "Educação Física", "Língua Inglesa", "Língua Alemã",
            "Língua Francesa", "Língua Portuguesa", "Empreendedorismo"
        };
        JComboBox<String> materia = new JComboBox<>(disciplina);
        materia.setBounds(10, 470, 310, 30);
        frame.add(materia);
        //--Caixa de texto para a senha do professor
        JLabel tituloSenha = new JLabel("Senha: ");
        tituloSenha.setFont(new Font("Comic Sans", Font.BOLD, 17));
        tituloSenha.setForeground(new Color(0xBC994E));
        tituloSenha.setBounds(20, 575, 200, 30);
        frame.add(tituloSenha);
        JPasswordField caixaSenha = new JPasswordField();
        caixaSenha.setBounds(10, 600, 310, 30);
        caixaSenha.setFont(new Font("Comic Sans", Font.PLAIN, 17));
        frame.add(caixaSenha);
        //--Botão de cadastrar
        cadastrar = new JButton("Cadastrar");
        cadastrar.setBounds(100, 650, 140, 40);
        cadastrar.setFocusable(false);
        cadastrar.setFont(new Font("Comic Sans", Font.BOLD, 20));
        cadastrar.setBackground(new Color(0x216700));
        cadastrar.setForeground(Color.white);
        cadastrar.addActionListener(this);
        frame.add(cadastrar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar) {
            frame.dispose();
        }
    }
}