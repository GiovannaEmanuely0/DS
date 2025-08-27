package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame {
	
	private JLabel lbEtiqueta;
	private JTextField txInput;
	private JTextField txInput1, txInput2, txInput3, txInput4;
	private double txMedia;
	private JButton btSalvar;
	
	public Formulario() { //Tudo dentro do construtor
		
		setTitle("Formulário de Médias");
		setSize(400,550); // x y
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		getContentPane().setBackground(new Color(255, 222, 33));
		
		//lbEtiqueta = new JLabel();
		//lbEtiqueta.setText("Calcule a sua média ");
		//lbEtiqueta.setBounds(110,-2,200,300);
		//add(lbEtiqueta);
		
		lbEtiqueta = new JLabel();
		lbEtiqueta.setText("Nome: ");
		lbEtiqueta.setBounds(70,30,100,100);
		add(lbEtiqueta);
		
		lbEtiqueta = new JLabel();
		lbEtiqueta.setText("Nota 1: ");
		lbEtiqueta.setBounds(70,100,100,100);
		add(lbEtiqueta);
		
		lbEtiqueta = new JLabel();
		lbEtiqueta.setText("Nota 2: ");
		lbEtiqueta.setBounds(70,150,100,100);
		add(lbEtiqueta);
		
		lbEtiqueta = new JLabel();
		lbEtiqueta.setText("Nota 3: ");
		lbEtiqueta.setBounds(70,200,100,100);
		add(lbEtiqueta);
		
		lbEtiqueta = new JLabel();
		lbEtiqueta.setText("Nota 4: ");
		lbEtiqueta.setBounds(70,250,100,100);
		add(lbEtiqueta);
		
		txInput = new JTextField();
		txInput.setBounds(150,70,150,20);
		add(txInput);
		
		txInput1 = new JTextField();//daqui
		txInput1.setBounds(150,140,150,20);
		add(txInput1);
		
		txInput2 = new JTextField();
		txInput2.setBounds(150,190,150,20);
		add(txInput2);
		
		txInput3 = new JTextField();
		txInput3.setBounds(150,240,150,20);
		add(txInput3);
		
		txInput4 = new JTextField();
		txInput4.setBounds(150,290,150,20);
		add(txInput4);
		
		btSalvar = new JButton();
		btSalvar.setText("Média");
		btSalvar.setBounds(120,350,150,30);
		add(btSalvar);
		
		btSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = (txInput.getText());
				double num1 = Double.parseDouble(txInput1.getText());
				double num2 = Double.parseDouble(txInput2.getText());
				double num3 = Double.parseDouble(txInput3.getText());
				double num4 = Double.parseDouble(txInput4.getText());
				
				txMedia = (num1+num2+num3+num4)/4;
				
				if(txMedia < 6) {
					JOptionPane.showMessageDialog(null,nome+" sua média é: "+txMedia+". Você reprovou! Sinto muito!");
				}else {
					JOptionPane.showMessageDialog(null,nome+" sua média é: "+txMedia+". Você está aprovado! Parabéns!");
				}
				
			}
			
		});
		
		setVisible(true);// última linha do construtor	
		
	}
	
}
