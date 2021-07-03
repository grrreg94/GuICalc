import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI {
	
	private JFrame frame;
	private JTextArea txtScrn;
	
	String strNum1 = "";
	String strNum2 = "";
	String[] statement;
	int num1 = 0;
	int num2 = 0;
	int total = 0;
	String strTotal = "";
	
	
	//przyciski numerow
	private JButton button0 = new JButton("0");
	private JButton button1 = new JButton("1");
	private JButton button2 = new JButton("2");
	private JButton button3 = new JButton("3");
	private JButton button4 = new JButton("4");
	private JButton button5 = new JButton("5");
	private JButton button6 = new JButton("6");
	private JButton button7 = new JButton("7");
	private JButton button8 = new JButton("8");
	private JButton button9 = new JButton("9");	
	
	//przyciski funkcyjne
	private JButton buttonPLUS = new JButton("+");
	private JButton buttonMINUS = new JButton("-");
	private JButton buttonDEV= new JButton("/");
	private JButton buttonMULT= new JButton("*");
	private JButton buttonEQUALS = new JButton("=");
	
	public GUI()
	{
		//frame
		frame = new JFrame();
		frame.setLayout(null);
		frame.setSize(550,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setVisible(true);
		frame.setResizable(false);
		
		//textArea
		txtScrn = new JTextArea();
		txtScrn.setSize(550,100);
		txtScrn.setLocation(0,5);
		txtScrn.setEditable(false);
		
		//obiekty na kalkulatorze	
				frame.add(txtScrn);
				frame.add(button0);
				frame.add(button1);
				frame.add(button2);
				frame.add(button3);
				frame.add(button4);
				frame.add(button5);
				frame.add(button6);
				frame.add(button7);
				frame.add(button8);
				frame.add(button9);
				frame.add(buttonPLUS);
				frame.add(buttonMINUS);
				frame.add(buttonDEV);
				frame.add(buttonMULT);
				frame.add(buttonEQUALS);
				
				
		//numerki		
				
				
		//bt1
		button0.setSize(50,50);
		button0.setLocation(183,300);
		button0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("0");
				
			}
			
		});
		
		
		//bt2
		button1.setSize(50,50);
		button1.setLocation(130,135);
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("1");
				
			}
			
		});
		
		
		//bt3
		button2.setSize(50,50);
		button2.setLocation(183,135);
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("2");
				
			}
			
		});

		button3.setSize(50,50);
		button3.setLocation(235,135);
		button3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("3");
				
			}
			
		});

		
		//bt4
		button4.setSize(50,50);
		button4.setLocation(130,190);
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("4");
				
			}
			
		});

		
		//bt5
		button5.setSize(50,50);
		button5.setLocation(183,190);
		button5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("5");
				
			}
			
		});

		
		//bt6
		button6.setSize(50,50);
		button6.setLocation(235,190);
		button6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("6");
				
			}
			
		});

		
		//bt7
		button7.setSize(50,50);
		button7.setLocation(130,245);
		button7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("7");
				
			}
			
		});

		
		//bt8
		button8.setSize(50,50);
		button8.setLocation(183,245);
		button8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("8");
				
			}
			
		});
		
		
		//bt39
		button9.setSize(50,50);
		button9.setLocation(235,245);
		button9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("9");
				
			}
			
		});
		
		
		
		
		//funckje
		
		
		//dev
		buttonDEV.setSize(100,50);
		buttonDEV.setLocation(290,135);
		buttonDEV.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("/");
				
			}
			
		});

		
		//mult
		buttonMULT.setSize(100,50);
		buttonMULT.setLocation(290,190);
		buttonMULT.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("*");
				
			}
			
		});

		
		//minus
		buttonMINUS.setSize(100,50);
		buttonMINUS.setLocation(290,245);
		buttonMINUS.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("-");
				
			}
			
		});
		

		//plus
		buttonPLUS.setSize(100,50);
		buttonPLUS.setLocation(290,300);
		buttonPLUS.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				txtScrn.append("+");
				
			}
			
		});

		
		//equals
		buttonEQUALS.setSize(100,215);
		buttonEQUALS.setLocation(395,135);
		buttonEQUALS.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(txtScrn.getText().contains("+"))
				{
					statement = txtScrn.getText().split("\\+");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					total = num1 + num2;
					
					strTotal = Integer.toString(total);
					
					txtScrn.setText(strTotal);
					
				}
				else if(txtScrn.getText().contains("-"))
				{
					statement = txtScrn.getText().split("\\-");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					total = num1 - num2;
					
					strTotal = Integer.toString(total);
					
					txtScrn.setText(strTotal);
					
				}
				else if(txtScrn.getText().contains("/"))
				{
					statement = txtScrn.getText().split("\\/");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					total = num1 / num2;
					
					strTotal = Integer.toString(total);
					
					txtScrn.setText(strTotal);
					
				}
				else if(txtScrn.getText().contains("*"))
				{
					statement = txtScrn.getText().split("\\*");
					
					strNum1 = statement[0];
					strNum2 = statement[1];
					
					num1 = Integer.parseInt(strNum1);
					num2 = Integer.parseInt(strNum2);
					
					total = num1 * num2;
					
					strTotal = Integer.toString(total);
					
					txtScrn.setText(strTotal);
					
				}
				
				
			}
			
		});
	}
	
	public static void main(String[] args) {
		
		new GUI();
	}


}
