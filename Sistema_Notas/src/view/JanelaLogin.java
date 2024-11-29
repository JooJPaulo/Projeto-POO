package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JanelaLogin implements ActionListener {
    private JButton AlunoButton;
    private JButton professorButton;
    private JFrame frame;
    public JanelaLogin() {
        frame = new JFrame();
        ImageIcon iconeWindow = new ImageIcon("assets/img/Universidade Ensino Superior Logo (1).png"); // Corrigido: "\\" para "/"
        //------Criação do Frame-------
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Prime Scholars Academy");
        frame.setSize(350, 500);
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
        labelHeader.setFont(new Font("Comic Sans", Font.BOLD, 18));
        labelHeader.setForeground(new Color(0xBC994E));
        labelHeader.setOpaque(true);
        //------Criação da sessão Body-------
        //--Label do texto "Qual o seu Perfil"
        JLabel labelPerfil = new JLabel("Qual o seu Perfil: ");
        labelPerfil.setBounds(97, 80, 156, 20);
        labelPerfil.setFont(new Font("Comic Sans", Font.BOLD, 18));
        labelPerfil.setForeground(new Color(0xBC994E));
        labelPerfil.setOpaque(true);
        //--Botão do Aluno
        AlunoButton = new JButton();
        ImageIcon iconeAlunoOriginal = new ImageIcon("assets/img/aluna.png");
        Image iconeAlunoRedimensionado = iconeAlunoOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon iconeAluno = new ImageIcon(iconeAlunoRedimensionado);
        AlunoButton.setBounds(97, 110, 156, 150);
        AlunoButton.setBorderPainted(true);
        AlunoButton.setIcon(iconeAluno);
        AlunoButton.setText("Aluno");
        AlunoButton.setFocusable(false);
        AlunoButton.setFont(new Font("Comic Sans", Font.BOLD, 18));
        AlunoButton.setForeground(new Color(0xBC994E));
        AlunoButton.setBackground(new Color(0x0A273D));
        AlunoButton.setHorizontalTextPosition(JButton.CENTER);
        AlunoButton.setVerticalTextPosition(JButton.BOTTOM);
        AlunoButton.addActionListener(this);
        //--Botão do Professor
        professorButton = new JButton();
        ImageIcon iconeProfessorOriginal = new ImageIcon("assets/img/professor.png");
        Image iconeProfessorRedimensionado = iconeProfessorOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        ImageIcon iconeProfessor = new ImageIcon(iconeProfessorRedimensionado);
        professorButton.setBounds(97, 270, 156, 160);
        professorButton.setBorderPainted(true);
        professorButton.setIcon(iconeProfessor);
        professorButton.setText("Professor");
        professorButton.setFocusable(false);
        professorButton.setFont(new Font("Comic Sans", Font.BOLD, 18));
        professorButton.setForeground(new Color(0xBC994E));
        professorButton.setBackground(new Color(0x0A273D));
        professorButton.setHorizontalTextPosition(JButton.CENTER);
        professorButton.setVerticalTextPosition(JButton.BOTTOM);
        professorButton.addActionListener(this);
        // Adicionando elementos ao frame
        frame.add(labelHeader);
        frame.add(labelPerfil);
        frame.add(AlunoButton);
        frame.add(professorButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == AlunoButton) {
            frame.dispose();
            new TelaLoginAluno(); // Instantiating to trigger behavior
        } else if (e.getSource() == professorButton) {
            frame.dispose();
            new TelaLoginProfessor(); // Instantiating to trigger behavior
        }
    }
}