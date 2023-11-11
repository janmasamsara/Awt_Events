package Swing;
import javax.swing.*;
import java.awt.Frame;
import java.awt.event.*;

class SwingOne extends JFrame implements ActionListener{
	JButton b1,b2,b3;
	//JLabel l1,l2;
	JTextField t1,t2;
	public SwingOne() {
		setSize(500,700);
		b1=new JButton("SHOW");
		b2=new JButton("COPY");
		b3=new JButton("EXIT");
		t1=new JTextField();
		t2=new JTextField();
		b1.setBounds(100, 100, 100, 30);
		b2.setBounds(220, 100, 100, 30);
		b3.setBounds(340,100,100,30);
		t1.setBounds(100, 200, 200, 30);
		t2.setBounds(100, 270, 200, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1); add(b2); add(b3);
		add(t1); add(t2);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			t1.setText("welcome to ganesh");
		}
		else if(e.getSource()==b2)
		{
			String text=t1.getText();
			t2.setText(text);
			
		}
		else if(e.getSource()==b3) 
		{
			System.exit(0);
		}
		
	}
	
}
public class Sample {

	public static void main(String[] args) {
		new SwingOne();

	}

}
