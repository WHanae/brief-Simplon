package com.onlineTest.app;

/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Quizz extends JFrame implements ActionListener{
	
	JLabel l;
	JRadioButton jb[]= new JRadioButton[4];

	String[] reponseCorrect= {"Compilé et interpreté", "Object", "commence par une majuscule","oui","oui", "Interface", 
							  ".Class"," aucun des choix", "vrai", "final","this","surchargée","vrai","vrai","vrai", " a=10 b=0 Je suis à l'interieur de finally"};
	
	JButton b1;
	JButton v1;
	ButtonGroup bg;
	int count=0, current=0;	

	JLabel label  = new JLabel("");
	
	
	Quizz(String s){
		super(s);
		l=new JLabel();
		add(l);
		
		bg=new ButtonGroup();
		
		for(int i=0; i< jb.length; i++){
			jb[i]=new JRadioButton();
			System.out.println(jb.length);
			if(i < 2) {
			add(jb[i]);
			jb[i].addActionListener(this);
			bg.add(jb[i]);
			}
			else if(i < 3) {
				add(jb[i]);
				jb[i].addActionListener(this);
				bg.add(jb[i]);
				}
		}
		
		b1=new JButton("Next");
		b1.addActionListener(this);
		add(b1);
		set();
		
		label.setBounds(500, 20, 150, 30);
		add(label); 
		
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		jb[2].setBounds(50,140,100,20);
		b1.setBounds(100,240,100,30);
		
		v1=new JButton("Valider");
		v1.addActionListener(this);
		add(v1);
		set();
		v1.setBounds(300,240,100,30);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
		
	}
	

	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			current++;
			set();	
			//v1.setEnabled(false);
			if(current==4){
				b1.setEnabled(false);
			}

		}
		if(count >= 40) {
			if(e.getSource() == v1) {
				current++;
				set();
				b1.setEnabled(true);
				label.setText("");
				label.setText("Score : "+count);
			}
			if(current== 9) {
				
				System.out.println("current" + current);
				b1.setEnabled(false);
			}
			if(current == 15) {
				System.out.println("current" + current);
				b1.setEnabled(false);
				label.setText("");
				label.setText("Bravo!!!!!!!!!!");
				
			}
		}

		for(int i=0 ; i < reponseCorrect.length; i++) {
			if(e.getActionCommand().equals(reponseCorrect[i])){
				count += 20;
			}
		}
		vider();
		System.out.println(" Score ="+count);
		
		
	}
	
	void set(){

		if(current==0){
			l.setText("Que1: JAVA est un langage");
			jb[0].setText("Compilé"); jb[1].setText("Interprété"); jb[2].setText("Compilé et interpreté");	
		}
		
		if(current==1){
			l.setText("Que2: Toutes les classes héritent de la classe");
			jb[0].setText("Main");jb[1].setText("Object");jb[2].setText("AWT");
		}
	
		if(current==2){
			l.setText("Que3: Par convention une classe");
			jb[0].setText("est en minuscule");jb[1].setText("commence par une majuscule");
			jb[2].setText("est en majuscules");
		}
		
		if(current==3){
			l.setText("Que4: Est-ce que on peut avoir plusieurs constructeurs pour la même classe ");
			jb[0].setText("oui");jb[1].setText("non");jb[2].setText(" ");
		}
		
		if(current==4){
			l.setText("Que5: Dans la ligne public class A implements B\", B est");
			jb[0].setText("oui");jb[1].setText("non");jb[2].setText(" ");	
		}
	

		if(current==5){
			l.setText("Que6: Après la compilation, un programme écrit en\r\n"
					+ "JAVA, il se transforme en programme en bytecode\r\n"
					+ "Quelle est l’extension du programme en\r\n"
					+ "bytecode ?\r\n"
					+ "");
			jb[0].setText("aucun des choix");jb[1].setText(".JAVA");jb[2].setText(".Class");	
		}
		if(current==6){
			l.setText("Que7: Class Test{\r\n"
					+ "Public Test () {\r\n"
					+ "System.out.println(”Bonjour”);}\r\n"
					+ "public Test (int i) {\r\n"
					+ "this();\r\n"
					+ "System.out.println(”Nous sommes en ”+i+ ” !”);};\r\n"
					+ "}\r\n"
					+ "qu’affichera l’instruction suivante?\r\n"
					+ "Test t1=new Test (2018)");
			jb[0].setText("aucun des choix");jb[1].setText("Bonjour Nous sommes en 2018");jb[2].setText("Nous sommes en 2018");
		}
	
		if(current==7){
			l.setText("Que8: Voici un constructeur de la classe Employee, y-at'il un problème Public void Employe(String n) Nom=n");
			jb[0].setText("vrai");jb[1].setText("faux");
		}
		if(current==8){
			l.setText("Que9: Pour spécifier que la variable ne pourra plus être modifiée et doit être initialisée dès sa déclaration,\r\n"
					+ "on la déclare comme une constante avec le mot\r\n"
					+ "réservé\r\n"
					+ "");
			jb[0].setText("aucun des choix");jb[1].setText("final");jb[2].setText(" const");
		}
		
		if(current==9){
			l.setText("Que10: Dans la ligne \"public class A implements B\", B est");
			jb[0].setText("oui");jb[1].setText("non");jb[2].setText(" ");	
		}
		if(current==10){
			l.setText("Que11: Dans une classe, on accède à ses variables grâce au\r\n"
					+ "mot clé\r\n"
					+ "");
			jb[0].setText("aucun choix");jb[1].setText("super");jb[2].setText("const");	
		}
		if(current==11){
			l.setText("Que12: Toutes les classes héritent de la classe");
			jb[0].setText("Main");jb[1].setText("Object");jb[2].setText("AWT");
		}
	
		if(current==12){
			l.setText("Que13: Par convention une classe");
			jb[0].setText("est en minuscule");jb[1].setText("commence par une majuscule");
			jb[2].setText("est en majuscules");
		}
		if(current==13){
			l.setText("Que14:calculerSalaire(int)\r\n"
					+ "calculerSalaire(int, double)\r\n"
					+ "La méthode calculerSalaire est : ");
			jb[0].setText("aucun des choix");jb[1].setText("surchargée");jb[2].setText("redéfinie");
		}
		
		if(current==14){
			l.setText("Que15: Une classe qui contient au moins une méthode\r\n"
					+ "abstraite doit être déclarée abstraite.");
			jb[0].setText("vrai");jb[1].setText("faux");
			
		}
		
		
		l.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
			jb[j].setBounds(50,80+i,200,20);
		}
	
	public void vider() {
		jb[0].setSelected(false);
		jb[1].setSelected(false);
		jb[2].setSelected(false);
	}

	public static void main(String s[]){
		new Quizz("Online Test Of Java");
		
	}

}
