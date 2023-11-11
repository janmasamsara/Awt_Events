package AWT;
import java.awt.Button;
import java.awt.Frame;

class Awtone1 extends Frame{
	public Awtone1() 
	{
		setSize(600,600);
		Button b1=new Button("OK");
		Button b2=new Button("CANCEL");
		b1.setBounds(100,100,100,30); //x-axis,y-axis,width,height
		b2.setBounds(100,150,100,30);
		add(b1);
		add(b2);
		setLayout(null);
		setVisible(true);
	}
}
public class Sample {
public static void main(String[] args) {
		new Awtone1();

	}

}
