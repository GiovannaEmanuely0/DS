package View;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Quiz extends JFrame{

	private JLabel lbPerguntas;
	private JRadioButton p1Radio1,p1Radio2,p1Radio3,p1Radio4;
	private JRadioButton p3Radio1,p3Radio2,p3Radio3,p3Radio4;
	private JRadioButton p5Radio1,p5Radio2,p5Radio3,p5Radio4;
	private JCheckBox p2Radio1, p2Radio2, p2Radio3, p2Radio4;
	private JCheckBox p4Radio1, p4Radio2, p4Radio3, p4Radio4;
	private JCheckBox p6Radio1, p6Radio2, p6Radio3, p6Radio4;
	private ButtonGroup grupoDeRadioGenero;
	private double corretas, erradas;
	private JButton btEnviar;
	String[] perguntasGabarito = new String[6];
	
	public Quiz() {
		String[] pergunta = new String[6];
		
		setTitle("Quiz do Cantor Bruno Mars");
		setSize(900,800); //x y
		setLocationRelativeTo(null); //centralizado
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		pergunta[0] = "1. Qual é o nome verdadeiro do Bruno Mars";
		pergunta[1] = "2. A quais grupos musicais Bruno Mars pertence";
		pergunta[2] = "3. Quem foi a musa que inspirou várias músicas de Bruno Mars";
		pergunta[3] = "4. Quais álbuns lhe renderam mais em questão de vendas e sucesso comercial";
		pergunta[4] = "5. Quem fez o álbum 'Silk Sonic' junto com o Bruno";
		pergunta[5] = "6. Quais desses cantores já cantaram com Bruno Mars";
		
		lbPerguntas = new JLabel();
		lbPerguntas.setText("Quiz da vida do cantor Bruno Mars");
		lbPerguntas.setBounds(50,15,300,40); // x y w h
		add(lbPerguntas);
		
		lbPerguntas = new JLabel(pergunta[0]); //Pergunta 1
		lbPerguntas.setBounds(50,50,300,50);
		add(lbPerguntas);
		
		String[] resposta1 = new String[4];
		
		resposta1[0] = "Bruno Gideon Lightwood";
		resposta1[1] = "Peter Gene Hernandez";
		resposta1[2] = "Bruno Hernandez";
		resposta1[3] = "Peter Gideon Lightwood";
		
		p1Radio1 = new JRadioButton(resposta1[0]);
		p1Radio1.setBounds(50,90,200,30);
		add(p1Radio1);
		p1Radio2 = new JRadioButton(resposta1[1]);
		p1Radio2.setBounds(50,120,200,30);
		add(p1Radio2);
		p1Radio3 = new JRadioButton(resposta1[2]);
		p1Radio3.setBounds(50,150,200,30);
		add(p1Radio3);
		p1Radio4 = new JRadioButton(resposta1[3]);
		p1Radio4.setBounds(50,180,200,30);
		add(p1Radio4);
		
		grupoDeRadioGenero = new ButtonGroup();
		grupoDeRadioGenero.add(p1Radio1);grupoDeRadioGenero.add(p1Radio2);grupoDeRadioGenero.add(p1Radio3);grupoDeRadioGenero.add(p1Radio4);
				
		lbPerguntas = new JLabel(pergunta[1]); //Pergunta 2
		lbPerguntas.setBounds(50,200,350,50);
		add(lbPerguntas);
		
		p2Radio1 = new JCheckBox("Silk Sonic");
		p2Radio1.setBounds(50,235,200,25);
		add(p2Radio1);
		p2Radio2 = new JCheckBox("Destiny Child");
		p2Radio2.setBounds(50,260,200,25);
		add(p2Radio2);
		p2Radio3 = new JCheckBox("The Beatles");
		p2Radio3.setBounds(50,285,200,25);
		add(p2Radio3);
		p2Radio4 = new JCheckBox("The Smeezingtons");
		p2Radio4.setBounds(50,310,200,25);
		add(p2Radio4);
		
		lbPerguntas = new JLabel(pergunta[2]); //Pergunta 3
		lbPerguntas.setBounds(50,340,400,50);
		add(lbPerguntas);
		
		p3Radio1 = new JRadioButton("Cindy Crawford");
		p3Radio1.setBounds(50,380,200,30);
		add(p3Radio1);
		p3Radio2 = new JRadioButton("Jéssica Caban");
		p3Radio2.setBounds(50,410,200,30);
		add(p3Radio2);
		p3Radio3 = new JRadioButton("Scarlett Johansson");
		p3Radio3.setBounds(50,440,200,30);
		add(p3Radio3);
		p3Radio4 = new JRadioButton("Bella Hadid");
		p3Radio4.setBounds(50,470,200,30);
		add(p3Radio4);
		
		grupoDeRadioGenero = new ButtonGroup();
		grupoDeRadioGenero.add(p3Radio1);
		grupoDeRadioGenero.add(p3Radio2);
		grupoDeRadioGenero.add(p3Radio3);
		grupoDeRadioGenero.add(p3Radio4);
				
		lbPerguntas = new JLabel(pergunta[3]); //Pergunta 4
		lbPerguntas.setBounds(50,500,500,50);
		add(lbPerguntas);
		
		p4Radio1 = new JCheckBox("Doo-Wops & Holigans");
		p4Radio1.setBounds(50,535,200,25);
		add(p4Radio1);
		p4Radio2 = new JCheckBox("The lost planet");
		p4Radio2.setBounds(50,560,200,25);
		add(p4Radio2);
		p4Radio3 = new JCheckBox("24K Magic");
		p4Radio3.setBounds(50,585,200,25);
		add(p4Radio3);
		p4Radio4 = new JCheckBox("Who is");
		p4Radio4.setBounds(50,610,200,25);
		add(p4Radio4);
		
		lbPerguntas = new JLabel(pergunta[4]); //Pergunta 5
		lbPerguntas.setBounds(500,50,350,50);
		add(lbPerguntas);
		
		p5Radio1 = new JRadioButton("Beyoncé");
		p5Radio1.setBounds(500,90,200,30);
		add(p5Radio1);
		p5Radio2 = new JRadioButton("Ed Sheram");
		p5Radio2.setBounds(500,120,200,30);
		add(p5Radio2);
		p5Radio3 = new JRadioButton("Anderson Paak");
		p5Radio3.setBounds(500,150,200,30);
		add(p5Radio3);
		p5Radio4 = new JRadioButton("Lady Gaga");
		p5Radio4.setBounds(500,180,200,30);
		add(p5Radio4);
		
		grupoDeRadioGenero = new ButtonGroup();
		grupoDeRadioGenero.add(p5Radio1);
		grupoDeRadioGenero.add(p5Radio2);
		grupoDeRadioGenero.add(p5Radio3);
		grupoDeRadioGenero.add(p5Radio4);
		
		lbPerguntas = new JLabel(); //Pergunta 6
		lbPerguntas.setText(pergunta[5]);
		lbPerguntas.setBounds(500,200,350,50);
		add(lbPerguntas);
		
		p6Radio1 = new JCheckBox("Cardi B");
		p6Radio1.setBounds(500,235,200,25);
		add(p6Radio1);
		p6Radio2 = new JCheckBox("Lana Del Rey");
		p6Radio2.setBounds(500,260,200,25);
		add(p6Radio2);
		p6Radio3 = new JCheckBox("Beyoncé");
		p6Radio3.setBounds(500,285,200,25);
		add(p6Radio3);
		p6Radio4 = new JCheckBox("Elvis Presley");
		p6Radio4.setBounds(500,310,200,25);
		add(p6Radio4);
				
		btEnviar = new JButton();
		btEnviar.setText("Enviar");
		btEnviar.setBounds(400,700,100,25);
		add(btEnviar);
		
		btEnviar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				
				corretas = 0;
				erradas = 0;
				
				gabaritoRadio1();
				gabaritoRadio3();
				gabaritoRadio5();
				gabaritoCheckBox2();
				gabaritoCheckBox4();
				gabaritoCheckBox6();
				
				if(corretas==6) {
					JOptionPane.showMessageDialog(null, "Acertos: "+corretas+". Erros: "+erradas+"\nParabéns! Você acertou tudo!");
				}else if(corretas>2){
					JOptionPane.showMessageDialog(null,  "Acertos: "+corretas+". Erros: "+erradas+"\nFoi Bem, mas poderia ter sido melhor.");
				}else {
					JOptionPane.showMessageDialog(null,  "Acertos: "+corretas+". Erros: "+erradas+"\nQue pena! Você foi muito mal.");
				}
				
				JOptionPane.showMessageDialog(null, perguntasGabarito[0]+"\n "+perguntasGabarito[1]+"\n "+perguntasGabarito[2]+"\n "+
				perguntasGabarito[3]+"\n "+perguntasGabarito[4]+"\n "+perguntasGabarito[5]);
			}
		});
		
		setVisible(true);// última linha do construtor	
		
	}
	//Gabarito:

	//1- B
	//2- A e D
	//3- B
	//4- A e B
	//5- D
	//6- A e B
	
	public void gabaritoRadio1() {
		if(p1Radio2.isSelected()) {
			corretas++;
			perguntasGabarito[0] = "Você acertou a questão 1!";
		}else {
			erradas++;
			perguntasGabarito[0] = "Você errou a questão 1! Alternativa correta: 'B'";
		}
	}
	
	public void gabaritoRadio3() {
		if(p3Radio2.isSelected()) {
			corretas++;
			perguntasGabarito[2] = "Você acertou a questão 3!";
		}else {
			erradas++;
			perguntasGabarito[2] = "Você errou a questão 3! Alternativa correta: 'B'";
		}
	}
	
	public void gabaritoRadio5() {
		if(p5Radio4.isSelected()) {
			corretas++;
			perguntasGabarito[4] = "Você acertou a questão 5!";
		}else {
			erradas++;
			perguntasGabarito[4] = "Você errou a questão 5! Alternativa correta: 'D'";
		}
	}
	
	public void gabaritoCheckBox2() {
		if(p2Radio1.isSelected() && p2Radio4.isSelected()) {
			corretas++;
			perguntasGabarito[1] = "Você acertou a questão 2!";
			
		}else {
			erradas++;
			perguntasGabarito[1] = "Você errou a questão 2! Alternativas corretas: 'A' e 'D'";
		}
	}
	
	public void gabaritoCheckBox4() {
		if(p4Radio1.isSelected() && p4Radio2.isSelected()) {
			corretas++;
			perguntasGabarito[3] = "Você acertou a questão 4!";
		}else {
			erradas++;
			perguntasGabarito[3] = "Você errou a questão 4! Alternativas corretas: 'A' e 'B'";

		}
	}
	
	public void gabaritoCheckBox6(){
		if(p6Radio1.isSelected() && p6Radio2.isSelected()) {
			corretas++;
			perguntasGabarito[5] = "Você acertou a questão 6!";
		}else {
			erradas++;
			perguntasGabarito[5] = "Você errou a questão 6! Alternativas corretas: 'A' e 'B'";
		}
	}

}
