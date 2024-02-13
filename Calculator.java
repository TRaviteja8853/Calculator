import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{

	JFrame frame;
	JTextField text;
	JButton[] numB = new JButton[10];
	JButton[] funB = new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
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
		text.setBounds(40, 20, 330, 65);
		text.setFont(myfont);
		text.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("X");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("<=");
		clrButton = new JButton("AC");
		negButton = new JButton("(-)");
		
		funB[0] = addButton;
		funB[1] = subButton;
		funB[2] = mulButton;
		funB[3] = divButton;
		funB[4] = decButton;
		funB[5] = equButton;
		funB[6] = delButton;
		funB[7] = clrButton;
		funB[8] = negButton;				
		
		for (int i=0;i<9;i++) {
			funB[i].addActionListener(this);
			funB[i].setFont(myfont);
			funB[i].setFocusable(false);
		}
		
		for (int i=0;i<10;i++) {
			
			numB[i] = new JButton(String.valueOf(i));
			numB[i].addActionListener(this);
			numB[i].setFont(myfont);
			numB[i].setFocusable(false);
		
		}
		
		negButton.setBounds(50,430,100,50);
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.LIGHT_GRAY);
		
		panel.add(numB[1]);
		panel.add(numB[2]);
		panel.add(numB[3]);
		panel.add(addButton);
		
		panel.add(numB[4]);
		panel.add(numB[5]);
		panel.add(numB[6]);
		panel.add(subButton);
		
		panel.add(numB[7]);
		panel.add(numB[8]);
		panel.add(numB[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numB[0]);
		panel.add(equButton);
		panel.add(divButton); 
		
		
		frame.add(panel);
		frame.add(negButton);
		frame.add(clrButton);
		frame.add(delButton);		
		frame.add(text);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<10;i++) {
			
			if(e.getSource()==numB[i])
				text.setText(text.getText().concat(String.valueOf(i)));
			
		}
		if(e.getSource()==decButton)
			text.setText(text.getText().concat("."));
		
		if(e.getSource()==addButton) {			
			num1 = Double.parseDouble(text.getText());
			op = '+';
			text.setText("");
		}
		if(e.getSource()==subButton) {			
			num1 = Double.parseDouble(text.getText());
			op = '-';
			text.setText("");  
		}
		if(e.getSource()==mulButton) {			
			num1 = Double.parseDouble(text.getText());
			op = '*';
			text.setText("");
		}
		if(e.getSource()==divButton) {			
			num1 = Double.parseDouble(text.getText());
			op = '/';
			text.setText("");
		}
		if(e.getSource()==equButton) {			
			num2 = Double.parseDouble(text.getText());
			
			switch (op) {
			case '+': result = num1 + num2;
				break;
			case '-': result = num1 - num2;
				break;
			case '*': result = num1 * num2;
				break;
			case '/': result = num1 / num2;
				break;

			default:
				break;
			}
			text.setText(String.valueOf(result));
			num1 = result;
			
		}
		if(e.getSource()==clrButton) {
			text.setText("");
		}
		if(e.getSource()==delButton) {
			String string = text.getText();
			text.setText("");
			for(int i=0;i<string.length()-1;i++) {
				text.setText(text.getText()+string.charAt(i));
			}
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(text.getText());
			temp *= -1;
			text.setText(String.valueOf(temp));
		}
		
	}

}
