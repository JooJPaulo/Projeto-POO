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

public class TelaCadastroProfessor implements ActionListener{
	
	JFrame frame;
	JButton cadastrar;
	JButton voltar;
	
	TelaCadastroProfessor(){
		frame = new JFrame();
		
		ImageIcon iconeWindow = new ImageIcon("assets\\img\\Universidade Ensino Superior Logo (1).png");// Icone da Janela
		
		//------Criação do Frame-------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Prime Scholars Academy");
		frame.setSize(350, 750);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(0x194A70));
		frame.setIconImage(iconeWindow.getImage());
		
		//------Criação do da Label do Header-------
		JLabel labelHeader = new JLabel();
		
		ImageIcon iconeHeaderOriginal = new ImageIcon("assets\\img\\Universidade Ensino Superior Logo (1).png");
		Image iconeRedimensionado = iconeHeaderOriginal.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon iconeHeader = new ImageIcon(iconeRedimensionado);
		
		labelHeader.setBounds(0, 0, 350, 80);
		labelHeader.setIcon(iconeHeader);
		labelHeader.setText("Prime Scholars Academy");
		labelHeader.setFont(new Font("Comic Sans", Font.BOLD, 13));
		labelHeader.setForeground(new Color(0xBC994E));
		labelHeader.setBackground(new Color(0x194A70));
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
		JLabel labelPerfil = new JLabel();
		labelPerfil.setText("Cadastro do Professor");
		labelPerfil.setBounds(64, 80, 200, 20);
		labelPerfil.setFont(new Font("Comic Sans", Font.BOLD, 18));
		labelPerfil.setForeground(new Color(0xBC994E));
		labelPerfil.setBackground(new Color(0x194A70));
		labelPerfil.setOpaque(true);
		
		//--Label para fazer a divisória da sessão
		JLabel labelLinha = new JLabel();
		labelLinha.setBounds(10, 105, 310, 3);
		labelLinha.setForeground(new Color(0xBC994E));
		labelLinha.setBackground(new Color(0x0A273D));
		labelLinha.setOpaque(true);
		
		//--Caixa de texto para o nome do professor
		JLabel tituloNome = new JLabel();
		tituloNome.setText("Nome do Professor: ");
		tituloNome.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloNome.setForeground(new Color(0xBC994E));
		tituloNome.setBounds(20, 120, 200, 30);
		
		JTextField caixaNome = new JTextField();
		caixaNome.setBounds(10, 145, 310, 30);
		caixaNome.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--Caixa de texto para o Matricula do professor
		JLabel tituloMatricula = new JLabel();
		tituloMatricula.setText("Matricula do Professor: ");
		tituloMatricula.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloMatricula.setForeground(new Color(0xBC994E));
		tituloMatricula.setBounds(20, 185, 200, 30);
				
		JTextField caixaMatricula = new JTextField();
		caixaMatricula.setBounds(10, 210, 310, 30);
		caixaMatricula.setFont(new Font("Comic Sans", Font.PLAIN, 17));

		//--Caixa de texto para a Formação do professor
		JLabel tituloFormacao = new JLabel();
		tituloFormacao.setText("Formação do Professor: ");
		tituloFormacao.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloFormacao.setForeground(new Color(0xBC994E));
		tituloFormacao.setBounds(20, 250, 200, 30);
				
		JTextField caixaFormacao = new JTextField();
		caixaFormacao.setBounds(10, 275, 310, 30);
		caixaFormacao.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--Caixa de texto para o Endereco do professor
		JLabel tituloEndereco = new JLabel();
		tituloEndereco.setText("Endereço do Professor: ");
		tituloEndereco.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloEndereco.setForeground(new Color(0xBC994E));
		tituloEndereco.setBounds(20, 315, 200, 30);
				
		JTextField caixaEndereco = new JTextField();
		caixaEndereco.setBounds(10, 340, 310, 30);
		caixaEndereco.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--Caixa de texto para o Número de contato do professor
		JLabel tituloNum = new JLabel();
		tituloNum.setText("Número de Contato: ");
		tituloNum.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloNum.setForeground(new Color(0xBC994E));
		tituloNum.setBounds(20, 380, 200, 30);
				
		JTextField caixaNum = new JTextField();
		caixaNum.setBounds(10, 405, 310, 30);
		caixaNum.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--ComboBox para a disciplina ministrada pelo professor
		JLabel tituloComboBox = new JLabel();
		tituloComboBox.setText("Disciplina Ministrada: ");
		tituloComboBox.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloComboBox.setForeground(new Color(0xBC994E));
		tituloComboBox.setBounds(20, 445, 180, 30);
		
		String[] disciplina = {"Matemática", "Biologia", "Física", "Química", "História", "Geografia", "Artes", "Educação Física", 
				"Língua Inglesa", "Língua Alemã", "Língua Francesa", "Língua Portuguesa", "Empreendedorismo"};
						
		JComboBox materia = new JComboBox(disciplina);
		materia.setBounds(10, 470, 310, 30);
		
		//--Caixa de texto para a departamento de filiação do professor
		JLabel tituloComboBox2 = new JLabel();
		tituloComboBox2.setText("Departamento de Filiação: ");
		tituloComboBox2.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloComboBox2.setForeground(new Color(0xBC994E));
		tituloComboBox2.setBounds(20, 510, 200, 30);
		
		String[] departamentos = {"Departamento Acadêmico", "Departamento de Idiomas", "Departamento de Educação Infantil", "Departamento de Educação Internacional", 
								  "Departamento de Artes e Cultura", "Departamento de Educação Física e Saúde", "Departamento de Tecnologia", 
								  "Departamento de Apoio Psicopedagógico", "Administração Escolar"};
						
		JComboBox departamento = new JComboBox(departamentos);
		departamento.setBounds(10, 535, 310, 30);

		
		//--Caixa de texto para a data senha do professor
		JLabel tituloSenha = new JLabel();
		tituloSenha.setText("Senha: ");
		tituloSenha.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloSenha.setForeground(new Color(0xBC994E));
		tituloSenha.setBounds(20, 575, 200, 30);
						
		JPasswordField caixaSenha = new JPasswordField();
		caixaSenha.setBounds(10, 600, 310, 30);
		caixaSenha.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--Botão de cadastrar
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(100, 650, 140, 40);
		cadastrar.setFocusable(false);
		cadastrar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		cadastrar.setBackground(new Color(0x216700));
		cadastrar.setForeground(Color.white);
		cadastrar.addActionListener(this);
		
		
		frame.add(voltar);
		frame.add(labelHeader);
		frame.add(labelPerfil);
		frame.add(labelLinha);
		
		frame.add(tituloNome);
		frame.add(caixaNome);
		
		frame.add(tituloMatricula);
		frame.add(caixaMatricula);
		
		frame.add(tituloFormacao);
		frame.add(caixaFormacao);
		
		frame.add(tituloEndereco);
		frame.add(caixaEndereco);
		
		frame.add(tituloNum);
		frame.add(caixaNum);
		
		frame.add(tituloComboBox);
		frame.add(materia);
		
		frame.add(tituloComboBox2);
		frame.add(departamento);
		
		frame.add(tituloSenha);
		frame.add(caixaSenha);
		
		frame.add(cadastrar);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == voltar) {
			frame.dispose();
			TelaLoginProfessor telaLoginProfessor = new TelaLoginProfessor();
		}
		
	}
}
