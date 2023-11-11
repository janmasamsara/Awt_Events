package AWT;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
class Awtone11 extends Frame{
	public Awtone11() 
		{
			setSize(600,600);
			Button b1=new Button("OK");
			Button b2=new Button("CANCEL");
			TextField t1=new TextField();
			TextField t2=new TextField();
			b1.setBounds(100,100,100,30); //x-axis,y-axis,width,height
			b2.setBounds(220,100,100,30);
			t1.setBounds(100,150,220,30);
			t2.setBounds(100, 200, 220, 30);
			add(b1);
			add(b2);
			add(t1);
			add(t2);
			setLayout(null);
			setVisible(true);
		}
	}
	public class Sample1 {
	public static void main(String[] args) {
			new Awtone11();

		}

	}
