import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{

	JFrame frame;
	JTextField text;
	JButton[] numB = new JButton[10];
	JButton[] funB = new JButton[8];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton;
	JPanel panel;
	
	Font myfont = new Font("Ink free",Font.BOLD,30);
	
	double num1 = 0, num2 = 0, result = 0;
	char op;
	
	public Calculator() {
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		text = new JTextField();
		text.setBounds(40, 20, 330, 50);
		text.setFont(myfont);
		text.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("X");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("delete");
		clrButton = new JButton("clear");
		
		funB[0] = addButton;
		funB[1] = subButton;
		funB[2] = mulButton;
		funB[3] = divButton;
		funB[4] = decButton;
		funB[5] = equButton;
		funB[6] = delButton;
		funB[7] = clrButton;
		
		for (int i = 0; i < 8; i++) {
			funB[i].addActionListener(this);
			funB[i].setFont(myfont);
			funB[i].setFocusable(false);
		}
		
		for (int i = 0; i < 8; i++) {
			numB[i] = 
		}
		
		frame.add(text);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
