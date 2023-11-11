package Events;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class AwtFive extends Frame implements ActionListener{
	Button b1,b2,b3,b4,b5,b6,b7;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public AwtFive() {
		setSize(1000,900);
		l1=new Label("Enter first value");
		l2=new Label("Enter Second value");
		l3=new Label("Result");
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("%");
		b6=new Button("Reset");
		b7=new Button("Exit");
		l1.setBounds(50,100,200,30);
		l2.setBounds(50, 150, 200, 30);
		l3.setBounds(50, 200, 200, 30);
		t1.setBounds(250, 100, 200, 30);
		t2.setBounds(250, 150, 200, 30);
		t3.setBounds(250, 200, 200, 30);
		b1.setBounds(100, 300, 100, 30);
		b2.setBounds(220, 300, 100, 30);
		b3.setBounds(340, 300, 100, 30);
		b4.setBounds(460, 300, 100, 30);
		b5.setBounds(100, 350, 100, 30);
		b6.setBounds(220, 350, 100, 30);
		b7.setBounds(340, 350, 100, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		add(b1);add(b2);
		add(b3); add(b4);
		add(b5);add(b6);add(b7);
		add(l1);add(l2);add(l3);
		add(t1);add(t2);add(t3);
		setLayout(null);
		setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		String data1=t1.getText();
		String data2=t2.getText();
		String result;
		float a,b,c;
		a=Float.parseFloat(data1);
		b=Float.parseFloat(data2);
		if(e.getSource()==b1) 
		{
			c=a+b;
			result=String.valueOf(c);
			t3.setText(result);
		}
		else if(e.getSource()==b2) 
		{
			c=a-b;
			result=String.valueOf(c);
			t3.setText(result);
		}
		else if(e.getSource()==b3) 
		{
			c=a*b;
			result=String.valueOf(c);
			t3.setText(result);
		}
		else if(e.getSource()==b4) 
		{
			c=a/b;
			result=String.valueOf(c);
			t3.setText(result);
		}
		
		else if(e.getSource()==b5) 
		{
			c=a%b;
			result=String.valueOf(c);
			t3.setText(result);
		}
		
		else if(e.getSource()==b6) 
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
		else if(e.getSource()==b7) 
		{
			System.exit(0);
		}
}
}
public class Sample3 {

	public static void main(String[] args) {
		new AwtFive();
	}

}

