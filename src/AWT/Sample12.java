package AWT;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
class Calculator extends Frame{
	Button b1,b2,b3,b4,b5,b6,b7;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public  Calculator() 
		{
			setSize(600,600);
			l1=new Label("Enter first value");
			l2=new Label("Enter second value");
			l2=new Label("Result");
			TextField t1=new TextField();
			TextField t2=new TextField();
			TextField t3=new TextField();
			 b1=new Button("+");
			 b2=new Button("-");
			 b3=new Button("*");
			 b4=new Button("/");
			 b5=new Button("%");
			 b6=new Button("RESET");
			 b7=new Button("EXIT");
			 l1.setBounds(50,100,200,30);
			 l2.setBounds(50,150,200,30);
			 l3.setBounds(50,200,200,30);
			 t1.setBounds(270, 100, 200, 30);
			 t2.setBounds(270, 150, 200,30);
			 t3.setBounds(270, 200, 200, 30);
			b1.setBounds(100,300,100,30); //x-axis,y-axis,width,height
			b2.setBounds(220,300,100,30);
			b3.setBounds(340,300,100,30);
			b4.setBounds(460,300,100,30);
			b5.setBounds(100,350,100,30);
			b6.setBounds(220,350,100,30);
			b7.setBounds(340,350,100,30);
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			add(b7);
			add(t1);
			add(t2);
			add(t3);
			add(l1);
			add(l2);
			add(l3);
			setLayout(null);
			setVisible(true);
		}
	}
	public class Sample12 {
	public static void main(String[] args) {
			new Calculator();

		}

	}
