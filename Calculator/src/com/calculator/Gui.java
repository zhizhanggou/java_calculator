package com.calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static com.calculator.SwingConsole.*;
public class Gui extends JFrame{
	private JButton
		b1=new JButton("Button 1"),
		b2=new JButton("Button 2");
	private JTextField txt=new JTextField(10);
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String name=((JButton)e.getSource()).getText();
			txt.setText(name);
		}
	}
	private ButtonListener bl=new ButtonListener();
	public  Gui() {
		b1.addActionListener(bl);
		b2.addActionListener(bl);
		setLayout(new FlowLayout());   
		add(b1);
		add(b2);
		add(txt);
	}
/*	public Gui() {
		setLayout(new FlowLayout());   
		add(b1);
		add(b2);
	}*/
	public static void main(String[] args) {
		run(new Gui(),200,150);
	}

}
