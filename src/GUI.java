import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private int[] liczby = {-1,-1};
	private char znak;
	
	public GUI()
	{
		frame = new JFrame();
		panel = new JPanel();
		
		
		label = new JLabel("0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(120,120,120,120));
		panel.setLayout(new GridLayout());
		
		JButton button0 = new JButton("0");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonPLUS = new JButton("+");
		JButton buttonMINUS = new JButton("-");
		JButton buttonEQUALS = new JButton("=");
		

		
		panel.add(button0);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonPLUS);
		panel.add(buttonMINUS);
		panel.add(buttonEQUALS);
		
		
		button0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("0");
				liczby(0);
			}
		});
		
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("1");
				liczby(1);
			}
		});
		button2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("2");
				liczby(2);
			}
		});
		button3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("3");
				liczby(3);
			}
		});
		button4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("4");
				liczby(4);
			}
		});
		button5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("5");
				liczby(5);
			}
		});
		button6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("6");
				liczby(6);
			}
		});
		button7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("7");
				liczby(7);
			}
		});
		button8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("8");
				liczby(8);
			}
		});
		button9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("9");
				liczby(9);
			}
		});
		buttonPLUS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("+");
				znaki('+');
			}
		});
		buttonMINUS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("-");
				znaki('-');
			}
		});
		buttonEQUALS.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("= " + String.valueOf(sierowna()));
				liczby[0] = -1;
				liczby[1] = -1;
			}
		});
		
		
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.pack();
		frame.setVisible(true);
	}
	
	private void liczby(int liczba)
	{
		if(liczby[0] == -1)
			liczby[0] = liczba;
		else
			liczby[1] = liczba;
	}
	
	private void znaki(char c)
	{
		znak = c;
	}
	private int sierowna()
	{
		if(znak == '+')
		{
			return liczby[0] + liczby[1];
		}
		else 
		{
			return liczby[0] - liczby[1];
		}
		
	}
	
	public static void main(String[] args) {
		
		new GUI();
	}


}
