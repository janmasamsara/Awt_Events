package Events;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AwtFour extends Frame implements ActionListener{
	Button b1,b2,b3;
	TextField t1,t2;
	public AwtFour() {
		setSize(700,600);
		b1=new Button("show");
		b2=new Button("copy");
		b3=new Button("Quit");
		t1=new TextField();
		t2=new TextField();
		b1.setBounds(100,100,100,30);
		b2.setBounds(220,100,100,30);
		b3.setBounds(340, 100, 100, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(t1);
		add(t2);
		setLayout(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) 
		{
			t1.setText("welcome to Ganesh computers");
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
public class Sample21 {

	public static void main(String[] args) {
		new AwtFour();
	}

}
