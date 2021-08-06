import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;

	double firstNum;
	double secondNum;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application. (main method)
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//JFrame
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//TextField
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		textDisplay.setHorizontalAlignment(SwingConstants.LEFT);
		textDisplay.setBounds(0, 0, 245, 64);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		//-----------------------ROW 0
		
		//delete button
		JButton btnDel = new JButton("<");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String del = null;
				
				if(textDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length() - 1);
					del = strB.toString();
					textDisplay.setText(del);
				}
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDel.setBounds(5, 65, 55, 55);
		frame.getContentPane().add(btnDel);
		
		//clear button
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(65, 65, 55, 55);
		frame.getContentPane().add(btnClear);
		
		
		//modulus button
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMod.setBounds(124, 65, 58, 55);
		frame.getContentPane().add(btnMod);
		
		
		//plus button
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(185, 65, 55, 55);
		frame.getContentPane().add(btnPlus);
		
		//---------------------ROW 1
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				String EnterName = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(5, 120, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterName = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(65, 120, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(125, 120, 55, 55);
		frame.getContentPane().add(btn9);
		
		//minus button
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(185, 120, 55, 55);
		frame.getContentPane().add(btnMinus);
		
		//-----------------ROW 2
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(5, 175, 55, 55);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(65, 175, 55, 55);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(125, 175, 55, 55);
		frame.getContentPane().add(btn6);
		
		//multiply button
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(185, 175, 55, 55);
		frame.getContentPane().add(btnMultiply);
		
		//---------------------ROW 3
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(5, 230, 55, 55);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterName = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(65, 230, 55, 55);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterName = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(125, 230, 55, 55);
		frame.getContentPane().add(btn3);
		
		//divide button
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(185, 230, 55, 55);
		frame.getContentPane().add(btnDivide);
		
		//-----------------ROW 4
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterName = textDisplay.getText() + btn0.getText();
				textDisplay.setText(EnterName);	
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(5, 285, 55, 55);
		frame.getContentPane().add(btn0);
		
		//decimal button
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!textDisplay.getText().contains("."))
		          {
					textDisplay.setText(textDisplay.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(65, 285, 55, 55);
		frame.getContentPane().add(btnDot);
		
		//continue button no function
		JButton btnCont = new JButton("...");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//do nothing for now
			}
		});
		btnCont.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCont.setBounds(125, 285, 55, 55);
		frame.getContentPane().add(btnCont);
		
		//equals button
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNum = Double.parseDouble(textDisplay.getText());
				
				if(operation == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if(operation == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if(operation == "*") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result); 
					textDisplay.setText(answer);
				}
				
				else if(operation == "/") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result); 
					textDisplay.setText(answer);
				}
				else if(operation == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result); 
					textDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(185, 285, 55, 55);
		frame.getContentPane().add(btnEqual);
	}
}

