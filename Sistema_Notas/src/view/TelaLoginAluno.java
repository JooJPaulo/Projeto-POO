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

public class TelaLoginAluno implements ActionListener{
	JFrame frame;
	
	JButton cadastrar;
	JButton entrar;
	JButton voltar;
	
	TelaLoginAluno(){
		
		frame = new JFrame();
		
		ImageIcon iconeWindow = new ImageIcon("assets\\img\\Universidade Ensino Superior Logo (1).png");// Icone da Janela
		
		//------Criação do Frame-------
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Prime Scholars Academy");
		frame.setSize(350, 500);
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
		
		//------Criação das sessão Body-------
		
		//-- Imagem de Login
		ImageIcon fotoLoginOriginal = new ImageIcon("assets\\img\\person (1).png");
		Image fotoLoginRedimensionado = fotoLoginOriginal.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
		ImageIcon fotoLogin = new ImageIcon(fotoLoginRedimensionado);
		
		JLabel labelFoto = new JLabel();
		labelFoto.setIcon(fotoLogin);
		labelFoto.setBounds(120, 75, 110, 110);
		labelFoto.setHorizontalAlignment(labelFoto.CENTER);
		labelFoto.setVerticalAlignment(labelFoto.CENTER);
		
		//--Caixa de texto para matricula
		JLabel tituloMatricula = new JLabel();
		tituloMatricula.setText("Matricula do Aluno: ");
		tituloMatricula.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloMatricula.setForeground(new Color(0xBC994E));
		tituloMatricula.setBounds(20, 180, 180, 30);

		JTextField caixaMatricula = new JTextField();
		caixaMatricula.setBounds(10, 205, 310, 30);
		caixaMatricula.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--Label da sessão de senha
		JLabel tituloSenha = new JLabel();
		tituloSenha.setText("Senha: ");
		tituloSenha.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloSenha.setForeground(new Color(0xBC994E));
		tituloSenha.setBounds(20, 245, 180, 30);

		JPasswordField caixaSenha = new JPasswordField();
		caixaSenha.setBounds(10, 275, 310, 30);
		caixaSenha.setFont(new Font("Comic Sans", Font.PLAIN, 17));
		
		//--ComboBox para a série de Formação
		JLabel tituloComboBox = new JLabel();
		tituloComboBox.setText("Selecione a Série: ");
		tituloComboBox.setFont(new Font("Comic Sans", Font.BOLD, 17));
		tituloComboBox.setForeground(new Color(0xBC994E));
		tituloComboBox.setBounds(20, 315, 180, 30);
		
		String[] anos = {"1º ano do Ensiono Médio", "2º ano do Ensino Médio", "3º ano do Ensino Médio"};
						
		JComboBox series = new JComboBox(anos);
		series.setBounds(10, 345, 310, 30);
		
		
		
		//--Botão de cadastrar
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(15, 395, 140, 40);
		cadastrar.setFocusable(false);
		cadastrar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		cadastrar.setBackground(new Color(0xCD4800));
		cadastrar.setForeground(Color.white);
		cadastrar.addActionListener(this);
		
		//Botão de Entrar
		entrar = new JButton("Entrar");
		entrar.setBounds(180, 395, 140, 40);
		entrar.setFocusable(false);
		entrar.setFont(new Font("Comic Sans", Font.BOLD, 20));
		entrar.setBackground(new Color(0x216700));
		entrar.setForeground(Color.white);
		entrar.addActionListener(this);
		
		//--Botão de Voltar
		voltar = new JButton("Voltar");
		voltar.setBounds(260, 25, 70, 30);
		voltar.setFocusable(false);
		voltar.setFont(new Font("Comic Sans", Font.PLAIN, 12));
		voltar.setBackground(new Color(0x0A273D));
		voltar.setForeground(Color.white);
		voltar.addActionListener(this);
		
		
		frame.add(voltar);
		frame.setVisible(true);
		frame.add(labelHeader);
		frame.add(labelFoto);
		frame.add(tituloMatricula);
		frame.add(caixaMatricula);
		frame.add(tituloSenha);
		frame.add(caixaSenha);
		frame.add(tituloComboBox);
		frame.add(series);
		frame.add(cadastrar);
		frame.add(entrar);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == voltar) {
			frame.dispose();
			JanelaLogin janelaLogin = new JanelaLogin();
		}else if(e.getSource() == cadastrar) {
			frame.dispose();
			TelaCadastroAluno cadastroAluno = new TelaCadastroAluno();
		}else if(e.getSource() == entrar) {
			
		}
		
	}

}