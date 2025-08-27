package view;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class formulario extends JFrame{
	
	private JLabel lbNome,lbGenero,lbCurte;
	private JTextField txNome;
	private JButton btSalvar;	
	private JRadioButton rbMas, rbFem, rbOutro;
	private JCheckBox checkMusica, checkFilme, checkEsporte;
	private ButtonGroup grupoDeRadioGenero;
	
	public formulario() {
		
		setTitle("Título do formulário");
		setSize(800,600); //x y
		setLocationRelativeTo(null); //centralizado
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setBounds(50,50,80,30); // x y w h
		add(lbNome);
		
		txNome = new JTextField();
		txNome.setBounds(100,50,150,30);
		add(txNome);
		
		lbGenero = new JLabel("Gênero: ");
		lbGenero.setBounds(50, 90, 80, 30);
		add(lbGenero);
		
		rbMas = new JRadioButton();
		rbMas.setText("Masculino");
		rbMas.setBounds(100,90,100,30);
		add(rbMas);
		
		rbFem = new JRadioButton();
		rbFem.setText("Feminino");
		rbFem.setBounds(200,90,100,30);
		add(rbFem);
		
		rbOutro = new JRadioButton();
		rbOutro.setText("Outro");
		rbOutro.setBounds(300,90,100,30);
		add(rbOutro);
		
		grupoDeRadioGenero = new ButtonGroup();
		grupoDeRadioGenero.add(rbMas);
		grupoDeRadioGenero.add(rbFem);
		grupoDeRadioGenero.add(rbOutro);
		
		lbCurte = new JLabel("Gosto de: ");
		lbCurte.setBounds(50, 120, 80, 30);
		add(lbCurte);
		
		checkMusica = new JCheckBox();
		checkMusica.setText("Música");
		checkMusica.setBounds(110,120,80,30);
		add(checkMusica);
		
		checkEsporte = new JCheckBox();
		checkEsporte.setText("Esporte");
		checkEsporte.setBounds(190,120,80,30);
		add(checkEsporte);
		
		checkFilme = new JCheckBox();
		checkFilme.setText("Filme");
		checkFilme.setBounds(270,120,80,30);
		add(checkFilme);
		
		btSalvar = new JButton();
		btSalvar.setText("Salvar");
		btSalvar.setBounds(300,50,100,30);
		add(btSalvar);	
		
		
		btSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = txNome.getText();
				
				String genero = "";
				
				String gosto1 = "";
				String gosto2 = "";
				String gosto3 = "";
				
				//para o JRadioButton
				if(rbMas.isSelected()) {
					genero = rbMas.getText();
				}else if(rbFem.isSelected()) {
					genero = rbFem.getText();
				} else {
					genero = rbOutro.getText();
				}
				
				//para o JCheckBox
				if(checkMusica.isSelected()){
					gosto1 = checkMusica.getText();
				}
				if(checkEsporte.isSelected()) {
					gosto2 = checkEsporte.getText();
				}
				if(checkFilme.isSelected()) {
					gosto3 = checkFilme.getText();
				}
				
				JOptionPane.showMessageDialog(null,"Nome: "+nome);
				JOptionPane.showMessageDialog(null,"Gênero: "+genero);
				JOptionPane.showMessageDialog(null,"Gosta de: "+gosto1+" "+gosto2+" "+gosto3);
				
			}
		});

		
		setVisible(true);// última linha do construtor	
	}


}
